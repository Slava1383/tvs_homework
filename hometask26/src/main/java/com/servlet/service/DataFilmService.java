package com.servlet.service;

import com.servlet.dto.Film;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataFilmService {
    @Getter
    private static List<Film> films = new ArrayList<>();

    static {
        films.add(new Film("Film_1", "Description_1", 1985, false));
        films.add(new Film("Film_2", "Description_2", 2007, true));
    }

    public void add(Film film) {
       films.add(film);
   }
   public Film getById(UUID id) {
       var find = films.stream()
               .filter(film -> film.getId().equals(id))
               .findFirst();
       return find.orElseThrow(() -> new RuntimeException("Film not found"));
   }

   public void update(UUID uuid,Film film) {
      for (var item : films) {
          if (item.getId().equals(uuid)) {
              item.setTitle(film.getTitle());
              item.setDescription(film.getDescription());
              item.setYear(film.getYear());
              item.setWatched(film.isWatched());
          }
      }
   }

    public List<Film> getAll() {
        return films;
    }

    public void delete(UUID uuid) {
        Film byId = getById(uuid);
        films.remove(byId);
    }
}
