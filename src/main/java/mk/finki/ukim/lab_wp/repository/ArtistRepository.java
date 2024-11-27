package mk.finki.ukim.lab_wp.repository;


import mk.finki.ukim.lab_wp.bootstrap.DataHolder;
import mk.finki.ukim.lab_wp.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtistRepository {
    public List<Artist> findAll(){
        return DataHolder.artistList;
    }
    public Artist findById(Long id){
        return DataHolder.artistList.stream()
                .filter(a-> a.getId().equals(id)).findFirst().get();
    }
}
