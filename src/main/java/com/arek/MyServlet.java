package com.arek;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> names = Arrays.asList("Szymon", "Jan", "Anna");
        final PrintWriter writer = resp.getWriter();
        Integer counter = new Integer(req.getParameter("counter"));
        resp.setContentType("text/html");
        writer.write("<hl>");

        writer.write("Hello" + req.getParameter("name"));
        writer.write("<ul>");
        names.stream()
                .limit(counter)
                .forEach(e -> writer.write("<li>" + e + "</li>"));
//        names.forEach(e->writer.write("<li>"+e+"</li>"));
        writer.write("</ul>");
        writer.write("</hl>");
//        writer.write(req.getRequestURI());
    }
}