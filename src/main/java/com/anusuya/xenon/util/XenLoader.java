package com.anusuya.xenon.util;

import com.anusuya.xenon.model.Category;
import com.anusuya.xenon.model.Xen;
import com.anusuya.xenon.repository.CategoryRepository;
import com.anusuya.xenon.repository.XenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by anusuya on 3/15/2017.
 */
@Component
public class XenLoader implements ApplicationListener<ContextRefreshedEvent> {


    @Autowired
    private XenRepository xenRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        System.out.print("Loading Data............................");

        Category category = new Category("Budget","units","dollors");
        categoryRepository.save(category);


        Xen xen = new Xen();
        xen.setTitle("Title1");
        xen.setDescription("Description");
        xen.setCompleted(true);
        xen.setTask(true);
        xen.setCategory(category);

        xenRepository.save(xen);





    }
}
