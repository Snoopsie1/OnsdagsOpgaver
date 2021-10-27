package com.example.onsdagsopgave;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Eyyyyyyy Welcome";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String navn = request.getParameter("name");
        String password1 = request.getParameter("pass1");
        String password2 = request.getParameter("pass2");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        if (password1.equals(password2)) {
//            message = message + " " + navn;
            // Succesful login

//            out.println("<html><body>");
//            out.println("<h1>" + message + "</h1>");
//            out.println("</body></html>");

            String name = request.getParameter("name");

            request.setAttribute("name", name);

            request.getRequestDispatcher("WEB-INF/Bruger.jsp").forward(request, response);
        } else {
//            message = "Your passwords aren't the same.. Try again";
//            // Unsuccesful login
//            out.println("<html><body>");
//            out.println("<h1>" + message + "</h1>");
//            out.println("</body></html>");

            String passWarning = "Your passwords aren't the same... Try again";

            request.setAttribute("passWarning", passWarning);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    public void destroy() {
    }
}