package com.example.demo.uce.repository.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "vuel_id")
	private Integer id;
	
	@Column(name = "vuel_numero")
	private Integer numero;
	
	@Column(name = "vuel_fecha_vuelo")
	private String fechaVuelo;
	
	@Column(name = "vuel_asientos_disponibles")
	private Integer asientosDisponibles;
	
	@Column(name = "vuel_valor_asiento")
	private Double valorAsiento;
	
	@Column(name = "vuel_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "avio_id")
	private Avion avion;
	
	@Column(name = "avio_origen")
	private String origen;
	
	@Column(name = "avio_destino")
	private String destino;
	
	@Column(name = "avio_categoria")
	private String categoria;
	
	@OneToMany(mappedBy = "vuelo", fetch = FetchType.EAGER)
	private List<CompraPasaje> pasajesCompra;
	
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

	public List<CompraPasaje> getPasajesCompra() {
		return pasajesCompra;
	}

	public void setPasajesCompra(List<CompraPasaje> pasajesCompra) {
		this.pasajesCompra = pasajesCompra;
	}


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

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	
	
	

}
