package com.tfonsec.projectcrud.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tfonsec.projectcrud.entities.Client;
import com.tfonsec.projectcrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	   public List <Client> findAll() {
	   return repository.findAll();
	   
	   }
}
