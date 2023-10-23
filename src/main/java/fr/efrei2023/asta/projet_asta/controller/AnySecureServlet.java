package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "AnySecureServlet", value = "/any-secure")
public class AnySecureServlet extends SecuredServlet {
    private String message;

    public void init() {
        message = "Bonjour";
    }

    public void doSecureGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + " " + super.getAuthenticatedUser().getFirstName() + " " + super.getAuthenticatedUser().getLastName() + "</h1>");
        out.println("</body></html>");
    }
}