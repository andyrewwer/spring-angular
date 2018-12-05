package com.deus.songapp.converter;


import com.deus.songapp.dto.SlideDto;
import com.deus.songapp.entity.Slide;

public class SlideConverter {
    public static Slide dtoToEntity(SlideDto slideDto) {
        return new Slide(slideDto.getSlideId(), slideDto.getSlideText());
    }
    public static SlideDto entityToDto(Slide slide) {
        return new SlideDto(slide.getId(), slide.getSlideText());
    }
}