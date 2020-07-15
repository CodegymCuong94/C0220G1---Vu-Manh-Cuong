import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CaculatorServlet", urlPatterns = "/caculator")
public class CaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand = Integer.parseInt(request.getParameter("firstOperand"));
        float secondOperand = Integer.parseInt(request.getParameter("secondOperand"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        float result = caculator.calculate(firstOperand, secondOperand, operator);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/ketqua.jsp").forward(request, response);
//        writer.println("<html>");
//        writer.println("<h1>Result:</h1>");
////        try{
//            float result = caculator.calculate(firstOperand, secondOperand, operator);
//            writer.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
////        }catch (Exception ex){
////            writer.println("Error: " + ex.getMessage());
////        }
//        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
