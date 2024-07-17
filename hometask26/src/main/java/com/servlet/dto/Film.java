package com.servlet.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@Getter @Setter
public class Film {
    private UUID id;
    private String title;
    private String description;
    private int year;
    private boolean watched;

    public Film(String title, String description, int year, boolean watched) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.year = year;
        this.watched = watched;
    }
}

