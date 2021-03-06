package com.zavattaro.canzoni;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zavattaro.canzoni.entities.Cantante;
import com.zavattaro.canzoni.entities.Canzone;
import com.zavattaro.canzoni.services.CantanteService;
import com.zavattaro.canzoni.services.CanzoneService;
import com.zavattaro.canzoni.services.DBCantanti;

@SpringBootTest
class SpringCanzoniApplicationTests {

	@Autowired
	private CantanteService service;

	@Autowired
	private CanzoneService serviceCanzoni;
	
	@Test
	void scriviSuTabellaCantanti() {
		
		List<String[]> canzoni = DBCantanti.getCanzoni();
		
		for (String[] canzone : canzoni) {
			String titolo = canzone[0];
			String nome = canzone[1];
			Cantante c = caricaDati(titolo, nome);
		}
		
	}

	private Cantante caricaDati(String titolo, String nome) {
		Cantante c = new Cantante();
		c.setNome(nome);
		this.service.addCantante(c);
		
		Canzone cnz = new Canzone();
		cnz.setTitolo(titolo);
		cnz.setCantante(c);
		this.serviceCanzoni.addCanzone(cnz);
		return c;
	}

}