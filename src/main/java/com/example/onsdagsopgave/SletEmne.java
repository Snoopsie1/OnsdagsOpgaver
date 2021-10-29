package com.example.onsdagsopgave;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "SletEmne", value = "/SletEmne")
public class SletEmne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String s = request.getParameter("emne");
        HttpSession session = request.getSession();
        List<String> stringList = (List<String>) session.getAttribute("emneListe");
        String msg;

        if(stringList == null)
        {
            msg = "List is empty!";
            session.setAttribute("msg", msg);
            request.getRequestDispatcher("WEB-INF/Bruger.jsp").forward(request, response);
        }

        if (stringList.contains(s)) {
            stringList.remove(s);

            session.setAttribute("emneListe", stringList);
            msg = s + " was succesfully removed!";
            session.setAttribute("msg", msg);
            request.getRequestDispatcher("WEB-INF/Bruger.jsp").forward(request, response);

        } else {
            msg = s + " doesn't exist on your huskeseddel";
            session.setAttribute("msg", msg);
            request.getRequestDispatcher("WEB-INF/Bruger.jsp").forward(request, response);
        }


    }
}
