package com.anusuya.xenon.service.impl;

import com.anusuya.xenon.model.Xen;
import com.anusuya.xenon.repository.XenRepository;
import com.anusuya.xenon.service.XenService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by anusuya on 3/28/2017.
 */
@Service
@Transactional
public class XenServiceImpl implements XenService{

    private final XenRepository xenRepository;

    public XenServiceImpl(XenRepository xenRepository) {
        this.xenRepository = xenRepository;
    }

    /**
     * Save a xen.
     *
     * @param xen the entity to save
     * @return the persisted entity
     */
    @Override
    public Xen save(Xen xen) {
        Xen result = xenRepository.save(xen);
        return result;
    }

    /**
     *  Get all the xens.
     *
     *  @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Xen> findAll() {
        List<Xen> result = xenRepository.findAll();

        return result;
    }

    /**
     *  Get one xen by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Xen findOne(Long id) {
        Xen xen = xenRepository.findOne(id);
        return xen;
    }

    /**
     *  Delete the  xen by id.
     *
     *  @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        xenRepository.delete(id);
    }
}
