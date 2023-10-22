package fr.efrei2023.asta.projet_asta.controller;

import java.io.*;

import fr.efrei2023.asta.projet_asta.model.User;
import fr.efrei2023.asta.projet_asta.service.ISignInService;
import fr.efrei2023.asta.projet_asta.service.SignInService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {

    private ISignInService _signInService;

    public void init() {
        _signInService = new SignInService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect(request.getContextPath() + "/any-secure");
        } else {
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = _signInService.signIn(request.getParameter("fieldLogin"), request.getParameter("fieldPassword"));
        if (user == null) {
            request.setAttribute("errorMessage", "Mot de passe ou login incorrect.");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

        } else {
            request.getSession().setAttribute("user", user);
            response.sendRedirect(request.getContextPath() + "/any-secure");
        }
    }
}