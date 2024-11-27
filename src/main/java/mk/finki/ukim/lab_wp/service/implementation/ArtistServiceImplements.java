package mk.finki.ukim.lab_wp.service.implementation;

import mk.finki.ukim.lab_wp.model.Artist;
import mk.finki.ukim.lab_wp.repository.ArtistRepository;
import mk.finki.ukim.lab_wp.service.ArtistService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ArtistServiceImplements implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImplements(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist ArtistfindById(Long id) {
        return artistRepository.findById(id);
    }


}
