package com.anusuya.xenon.controller;

import com.anusuya.xenon.model.Category;
import com.anusuya.xenon.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by anusuya on 3/17/2017.
 */


@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;


    @RequestMapping(method= RequestMethod.GET)
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @RequestMapping(value="{id}", method=RequestMethod.GET)
    public ResponseEntity<Category> getXenById(@PathVariable("id") Long id) {
        Category category = categoryRepository.findOne(id);
        if(category == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(category, HttpStatus.OK);
        }
    }
}
