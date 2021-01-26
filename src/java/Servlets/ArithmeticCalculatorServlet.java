/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        request.getRequestDispatcher("WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "";
        String operation = request.getParameter("operation");
        int first;
        int second;

        try {
            first = Integer.parseInt(request.getParameter("first"));
            second = Integer.parseInt(request.getParameter("second"));

            request.setAttribute("first", first);
            request.setAttribute("second", second);

            if (operation == null || operation.equals("")) {
                result = "Invalid";
            } else {
                switch (operation) {
                    case "+":
                        result = first + second + "";
                        break;

                    case "-":
                        result = first - second + "";
                        break;

                    case "*":
                        result = first * second + "";
                        break;

                    case "%":
                        if (first != 0 && second != 0) {
                            result = first % second + "";
                        } else {
                            result = "Invalid";
                        }
                        break;

                }
            }

        } catch (Exception e) {
            result = "Invalid";
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

}
