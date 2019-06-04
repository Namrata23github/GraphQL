package com.example.demo.resolvers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.enums.Animal;
import com.example.demo.model.Pet;

@Component
public class Query implements GraphQLQueryResolver {
	
	public List<Pet> pets() {
        List<Pet> pets = new ArrayList<>();

		Pet pet1 = new Pet();
		pet1.setId(1);
		pet1.setName("Billi");
		pet1.setType(Animal.CAT);
		pet1.setAge(10);
		pets.add(pet1);
		Pet pet2 = new Pet();
		pet2.setId(2);
		pet2.setName("kutta");
		pet2.setType(Animal.DOG);
		pet2.setAge(14);
		pets.add(pet2);
		return pets;
		
	}

}
