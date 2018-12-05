package com.deus.songapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SongDto {
    Long userId;
    String songName;
    List<SlideDto> slideDtos;
}