package productmanagement.controller;


import productmanagement.model.Product;
import productmanagement.service.ProductServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")

public class ProductServlet extends HttpServlet {
    ProductServicelmpl productService = new ProductServicelmpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "remove":
                removeProduct(request, response);
                break;
            default:
                break;

        }
    }

    private void removeProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if (product == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        } else {
            this.productService.remove(id);
        }

    }


    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int amount = Integer.parseInt(request.getParameter("amount"));
        float price = Float.parseFloat(request.getParameter("price"));
        Product product = new Product(id, name, amount, price);
        this.productService.update(id, product);
        if (product == null) {
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        } else {
            product.setName(name);
            product.setAmount(amount);
            product.setPrice(price);
            this.productService.update(id, product);
            request.setAttribute("product", product);
            request.setAttribute("message", "Product information was updated");
            request.getRequestDispatcher("product/edit.jsp").forward(request, response);
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = (int) (Math.random() * 10000);
        String name = request.getParameter("name");
        Integer amount = Integer.parseInt(request.getParameter("amount"));
        Float price = Float.parseFloat(request.getParameter("price"));


        Product product = new Product(id, name, amount, price);
        this.productService.save(product);
        request.setAttribute("message", "New product was created");
        request.getRequestDispatcher("product/edit.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "remove":
                showRomoveForm(request, response);
                break;
            case "view":
                break;
            default:
                listProducts(request, response);
                break;

        }
    }

    private void showRomoveForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/remove.jsp").forward(request, response);
    }


    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/edit.jsp").forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/create.jsp").forward(request, response);
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = this.productService.findAll();
        request.setAttribute("product", products);
        request.getRequestDispatcher("product/list.jsp").forward(request, response);
    }
}
