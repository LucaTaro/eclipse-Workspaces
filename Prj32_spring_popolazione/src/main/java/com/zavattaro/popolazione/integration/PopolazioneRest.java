package com.zavattaro.popolazione.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zavattaro.popolazione.entites.Popolazione;
import com.zavattaro.popolazione.service.PopolazioneService;

@RestController
@RequestMapping("/api")
public class PopolazioneRest {
	
	@Autowired
	private PopolazioneService service;
	
	@GetMapping
	public List<Popolazione> getAll() {
		return this.service.getPopolazione();
	}
	
	@GetMapping("/regione/{regione}")
	public List<Popolazione> getByRegione(@PathVariable("regione") String regione) {
		return this.service.getPopolazioneByRegione(regione);
	}
	
	@GetMapping("/comune/{comune}")
	public List<Popolazione> getByComune(@PathVariable("comune") String comune) {
		System.out.println(comune);
		return this.service.getPopolazioneByComune(comune);
	}

}
