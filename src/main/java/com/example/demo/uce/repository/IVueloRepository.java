package com.example.demo.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.uce.repository.modelo.Vuelo;

public interface IVueloRepository {
	
	public List<Vuelo> buscaVueloDisponible(String origen, String destino, String fechaVuelo);
	
	public List<Vuelo> buscaVueloDisponiblePorNumVuelo(Integer numVuelo); 
	
}
