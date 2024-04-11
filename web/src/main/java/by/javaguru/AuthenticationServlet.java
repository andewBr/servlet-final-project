package by.javaguru;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        boolean userExists = checkUser(login, password);

        if (userExists) {
            response.sendRedirect("menu.html");
        } else {
            response.getWriter().println("User not found!");
        }
    }

    private boolean checkUser(String login, String password) {
        // немогу придумать хорошую проверку
        return true;
    }
}
