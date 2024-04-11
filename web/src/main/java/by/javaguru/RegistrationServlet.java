package by.javaguru;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/registrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        session.setAttribute("name", name);
        session.setAttribute("age", age);
        session.setAttribute("email", email);
        session.setAttribute("login", login);
        session.setAttribute("password", password);

        response.getWriter().println("User registered successfully!");

        response.setContentType("text/html");
        response.getWriter().println("<h1>User Information</h1>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Age: " + age + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<p>Login: " + login + "</p>");
        response.getWriter().println("<a href=\"menu.html\">go to menu page</a>");

    }
}

