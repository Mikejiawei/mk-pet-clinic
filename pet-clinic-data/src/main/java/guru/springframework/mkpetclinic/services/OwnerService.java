package guru.springframework.mkpetclinic.services;

import guru.springframework.mkpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
