package com.nicetoh8u.petclinic.services.map;

import com.nicetoh8u.petclinic.model.BaseEntity;

import java.util.*;

public abstract class  AbtractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long,T> map = new HashMap <>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if (object!=null){
            if (object.getId()==null)
                object.setId(nextId());
        map.put(object.getId(),object);
        }
        return object;
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }

    private Long nextId(){
        Long nextId = null;
        try {nextId = Collections.max(map.keySet())+1;}
        catch (NoSuchElementException ex){
            nextId = 1L;
        }
        return nextId;
    }


}
