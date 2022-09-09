package com.example.demo.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Vuelo> buscaVueloDisponible(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager
				.createQuery("SELECT v FROM Vuelo v WHERE v.origen =:origen AND v.destino =:destino AND v.fechaVuelo =:fechaVuelo", Vuelo.class);
		myQuery.setParameter("origen", origen);
		myQuery.setParameter("destino", destino);
		myQuery.setParameter("fechaVuelo", fechaVuelo);
		return myQuery.getResultList();
	}

	@Override
	public List<Vuelo> buscaVueloDisponiblePorNumVuelo(Integer numVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager
				.createQuery("SELECT v FROM Vuelo v WHERE v.numero =:numero AND v.estado = 'D'", Vuelo.class);
		myQuery.setParameter("numero", numVuelo);
		
		return myQuery.getResultList();
	}

}
