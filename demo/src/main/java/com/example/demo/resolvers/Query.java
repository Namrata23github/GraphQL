package com.example.demo.resolvers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.enums.Animal;
import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	private PetRepository repository;

//	public List<Pet> pets() {		
//		return repository.findAll();
//		
//	}
	
	public Pet pets(String id) {
		return  repository.findByid(id);
		
	}
}
