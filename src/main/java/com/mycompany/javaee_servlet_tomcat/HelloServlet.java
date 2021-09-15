package com.mycompany.javaee_servlet_tomcat;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private int count = 0;

    public HelloServlet() {
    }

    public void init() {
        message = "Hello World! This is my JavaEE Servlet project using Tomcat.";

        System.out.println("Servlet Initialized.....value of count is: " + count);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head>");
        out.println("<title>My First Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>Hi Welcome to the world of Servlets</h2>");
        out.println("</body></html>");

        System.out.println("Request Number: " + count + " is received");
        count++;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("Servlet removed from service.....Total visitor count is " + count);
    }

}