package com.anusuya.xenon.controller;

import com.anusuya.xenon.model.Xen;
import com.anusuya.xenon.service.XenService;
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
    XenService xenService;

    @ResponseBody
    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Xen> createXen(@RequestBody Xen xen) {
         xenService.save(xen);
        if(xen == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(xen, HttpStatus.OK);
        }
    }

    @ResponseBody
    @RequestMapping(method= RequestMethod.GET)
    public List<Xen> getAllXens() {
        return xenService.findAll();
    }

    @ResponseBody
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Xen> getXenById(@PathVariable("id") Long id) {
        Xen xen = xenService.findOne(id);
        if(xen == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(xen, HttpStatus.OK);
        }
    }

    @ResponseBody
    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Xen> updateXen(@RequestBody Xen xen) {
        if (xen.getId() == null) {
            return createXen(xen);
        }
        Xen result = xenService.save(xen);
        if(result == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(xen, HttpStatus.OK);
        }
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteXen(@PathVariable("id") Long id) {
        xenService.delete(id);
    }
}
