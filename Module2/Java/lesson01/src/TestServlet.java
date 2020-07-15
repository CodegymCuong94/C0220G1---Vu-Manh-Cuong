import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends HttpServlet {
    //doPost chỉ được gọi bằng thẻ form action
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //doGet được gọi thông qua nhập địa chỉ URL hoặc thẻ form action
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "Chào mừng đến với codegym";
        //Đẩy dữ liệu qua jsp
        request.setAttribute("msg", msg);
        //Điều hướng đường dẫn qua địa chỉ message.jsp
        request.getRequestDispatcher("message.jsp").forward(request, response);
    }

}
