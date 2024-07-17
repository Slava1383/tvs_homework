package com.servlet;

import com.servlet.dto.Film;
import com.servlet.service.FilmService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;

@WebServlet("/update")
public class UpdateFilmServlet extends HttpServlet {

    private FilmService service = new FilmService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        UUID uuid = UUID.fromString(id);

        Film film = service.getById(uuid);
        req.setAttribute("film", film);
        req.getRequestDispatcher("/WEB-INF/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        int year = Integer.parseInt(req.getParameter("year"));
        boolean watched = Boolean.parseBoolean(req.getParameter("watched"));
        UUID uuid = UUID.fromString(req.getParameter("id"));
        Film film = new Film(title, description, year, watched);
        service.update(uuid, film);
        resp.sendRedirect("/");

    }
}
