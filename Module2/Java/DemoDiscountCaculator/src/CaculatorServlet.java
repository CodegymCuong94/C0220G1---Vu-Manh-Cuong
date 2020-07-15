import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculatorServlet", urlPatterns = "/Caculator")
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount"));
        float discount = (float) (price * discount_percent * 0.01);
        float total = price - discount;
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<hl>Product Description" + description + "<br>");
//        writer.println("<hl>Product Price" + price +"<br>");
//        writer.println("<hl>Product Discount Percent" + discount_percent+"<br>");
//        writer.println("<hl>Product Discount " + discount+"<br>");
//        writer.println("<hl>Product Discount Total" + total+"<br>");
//        writer.println("</html>");
        request.setAttribute("total", total);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
