package mk.finki.ukim.lab_wp.service;

import mk.finki.ukim.lab_wp.model.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> listArtists();
    Artist ArtistfindById(Long id);
}
