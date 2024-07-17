package com.servlet;

import com.servlet.dto.Film;
import com.servlet.service.FilmService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class HomeServlet extends HttpServlet {

    FilmService service = new FilmService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        var films = service.getAll();
        req.setAttribute("films", films);

        req.getRequestDispatcher("/WEB-INF/films.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title = req.getParameter("title");
        String description = req.getParameter("description");
        int year = Integer.parseInt(req.getParameter("year"));
        boolean watched = Boolean.parseBoolean(req.getParameter("watched"));

        Film film = new Film(title, description, year, watched);
        service.add(film);

        resp.sendRedirect("/");

    }
}
