package com.tfonsec.projectcrud.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfonsec.projectcrud.entities.Client;
import com.tfonsec.projectcrud.servicies.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
           
	@Autowired
	private ClientService service;
	
	@GetMapping
	public  ResponseEntity <List<Client>> findAll() {
		List<Client> list  = service.findAll();
		return ResponseEntity.ok().body(list);
  }
}
