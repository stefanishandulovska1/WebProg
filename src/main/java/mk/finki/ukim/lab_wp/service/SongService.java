package mk.finki.ukim.lab_wp.service;

import mk.finki.ukim.lab_wp.model.Artist;
import mk.finki.ukim.lab_wp.model.Song;

import java.util.List;

public interface SongService {
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    Song findByTrackId(Long trackId);
    List<Song> searchByText(String text);

    void deleteSong(Long id);

    void updateSong(Long id, Song song);
    Song addSong(String title, String genre, int releaseYear, Long Id);

    Song editSong(Long id, String title, String genre, int releaseYear, Long album);
}
