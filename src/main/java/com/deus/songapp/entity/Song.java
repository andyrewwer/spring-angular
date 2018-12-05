package com.deus.songapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SongIdSeq")
    @SequenceGenerator(name = "SongIdSeq", sequenceName = "song_id_seq", allocationSize = 1)
    @Id
    private Long id;

    private String songName;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Slide> slides;
}

