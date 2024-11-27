package mk.finki.ukim.lab_wp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Song {

    private Long id;
    String title;
    String genre;
    int releaseYear;

    private List<Artist> performers;
    private Album album;

    public Song(String title, String genre, int releaseYear, Album album) {
        this.id = (long) (Math.random() * 1000);
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        performers = new ArrayList<>();
        this.album = album;
    }

    public Song(Long id, String title, String genre, int releaseYear, Album album) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        performers = new ArrayList<>();
        this.album = album;
    }


}
