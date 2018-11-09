package com.nicetoh8u.petclinic.Services;

import java.util.Set;

public interface CrudService <T,ID> {

    T findById(ID id);
    T save(T object);
    Set<T> findAll();
    void delete (T object);
}
