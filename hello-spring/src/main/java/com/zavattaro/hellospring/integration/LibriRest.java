package com.zavattaro.integration;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zavattaro.model.Libro;
import com.zavattaro.service.LibroService;

@RestController
public class LibriRest {
	
	private LibroService ls = new LibroService();
	
	@GetMapping("/api/libri")
	public ArrayList<Libro> getLibri() {
		
		return ls.getLibri();
	}

}
