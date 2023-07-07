package com.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@WebServlet("/LoggingFilter")
public class LoggingFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURL = httpRequest.getRequestURL().toString();
        String method = httpRequest.getMethod();
        String remoteAddress = httpRequest.getRemoteAddr();

        System.out.println("Request received: " + method + " " + requestURL + " from " + remoteAddress);

        // Pass the request along the filter chain
        chain.doFilter(request, response);
    }

    public void destroy() {
        // Cleanup code if needed
    }
}