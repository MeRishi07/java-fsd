package com.source;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;


@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
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

            // Set session cookie
            Cookie sessionCookie = new Cookie("session", session.getId());
            sessionCookie.setMaxAge(-1); // Cookie will be valid for the duration of the browser session
            response.addCookie(sessionCookie);

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