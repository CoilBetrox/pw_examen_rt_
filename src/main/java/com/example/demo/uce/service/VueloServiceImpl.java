package com.example.demo.uce.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IVueloRepository;
import com.example.demo.uce.repository.modelo.Vuelo;
import com.example.demo.uce.service.to.VueloTo;

@Service
public class VueloServiceImpl implements IVueloService {

	@Autowired
	private IVueloRepository vueloRepository;
	
	@Override
	public List<VueloTo> buscaVueloDisponible(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		List<Vuelo> lista = this.vueloRepository.buscaVueloDisponible(origen, destino, fechaVuelo);
		List<VueloTo> listaFinal = lista.stream().map(vuelo -> this.convertir(vuelo)).collect(Collectors.toList());
		return listaFinal;
		//return listaFinal;
	}
	
	@Override
	public List<Vuelo> buscaVueloDisponibl(String origen, String destino, String fechaVuelo) {
		// TODO Auto-generated method stub
		List<Vuelo> lista = this.vueloRepository.buscaVueloDisponible(origen, destino, fechaVuelo);
		List<VueloTo> listaFinal = lista.stream().map(vuelo -> this.convertir(vuelo)).collect(Collectors.toList());
		return lista;
		//return listaFinal;
	}
	
	@Override
	public List<VueloTo> buscaVueloDisponiblePorNumVuelo(Integer numVuelo) {
		// TODO Auto-generated method stub
		List<Vuelo> lista = this.vueloRepository.buscaVueloDisponiblePorNumVuelo(numVuelo);
		List<VueloTo> vuelFinal = lista.stream().map(vuel -> this.convertir(vuel)).collect(Collectors.toList());
		return vuelFinal;
	}
	
	private VueloTo convertir(Vuelo vuelo) {
		VueloTo vuel = new VueloTo();
		vuel.setId(vuelo.getId());
		vuel.setNumero(vuelo.getNumero());
		vuel.setFechaVuelo(vuelo.getFechaVuelo());
		vuel.setAsientosDisponibles(vuelo.getAsientosDisponibles());
		vuel.setValorAsiento(vuelo.getValorAsiento());
		vuel.setEstado(vuelo.getEstado());
		vuel.setOrigen(vuelo.getOrigen());
		vuel.setDestino(vuelo.getDestino());
		vuel.setCategoria(vuelo.getCategoria());
		return vuel;
	}

	

}
