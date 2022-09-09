package com.example.demo.uce.repository;

import com.example.demo.uce.repository.modelo.Avion;

public interface IAvionRepository {

public void crear(Avion avion);
	
	public void actualizar(Avion avion);
	
	public void eliminar(Integer id);
	
	public Avion buscar(Integer id);
}
