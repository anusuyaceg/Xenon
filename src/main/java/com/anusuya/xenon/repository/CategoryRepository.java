package com.anusuya.xenon.repository;

import com.anusuya.xenon.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by anusuya on 3/15/2017.
 */

@RepositoryRestResource
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
