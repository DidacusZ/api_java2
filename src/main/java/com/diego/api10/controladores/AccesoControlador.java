package com.diego.api10.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.diego.api10.modelos.Acceso;
import com.diego.api10.repositorios.AccesoRepositorio;

@RestController
@RequestMapping("/api/acceso") //no /
//@CrossOrigin(origins = "*")
//@Api
public class AccesoControlador {
	
	@Autowired
	private AccesoRepositorio repositorio;	

	@GetMapping//muestra todos los accesos
	public List<Acceso> allAccesos(){
		return repositorio.findAll();
	}
		
	@PostMapping//añade un acceso   //mediante un json añades un acceso
	public Acceso createAcceso(@RequestBody Acceso acceso) {
		return repositorio.save(acceso);
	}
	
	@PutMapping("/{id}")//modifica un acceso  
	public Acceso updateAcceso(@PathVariable int id ,@RequestBody Acceso acceso) {
		return repositorio.save(acceso);
	}
	
	@DeleteMapping("/{id}")//borra acceso
	public void deleteAcceso(@PathVariable("id") Long id) {
		repositorio.deleteById(id);
	}
	
}
