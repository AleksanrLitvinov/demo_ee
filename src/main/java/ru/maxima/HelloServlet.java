package ru.maxima;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
        } else {
            session.setAttribute("count", count + 1);
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Count = " + (Integer) session.getAttribute("count") +"</h1>");
        out.println("</body></html>");


//       String name = req.getParameter("name");
//       String surname = req.getParameter("surname");
//
//        resp.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = resp.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + name + " " + surname +"</h1>");
//        out.println("</body></html>");


    }
}
