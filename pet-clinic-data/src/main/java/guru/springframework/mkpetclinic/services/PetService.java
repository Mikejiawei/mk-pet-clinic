package guru.springframework.mkpetclinic.services;

import guru.springframework.mkpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet Save(Pet pet);

    Set<Pet> findAll();

}
