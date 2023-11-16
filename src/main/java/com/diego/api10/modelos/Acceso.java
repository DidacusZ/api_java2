package com.diego.api10.modelos;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Accesos")
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id autoincrementables
	@Column(name = "id_acceso", nullable = false)
	private Long id;

	@Column(name = "codigo_acceso")
	private String codigoAcceso;

	@Column(name = "descripcion_acceso")
	private String descripcionAcceso;

	
	// Acceso-Usuarios
	@OneToMany(mappedBy = "acceso")
    private List<Usuario> usuarios;
	
	
	public Acceso(Long id, String codigoAcceso, String descripcionAcceso) {
		super();
		this.id = id;
		this.codigoAcceso = codigoAcceso;
		this.descripcionAcceso = descripcionAcceso;
	}

	public Acceso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoAcceso() {
		return codigoAcceso;
	}

	public void setCodigoAcceso(String codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}

	public String getDescripcionAcceso() {
		return descripcionAcceso;
	}

	public void setDescripcionAcceso(String descripcionAcceso) {
		this.descripcionAcceso = descripcionAcceso;
	}

	@Override
	public String toString() {
		return "Acceso [id=" + id + ", codigoAcceso=" + codigoAcceso + ", descripcionAcceso=" + descripcionAcceso + "]";
	}
}
