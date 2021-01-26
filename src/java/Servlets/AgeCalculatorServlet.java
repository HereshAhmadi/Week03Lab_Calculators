package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String message = "";
        String ageStr = request.getParameter("age");
        int age;
        
        try {
             age = Integer.parseInt(request.getParameter("age"));
             message = "Your age next birthday will be " + ++age;
        } catch (Exception e) {
            message = "You must enter a number";
        }
        
        

        if (ageStr == null || ageStr.equals("")) {
            message = "You must give your current age";

        }
         
        request.setAttribute("message", message);
        request.getRequestDispatcher("WEB-INF/ageCalculator.jsp").forward(request, response);
    }

}
