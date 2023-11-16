package com.diego.api10.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.diego.api10.modelos.Usuario;
import com.diego.api10.repositorios.UsuarioRepositorio;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

	@Autowired
	private UsuarioRepositorio repositorio;
	
	@GetMapping//muestra todos los usuarios
	public List<Usuario> allAccesos(){
		return repositorio.findAll();
	}
		
	@PostMapping//añade un usuario   
	public Usuario createAcceso(@RequestBody Usuario usuario) {
		return repositorio.save(usuario);
	}
	
	@PutMapping("/{id}")//modifica un usuario  
	public Usuario updateAcceso(@PathVariable int id ,@RequestBody Usuario usuario) {
		return repositorio.save(usuario);
	}
	
	@DeleteMapping("/{id}")//borra usuario
	public void deleteAcceso(@PathVariable("id") Long id) {
		repositorio.deleteById(id);
	}
}
