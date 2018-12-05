package com.deus.songapp.service;

import com.deus.songapp.converter.SongConverter;
import com.deus.songapp.dto.SongDto;
import com.deus.songapp.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongService {
    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public SongDto getSongById(Long id) {
        return SongConverter.entityToDto(songRepository.findOne(id));
    }
    public void saveSong(SongDto songDto) {
        songRepository.save(SongConverter.dtoToEntity(songDto));
    }
    public List<SongDto> getAllSongs(Pageable pageable) {
        return songRepository.findAll(pageable).getContent().stream().map(SongConverter::entityToDto).collect(Collectors.toList());
    }
}