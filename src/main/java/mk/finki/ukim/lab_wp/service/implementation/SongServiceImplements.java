package mk.finki.ukim.lab_wp.service.implementation;

import mk.finki.ukim.lab_wp.model.Artist;
import mk.finki.ukim.lab_wp.model.Song;
import mk.finki.ukim.lab_wp.repository.AlbumRepository;
import mk.finki.ukim.lab_wp.repository.ArtistRepository;
import mk.finki.ukim.lab_wp.repository.SongRepository;
import mk.finki.ukim.lab_wp.service.ArtistService;
import mk.finki.ukim.lab_wp.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImplements implements SongService, ArtistService{
    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;
    private final AlbumRepository albumRepository;

    public SongServiceImplements(ArtistRepository artistRepository, SongRepository songRepository, AlbumRepository albumRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
        this.albumRepository=albumRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist ArtistfindById(Long id) {
        return artistRepository.findById(id);
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist, song);
    }

    @Override
    public Song findByTrackId(Long trackId) {
        return songRepository.findByTrackId(trackId);
    }

    @Override
    public List<Song> searchByText(String text) {
        return songRepository.searchByText(text);
    }

    @Override
    public void deleteSong(Long id) {
        songRepository.delete(id);
    }

    @Override
    public void updateSong(Long id, Song song) {
        songRepository.update(id, song);
    }

    @Override
    public Song addSong(String title, String genre, int releaseYear, Long album) {
        return songRepository.addSong(title, genre, releaseYear, albumRepository.getById(album));
    }

    @Override
    public Song editSong(Long id, String title, String genre, int releaseYear, Long album) {
        return songRepository.editSong(id, title, genre, releaseYear, albumRepository.getById(album));
    }
}

