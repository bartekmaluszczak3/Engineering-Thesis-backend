package com.example.demo.repository;

import com.example.demo.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Integer> {

    Optional<Image> findImageByAnnouncementId(Integer id);
}