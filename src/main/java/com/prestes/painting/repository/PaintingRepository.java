package com.prestes.painting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prestes.painting.model.Painting;


@Repository
public interface PaintingRepository extends JpaRepository<Painting, Long>{

}
