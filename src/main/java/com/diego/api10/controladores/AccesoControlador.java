package com.diego.api10.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.api10.modelos.Acceso;
import com.diego.api10.repositorios.AccesoRepositorio;

@RestController
@RequestMapping("/api") //no /
@CrossOrigin(origins = "*")//puede llamar cualquiera. para que no te follen el culo el croosspoliticy
//@Api
public class AccesoControlador {
	
	@Autowired
	private AccesoRepositorio repository;
	
	//.net no /
	@GetMapping
	public List<Acceso> allAccesos(){
		return repository.findAll();
	}
		
	@PostMapping
	public Acceso createAcceso(@RequestBody Acceso acceso) {
		return repository.save(acceso);
	}
	
	@PutMapping("/{id}")
	public Acceso updateAcceso(@PathVariable int id ,@RequestBody Acceso acceso) {
		return repository.save(acceso);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAcceso(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}
