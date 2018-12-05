package com.deus.songapp.controller;

import com.deus.songapp.dto.SongDto;
import com.deus.songapp.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/customers/{id}")
    public SongDto getSongById(@PathVariable Long id) {
        return songService.getSongById(id);
    }
    @GetMapping("/customers")
    public List<SongDto> getAllSongs(Pageable pageable) {
        return songService.getAllSongs(pageable);
    }
    @PostMapping("/customers")
    public void saveUser(@RequestBody SongDto songDto) {
        songService.saveSong(songDto);
    }
}