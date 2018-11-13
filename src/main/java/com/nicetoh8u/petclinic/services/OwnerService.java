package com.nicetoh8u.petclinic.services;

import com.nicetoh8u.petclinic.model.Owner;

public interface OwnerService extends CrudService <Owner,Long> {

    Owner findByLastName(String lastName);


}
