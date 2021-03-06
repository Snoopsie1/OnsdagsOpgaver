package com.example.onsdagsopgave;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddSubject", value = "/AddSubject")
public class AddSubject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String emne = request.getParameter("emne");
        log("emnet er: " + emne);

        HttpSession session = request.getSession();

        List<String> emneListe = (List<String>) session.getAttribute("emneListe");

        if (emneListe == null)
        {
            emneListe = new ArrayList<>();
        }

        ServletContext servletContext = request.getServletContext();
        List<String> alleEmner = (List<String>) servletContext.getAttribute("alleEmner");

        if (alleEmner == null)
        {
            alleEmner = new ArrayList<>();
        }

        alleEmner.add(emne);

        emneListe.add(emne);

        servletContext.setAttribute("alleEmner", alleEmner);

        session.setAttribute("emneListe", emneListe);

        request.getRequestDispatcher("WEB-INF/Bruger.jsp").forward(request, response);
    }
}
