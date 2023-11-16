package com.diego.api10.modelos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="Usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_usuario", nullable=false)
	private Long id;
	
	@Column(name="dni_usuario")
	private String dniUsuario;
	
	@Column(name="nombre_usuario")
	private String nombreUsuario;
	
	@Column(name="apellidos_usuario")
	private String apellidosUsuario;
	
	@Column(name="tlf_usuario")
	private String tlfUsuario;
	
	@Column(name="email_usuario")
	private String emailUsuario;
	
	@Column(name="clave_usuario")
	private String claveUsuario;
	
	@Column(name="estaBloqueado_usuario")
	private boolean estaBloqueado_usuario;
	
	@Column(name="fch_fin_bloqueo_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinBloqueo;
	
	@Column(name="fch_alta_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchAltaUsuario;
	
	@Column(name="fch_baja_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchBajaUsuario;

	
	//Usuarios-Acceso
	@ManyToOne
    @JoinColumn(name = "acceso_id")
    private Acceso acceso;
	

	public Usuario(Long id, String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario,
			String emailUsuario, String claveUsuario, boolean estaBloqueado_usuario, Calendar fchFinBloqueo,
			Calendar fchAltaUsuario, Calendar fchBajaUsuario) {
		super();
		this.id = id;
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.tlfUsuario = tlfUsuario;
		this.emailUsuario = emailUsuario;
		this.claveUsuario = claveUsuario;
		this.estaBloqueado_usuario = estaBloqueado_usuario;
		this.fchFinBloqueo = fchFinBloqueo;
		this.fchAltaUsuario = fchAltaUsuario;
		this.fchBajaUsuario = fchBajaUsuario;
	}


	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDniUsuario() {
		return dniUsuario;
	}


	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getApellidosUsuario() {
		return apellidosUsuario;
	}


	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}


	public String getTlfUsuario() {
		return tlfUsuario;
	}


	public void setTlfUsuario(String tlfUsuario) {
		this.tlfUsuario = tlfUsuario;
	}


	public String getEmailUsuario() {
		return emailUsuario;
	}


	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}


	public String getClaveUsuario() {
		return claveUsuario;
	}


	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}


	public boolean isEstaBloqueado_usuario() {
		return estaBloqueado_usuario;
	}


	public void setEstaBloqueado_usuario(boolean estaBloqueado_usuario) {
		this.estaBloqueado_usuario = estaBloqueado_usuario;
	}


	public Calendar getFchFinBloqueo() {
		return fchFinBloqueo;
	}


	public void setFchFinBloqueo(Calendar fchFinBloqueo) {
		this.fchFinBloqueo = fchFinBloqueo;
	}


	public Calendar getFchAltaUsuario() {
		return fchAltaUsuario;
	}


	public void setFchAltaUsuario(Calendar fchAltaUsuario) {
		this.fchAltaUsuario = fchAltaUsuario;
	}


	public Calendar getFchBajaUsuario() {
		return fchBajaUsuario;
	}


	public void setFchBajaUsuario(Calendar fchBajaUsuario) {
		this.fchBajaUsuario = fchBajaUsuario;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", dniUsuario=" + dniUsuario + ", nombreUsuario=" + nombreUsuario
				+ ", apellidosUsuario=" + apellidosUsuario + ", tlfUsuario=" + tlfUsuario + ", emailUsuario="
				+ emailUsuario + ", claveUsuario=" + claveUsuario + ", estaBloqueado_usuario=" + estaBloqueado_usuario
				+ ", fchFinBloqueo=" + fchFinBloqueo + ", fchAltaUsuario=" + fchAltaUsuario + ", fchBajaUsuario="
				+ fchBajaUsuario +  "]";
	}
	
	
}
