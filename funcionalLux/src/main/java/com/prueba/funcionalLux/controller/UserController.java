package com.prueba.funcionalLux.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.funcionalLux.model.Usuario;


@RestController
public class UserController {
	
	private List<Usuario> listaUsuarios = List.of(new Usuario("Raul", "RaulUser", "RaulPass"), new Usuario("Antonio", "AntonioUser", "AntonioPass"), new Usuario("Manuel", "ManuelUser", "ManuelPass"));

	
	
	@GetMapping("/login")
	public String login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
		var resultado = listaUsuarios.stream().filter(u -> u.getUserName().equals(username) && u.getPassword().equals(password)).collect(Collectors.toList());
		
		return "Hola " + resultado.get(0).getNombre();
	}


}
