package com.example.demo.uce.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.modelo.Vuelo;
import com.example.demo.uce.service.IVueloService;
import com.example.demo.uce.service.VueloServiceImpl;
import com.example.demo.uce.service.to.VueloTo;

@RestController
@RequestMapping("APINomina/V1/vuelos")
@CrossOrigin("http://localhost:8080/")
public class VueloRestFullController {
	
	@Autowired
	private IVueloService vueloService;
	
	@GetMapping(path = "/{origen}/{destino}/{fechaVuelo}", produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin("http://localhost:8080/")
	public List<VueloTo> buscaVueloDisponible(@PathVariable("origen") String origen, @PathVariable("destino") String destino, @PathVariable("fechaVuelo") String fechaVuelo){
		List<VueloTo> lista = this.vueloService.buscaVueloDisponible(origen, destino, fechaVuelo);
		
		return lista;
	}
	
	@GetMapping(path = "/{numVuelo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VueloTo> buscaVueloDisponiblePorNumVuelo(@PathVariable("numVuelo") Integer numVuelo) {
		List<VueloTo> vuel = this.vueloService.buscaVueloDisponiblePorNumVuelo(numVuelo);
		return vuel;
	}
	
}
