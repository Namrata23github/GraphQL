package com.example.demo.model;

import com.example.demo.enums.Animal;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Document(collection = "Pets")
public class Pet {
	
	@Id 
	private String id;

    private String name;

    private Animal type;

    private int age;

	public String getId() {
		return id;
	}

	public Pet() {
		super();
	}

	public void setId(String id) {
		this.id = id;
	}

	public Pet( String id, String name, Animal type, int age) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getType() {
		return type;
	}

	public void setType(Animal type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
}
