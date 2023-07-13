package com.EmployeeInfo;

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDao")
public class EmployeeDao extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empname = request.getParameter("txtempname");
        float salary = Float.parseFloat(request.getParameter("txtsalary"));

        Employee emp = new Employee();
        emp.setEmpname(empname);
        emp.setSalary(salary);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        int i = (Integer) session.save(emp);
        session.getTransaction().commit();

        PrintWriter out = response.getWriter();
        if (i > 0)
            out.println("Record inserted");
        else
            out.println("Record not inserted");
    }
}
