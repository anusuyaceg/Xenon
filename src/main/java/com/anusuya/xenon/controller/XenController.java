package com.anusuya.xenon.controller;

import com.anusuya.xenon.model.Xen;
import com.anusuya.xenon.repository.XenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by anusuya on 3/12/2017.
 */

@RestController
@RequestMapping("/api/xen")
public class XenController {

    @Autowired
    XenRepository xenRepository;

    @ResponseBody
    @RequestMapping(method=RequestMethod.POST)
    public Xen createXen(@RequestBody Xen xen) {
        return xenRepository.save(xen);
    }

    @ResponseBody
    @RequestMapping(method= RequestMethod.GET)
    public List<Xen> getAllXens() {
        return xenRepository.findAll();
    }

    @ResponseBody
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Xen> getXenById(@PathVariable("id") Long id) {
        Xen xen = xenRepository.findOne(id);
        if(xen == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(xen, HttpStatus.OK);
        }
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteXen(@PathVariable("id") Long id) {
        xenRepository.delete(id);
    }
}
