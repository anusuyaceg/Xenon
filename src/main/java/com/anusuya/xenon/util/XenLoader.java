package com.anusuya.xenon.util;

import com.anusuya.xenon.model.Category;
import com.anusuya.xenon.model.Xen;
import com.anusuya.xenon.repository.CategoryRepository;
import com.anusuya.xenon.repository.XenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

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


        Category category = categoryRepository.save(new Category("Budget","units","dollors"));


        Xen xen = new Xen();
        xen.setTitle("Title1");
        xen.setDescription("Description1");
        xen.setCompleted(true);
        xen.setTask(true);
        xen.setTimestamp(new Date());
        xen.setCategory(category);

        xenRepository.save(xen);
        Xen xen1 = new Xen();
        xen1.setTitle("Title1");
        xen1.setDescription("Description1");
        xen1.setCompleted(true);
        xen1.setTask(true);
        xen1.setTimestamp(new Date());
        xen1.setCategory(category);
        xenRepository.save(xen1);





    }
}
