package by.javaguru;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String name = (String) session.getAttribute("name");
        String age = (String) session.getAttribute("age");
        String email = (String) session.getAttribute("email");
        String login = (String) session.getAttribute("login");

        // Отображение информации о пользователе
        response.setContentType("text/html");
        response.getWriter().println("<h1>User Information</h1>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Age: " + age + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<p>Login: " + login + "</p>");

        // Форма для изменения информации о пользователе
        response.getWriter().println("<h2>Change Information</h2>");
        response.getWriter().println("<form action='regisration.html' method='POST'>");
        response.getWriter().println("<label>New Name:</label><br>");

        response.getWriter().println("<input type='text' name='newName'><br>");
        response.getWriter().println("<input type='submit' value='Update'>");
        response.getWriter().println("</form>");
    }
}
