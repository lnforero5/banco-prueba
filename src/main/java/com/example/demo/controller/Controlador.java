package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SgrupoService;




@RestController
@RequestMapping
public class Controlador {
	
	@Autowired
	private SgrupoService service;
	
	@GetMapping("/home")
	public ArrayList grupo(@RequestBody ArrayList<Integer> capacidad_grupo) {		
		return service.grupo(capacidad_grupo);
	}
	
	
}
