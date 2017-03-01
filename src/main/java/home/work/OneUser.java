package home.work;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class OneUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> name = Arrays.asList("Arek", "Anna", "Magda", "Ola", "Ula", "Zosia");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        String requestURI = req.getRequestURI();
        Integer index = new Integer(requestURI.substring(requestURI.lastIndexOf("/") + 1));
        writer.write("<h1>" + name.get(index) + "</h1>");
    }
}
