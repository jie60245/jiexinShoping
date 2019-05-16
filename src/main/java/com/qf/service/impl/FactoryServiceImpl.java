package com.qf.service.impl;

import com.qf.dao.FactoryDao;
import com.qf.entity.Factory;
import com.qf.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class FactoryServiceImpl implements FactoryService {

    @Autowired
    public FactoryDao factoryDao;

    @Override
    public List<Factory> find(Factory factory) {
        return factoryDao.find(factory);
    }

    @Override
    public FactoryService get(Serializable id) {
        return null;
    }

    @Override
    public void insert(Factory factory) {

    }

    @Override
    public void update(Factory factory) {

    }

    @Override
    public void delete(Serializable id) {

    }

    @Override
    public void delete(Serializable[] ids) {

    }
}
