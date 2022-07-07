package com.prestes.painting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestes.painting.model.Painting;
import com.prestes.painting.repository.PaintingRepository;

@RestController
@RequestMapping("/paintings")
public class PaintingController {
	
	@Autowired
	private PaintingRepository paintingRepository;
	
	
	@GetMapping
	public List<Painting> listPaintigs() {
		return paintingRepository.findAll();
	}
	
	@PostMapping
	public Painting adicionar(@RequestBody Painting painting) {
		
		return paintingRepository.save(painting);
		
	}
	

}
