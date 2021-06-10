package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Especifications;
import com.example.demo.model.Password;
import com.example.demo.service.PasswordService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/passgen")
public class PasswordController {
	public PasswordService servicio;
	@Autowired
	public PasswordController(PasswordService servicio) {
		this.servicio=servicio;
	}
	@PostMapping("/")
	private ResponseEntity<Password> generatePassword( @RequestBody Especifications espec) {
		return ResponseEntity.status(HttpStatus.OK).body(servicio.generatePassword( espec));
	}

}
