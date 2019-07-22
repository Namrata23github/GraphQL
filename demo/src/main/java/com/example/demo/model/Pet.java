package com.example.demo.model;

import com.example.demo.enums.Animal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Pet {
	
	private long id;

    private String name;

    private Animal type;

    private int age;

	public long getId() {
		return id;
	}

	public Pet() {
		super();
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pet(long id, String name, Animal type, int age) {
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
