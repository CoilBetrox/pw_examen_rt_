package com.example.demo.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.uce.repository.modelo.Vuelo;
import com.example.demo.uce.service.to.VueloTo;

public interface IVueloService {

	public List<VueloTo> buscaVueloDisponible(String origen, String destino, String fechaVuelo);
	
	public List<Vuelo> buscaVueloDisponibl(String origen, String destino, String fechaVuelo);
	
	public List<VueloTo> buscaVueloDisponiblePorNumVuelo(Integer numVuelo); 
	
	
}
