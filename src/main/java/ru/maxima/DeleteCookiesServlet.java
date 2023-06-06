package ru.maxima;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//        Создать 3 сервлета, как на уроке с выдачей кукис, печатью кукис и удалением.
//        Обработать ошибку , если кукис нет, выдавать html-страницу с информацией о том,
//        что у вас кукис нет, нажмите, чтобы получить и выдавать ссылку на получение кукис,
//        которая будет вести на страницу http://localhost:8080/get-cookies-servlet
@WebServlet(name = "deleteCookiesServlet", value = "/delete-cookies-servlet")
public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("jsessionid", "7777777");
        Cookie cookie2 = new Cookie("jsessionsName", "Viktor");
        cookie1.setMaxAge(0);
        cookie2.setMaxAge(0);


        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        req.getRequestDispatcher("/get-cookies-servlet").forward(req, resp);
    }
}
