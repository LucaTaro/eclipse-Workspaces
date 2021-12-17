package com.zavattaro.school.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zavattaro.school.entities.Corso;
import com.zavattaro.school.entities.Studente;
import com.zavattaro.school.services.CorsoService;
import com.zavattaro.school.services.StudenteService;

@RestController
@RequestMapping("api")
public class ScuolaREST {
	
	@Autowired
	private CorsoService corsoService;
	@Autowired
	private StudenteService studenteService;
	
	@RequestMapping(path = {"studenti", "superStudenti"}, method = RequestMethod.GET)
	public List<Studente> getStudenti() {
		return studenteService.getAll();
	}
	
	@RequestMapping(path = {"corsi", "superCorsi"}, method = RequestMethod.GET)
	public List<Corso> getCorsi() {
		return corsoService.getAll();
	}

	@GetMapping("studenti/{id}")
	public Studente getStudente(@PathVariable int id) {
		return studenteService.getOne(id);
	}
}
