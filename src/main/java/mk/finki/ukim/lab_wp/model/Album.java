package mk.finki.ukim.lab_wp.model;

import lombok.Data;

@Data
public class Album {
    private Long id;
    private String name;
    private String genre;
    private String year;

    public Album(String name, String genre, String year) {
        this.id=(long)(Math.random()*1000);
        this.name=name;
        this.genre=genre;
        this.year=year;
    }
}
