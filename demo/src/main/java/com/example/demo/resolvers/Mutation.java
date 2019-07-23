package com.example.demo.resolvers;

import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.enums.Animal;
import com.example.demo.model.Pet;
import com.example.demo.repository.PetRepository;

@Component
public class Mutation implements GraphQLMutationResolver{
	
	@Autowired
	private PetRepository repository;

	
	private static final Integer INTEGER = (Integer) null;
	

	public Pet createPet(Object abc ) {
		Map CreatePetInput = (Map) abc;
		String name = null;
        if (CreatePetInput.containsKey("name")) {
            name = (String) CreatePetInput.get("name");
        }
        int age = 1;
        if (CreatePetInput.containsKey("age")) {
            age =Integer.parseInt((String)
            		CreatePetInput.get("age"));
        }
       Pet p1 =  new Pet(UUID.randomUUID().toString(), name, Animal.BADGER, age);
       repository.save(p1);
       return p1;
       
		
		
	}

}
