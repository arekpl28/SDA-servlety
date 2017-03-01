package home.work;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> name = Arrays.asList("Arek", "Anna", "Magda", "Ola", "Ula", "Zosia");
        PrintWriter writer = resp.getWriter();
        Integer counter = new Integer(req.getParameter("counter"));
        resp.setContentType("text/html");
        writer.write("<h1>");
        writer.write("<ul>");
        name.stream()
                .limit(counter)
                .forEach(e -> writer.write("<li>" + e + "<li>"));
        writer.write("</ul>");
        writer.write("</h1>");
    }
}
