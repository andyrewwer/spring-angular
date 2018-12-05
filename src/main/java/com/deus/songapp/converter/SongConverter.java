package com.deus.songapp.converter;


import com.deus.songapp.dto.SongDto;
import com.deus.songapp.entity.Song;

import java.util.stream.Collectors;

public class SongConverter {
    public static Song dtoToEntity(SongDto songDto) {
        return new Song(songDto.getUserId(),
                songDto.getSongName(),
                songDto.getSlideDtos().stream().map(SlideConverter::dtoToEntity).collect(Collectors.toList()));
    }
    public static SongDto entityToDto(Song song) {
        return new SongDto(song.getId(),
                song.getSongName(),
                song.getSlides().stream().map(SlideConverter::entityToDto).collect(Collectors.toList()));
    }
}
