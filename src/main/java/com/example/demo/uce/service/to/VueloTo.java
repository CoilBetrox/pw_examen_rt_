package com.example.demo.uce.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.hateoas.RepresentationModel;

import com.example.demo.uce.repository.modelo.Avion;
import com.example.demo.uce.repository.modelo.CompraPasaje;

public class VueloTo extends RepresentationModel<VueloTo> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Integer numero;

	private String fechaVuelo;
	
	private Integer asientosDisponibles;
	
	private Double valorAsiento;
	
	private String estado;
	
	private String origen;
	
	private String destino;

	private String categoria;

	//private List<CompraPasaje> pasajesCompra;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	public Double getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(Double valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/*
	public List<CompraPasaje> getPasajesCompra() {
		return pasajesCompra;
	}

	public void setPasajesCompra(List<CompraPasaje> pasajesCompra) {
		this.pasajesCompra = pasajesCompra;
	}
	*/
	
}
