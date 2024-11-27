package mk.finki.ukim.lab_wp.web;

import mk.finki.ukim.lab_wp.model.Song;
import mk.finki.ukim.lab_wp.service.AlbumService;
import mk.finki.ukim.lab_wp.service.ArtistService;
import mk.finki.ukim.lab_wp.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;
    private final ArtistService artistService;
    private final AlbumService albumService;

    public SongController(SongService songService, ArtistService artistService, AlbumService albumService) {
        this.songService = songService;
        this.artistService=artistService;
        this.albumService=albumService;
    }

    @GetMapping
    public String getSongsPage(@RequestParam(required = false) String error, Model model) {
        model.addAttribute("songs", songService.listSongs());
        model.addAttribute("error", error);
        return "list-songs";
    }

    @PostMapping("/delete/{id}")
    public String deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
        return "redirect:/songs";
    }
    @PostMapping("/add")
    public String saveSong(@RequestParam(required = false) Long id,
                           @RequestParam String title,
                           @RequestParam String genre,
                           @RequestParam int releaseYear,
                           @RequestParam Long album) {

        if (id != null) {
            songService.editSong(id, title, genre, releaseYear, album);
        } else {
            songService.addSong(title, genre, releaseYear, album);
        }

        return "redirect:/songs";
    }

    @GetMapping("/edit-form/{id}")
    public String editSongPage(@PathVariable Long id, Model model) {
        Song song = songService.findByTrackId(id);
        if(song==null){
            return "redirect:/songs?error=NoTrackByThatIdFound";
        }
        model.addAttribute("song", song);
        model.addAttribute("albums", albumService.findAll());
        return "add-song";
    }
    @GetMapping("/edit-form")
    public String addSongPage(@RequestParam(required = false) Long id, Model model) {
        if (id != null) {
            Song song = songService.findByTrackId(id);
            if (song == null) {
                return "redirect:/songs?error=NoTrackByThatIdFound";
            }
            model.addAttribute("song", song);
        }
        model.addAttribute("albums", albumService.findAll());
        return "add-song";
    }



}
