package mk.finki.ukim.lab_wp.repository;

import mk.finki.ukim.lab_wp.bootstrap.DataHolder;
import mk.finki.ukim.lab_wp.model.Album;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlbumRepository {
    public List<Album> findAll(){
        return DataHolder.albums;

    }
    public Album getById(Long id){
        return DataHolder.albums.stream().filter(a->a.getId().equals(id)).findFirst().get();
    }
}
