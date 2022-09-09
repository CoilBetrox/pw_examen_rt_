package com.example.demo.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.modelo.CompraPasaje;
import com.example.demo.uce.service.ICompraPasajeService;

@RestController
@RequestMapping("APINomina/V1/pasajes")
@CrossOrigin("http://localhost:8080/")
public class CompraPasajeRestFullController {
	
	@Autowired
	private ICompraPasajeService compraPasajeService;
	
	@PostMapping
	@CrossOrigin("http://localhost:8080/")
	public String reservaPasaje(@RequestBody CompraPasaje compraPasaje) {
		String msj = "Pasaje aregado correctamente";
		try {
			this.compraPasajeService.reservaPasaje(compraPasaje);
		} catch (Exception e) {
			msj = "Error al ingresar"+e;
		}
		return msj;
	}

}
