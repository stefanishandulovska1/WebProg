package mk.finki.ukim.lab_wp.service.implementation;

import mk.finki.ukim.lab_wp.model.Album;
import mk.finki.ukim.lab_wp.repository.AlbumRepository;
import mk.finki.ukim.lab_wp.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImplements implements AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumServiceImplements(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }
}
