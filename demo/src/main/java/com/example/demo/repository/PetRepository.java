package com.example.demo.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pet;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {
    public Pet findByid(String id);
    public List<Pet> findAll();
}
