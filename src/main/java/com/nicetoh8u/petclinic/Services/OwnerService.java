package com.nicetoh8u.petclinic.Services;

import com.nicetoh8u.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService <Owner,Long> {

    Owner findByLastName(String lastName);


}
