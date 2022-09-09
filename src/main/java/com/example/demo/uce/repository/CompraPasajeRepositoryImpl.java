package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.CompraPasaje;

@Repository
@Transactional
public class CompraPasajeRepositoryImpl implements ICompraPasajeRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void reservaPasaje(CompraPasaje compraPasaje) {
		this.entityManager.persist(compraPasaje);
	}

}
