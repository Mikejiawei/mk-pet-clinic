package guru.springframework.mkpetclinic.services;

import guru.springframework.mkpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet Save(Vet vet);

    Set<Vet> findAll();
}
