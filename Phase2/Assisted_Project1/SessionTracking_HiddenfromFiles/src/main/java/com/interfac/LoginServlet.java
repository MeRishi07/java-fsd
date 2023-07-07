package com.interfac;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate the login credentials (e.g., against a database)
        boolean isValidLogin = validateLogin(username, password);

        if (isValidLogin) {
            // Create a new session
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);

            response.sendRedirect("dashboard.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }
    }

    private boolean validateLogin(String username, String password) {
        // Implement your login validation logic here
        // Return true if the login is valid, false otherwise
        // This is just a placeholder method
        return username.equals("admin") && password.equals("password");
    }
}
