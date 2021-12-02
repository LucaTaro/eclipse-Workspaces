package com.zavattaro.popolazioneMauro.integration;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zavattaro.popolazioneMauro.entites.Provincia;
import com.zavattaro.popolazioneMauro.service.ProvinciaService;

@RestController
@RequestMapping("/api")
public class ProvinceRest {
	
	@Autowired
	private ProvinciaService service;
	
	@GetMapping
	public List<Provincia> getAll() {
		this.service.initProvince();
		return this.service.getProvince();
	}
	
	@GetMapping("/{regione}")
	public List<Provincia> getAll(@PathVariable String regione) {
		return this.service.getByRegione(regione);
	}

	@GetMapping("/elenco/regione")
	public Set<String> getRegioni() {
		this.service.initProvince();
		Set<String> regioni = this.service.getProvince().stream()
			.map(p -> p.getRegione())
			.collect(Collectors.toSet());
		TreeSet<String> regioniOrdinate = new TreeSet<String>(regioni);
		return regioniOrdinate;
	}
}
