package com.anusuya.xenon.repository;

import com.anusuya.xenon.model.Xen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by arangasamy on 3/13/2017.
 */
@RepositoryRestResource
public interface XenRepository extends CrudRepository<Xen,Long> {

    List<Xen> findAll();
    Xen findOne(Long id);
    Xen save(Xen Xen);
    void delete(Xen Xen);
}
