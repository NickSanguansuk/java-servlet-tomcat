package com.company.javaee_servlet_tomcat;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private int count = 0;

    public HelloServlet() {
    }

    @Override
    public void init() throws ServletException {
        message = "Hello World! This is my JavaEE Servlet project using Tomcat.";

        System.out.println("Servlet Initialized.....value of count is: " + count);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
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

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //doGet(request, response);

        String usernameReal = "WasinSanguansuk";
        String passwordReal = "MySuperSecret";
        String usernameIn = request.getParameter("username");
        String passwordIn = request.getParameter("password");

        if (usernameReal.equals(usernameIn) && passwordReal.equals(passwordIn)) {
            request.setAttribute("username", usernameIn);
            request.setAttribute("password", passwordIn);
            RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
            rd.forward(request, response);
        } else {
            request.setAttribute("username", usernameIn);
            request.setAttribute("password", passwordIn);
            RequestDispatcher rd = request.getRequestDispatcher("/failure.jsp");
            rd.forward(request, response);
        }

        //response.setContentType("text/html");
        //PrintWriter pw = response.getWriter();
        //pw.print("<html><head>");
        //pw.print("<title>Welcome to the Web World</title>");
        //pw.println("</head>");
        //pw.println("<body>");
        //pw.println("<h2>username is: " + usernameIn + "</h2>\n");
        //pw.println("<h2>password is: " + passwordIn + "</h2>\n");
        //pw.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet removed from service.....Total visitor count is " + count);
    }

}