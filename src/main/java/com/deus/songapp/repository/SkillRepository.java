package com.deus.songapp.repository;


import com.deus.songapp.entity.Slide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Slide, Long> {
}
