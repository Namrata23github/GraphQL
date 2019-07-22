package com.example.demo.resolvers;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.enums.Animal;
import com.example.demo.model.Pet;

@Component
public class Mutation implements GraphQLMutationResolver{
	
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
        return new Pet(4, name, Animal.BADGER, age);
		
		
	}

}
