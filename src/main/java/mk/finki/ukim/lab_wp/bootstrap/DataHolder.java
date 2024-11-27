package mk.finki.ukim.lab_wp.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.lab_wp.model.Album;
import mk.finki.ukim.lab_wp.model.Artist;
import mk.finki.ukim.lab_wp.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList=new ArrayList<>();
    public static List<Song> songs=new ArrayList<>();
    public  static List<Album> albums=new ArrayList<>();

    @PostConstruct
    public void init(){
        Album album1=new Album("album1","genre1","2020");
        Album album2=new Album("album2","genre2","2021");
        Album album3=new Album("album3","genre3","2022");
        Album album4=new Album("album4","genre4","2023");
        Album album5=new Album("album5","genre5","2024");
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        albums.add(album4);
        albums.add(album5);
        artistList.add(new Artist("name1","lastName1","Biography1"));
        artistList.add(new Artist("name2","lastName2","Biography2"));
        artistList.add(new Artist("name3","lastName3","Biography3"));
        artistList.add(new Artist("name4","lastName4","Biography4"));
        artistList.add(new Artist("name5","lastName5","Biography5"));
        songs.add(new Song("songname1","genre1",2020,album1));
        songs.add(new Song("songname2","genre2",2021,album2));
        songs.add(new Song("songname3","genre3",2022,album3));
        songs.add(new Song("songname4","genre4",2023,album4));
        songs.add(new Song("songname5","genre5",2024,album5));
    }
}
