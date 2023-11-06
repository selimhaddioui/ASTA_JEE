package fr.efrei2023.asta.projet_asta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import fr.efrei2023.asta.projet_asta.servlet.authentication.ServletRequireUser;

import static fr.efrei2023.asta.projet_asta.utils.AstaConstants.User.*;

@WebServlet(name = SERVLET_NAME, value = SERVLET_PATH)
public class UserServlet extends ServletRequireUser {
    @Override
    public void processUserRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        UserModel user = new UserModel(getSessionUser().getFirstName(), getSessionUser().getLastName());
        String userJson = new ObjectMapper().writeValueAsString(user);
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print(userJson);
        out.flush();
        response.setStatus(HttpServletResponse.SC_OK);
    }

    private record UserModel(String firstName, String lastName) {
    }
}
