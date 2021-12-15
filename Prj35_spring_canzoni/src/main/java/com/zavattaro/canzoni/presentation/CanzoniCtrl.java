package com.zavattaro.canzoni.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zavattaro.canzoni.services.CantanteService;
import com.zavattaro.canzoni.services.CanzoneService;

@Controller
@RequestMapping
public class CanzoniCtrl {

	@Autowired
	private CantanteService serviceCantanti;

	@Autowired
	private CanzoneService serviceCanzoni;
	
	@GetMapping("cantanti")
	public String getCantanti(Model model) {
		
		model.addAttribute("titolo", "cantanti");
		model.addAttribute("cantanti", serviceCantanti.getCantanti());
		
		return "cantanti";
	}
	
	@GetMapping("cantanti/{prefix}")
	public String getCantanti(@PathVariable String prefix , Model model) {
		
		model.addAttribute("titolo", "cantanti");
		model.addAttribute("cantanti", serviceCantanti.getCantantiContatining(prefix));
		
		return "cantanti";
	}
	
	
	@GetMapping("canzoni")
	public String getCanzoni(Model model) {
		
		model.addAttribute("titolo", "canzoni");
		model.addAttribute("canzoni", serviceCanzoni.getCanzone());
		
		return "canzoni";
	}	
}