package com.corelogic.schemaconverter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@javax.persistence.Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SongIdSeq")
    @SequenceGenerator(name = "SongIdSeq", sequenceName = "song_id_seq", allocationSize = 1)
    @Id
    private Long id;

}

