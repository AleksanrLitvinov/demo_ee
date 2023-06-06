package ru.maxima;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "getCookiesServlet", value = "/get-cookies-servlet")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Cookie[] cookies = req.getCookies();

       if (cookies == null){
           req.getRequestDispatcher("/error.jsp").forward(req, resp);
       } else {
           PrintWriter pw = resp.getWriter();

           pw.println("<html>");

           for (Cookie c : cookies) {
               pw.println("<h1>" + c.getName() + " " + c.getValue() + "</h1>");
           }
           pw.println("</html>");
       }


    }
}