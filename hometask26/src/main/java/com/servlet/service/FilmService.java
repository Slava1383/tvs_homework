package com.servlet.service;

import com.servlet.dto.Film;

import java.util.List;
import java.util.UUID;

public class FilmService {

    DataFilmService service = new DataFilmService();

    public void add(Film film) {
        service.add(film);
    }

    public List<Film> getAll() {

        return service.getAll();

    }

    public Film getById(UUID uuid) {
        return service.getById(uuid);
    }

    public void update(UUID uuid, Film film) {
        service.update(uuid, film);
    }

    public void delete(UUID uuid) {
        service.delete(uuid);
    }
}
