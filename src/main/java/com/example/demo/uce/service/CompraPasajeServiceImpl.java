package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.ICompraPasajeRepository;
import com.example.demo.uce.repository.modelo.CompraPasaje;
import com.example.demo.uce.service.to.CompraPasajeTo;

@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService {

	@Autowired
	private ICompraPasajeRepository compraPasajeRepository;
	
	@Override
	public void reservaPasaje(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraPasajeRepository.reservaPasaje(compraPasaje);
	}
	
	private CompraPasajeTo convertir(CompraPasaje pasaje) {
		CompraPasajeTo pas = new CompraPasajeTo();
		pas.setId(pasaje.getId());
		pas.setNumero(pasaje.getNumero());
		pas.setFechaCompra(pasaje.getFechaCompra());
		pas.setNumeroTarjeta(pasaje.getNumeroTarjeta());
		pas.setCantidadAsientosComprados(pasaje.getCantidadAsientosComprados());
		pas.setEstado(pasaje.getEstado());
		return pas;
	}

}
