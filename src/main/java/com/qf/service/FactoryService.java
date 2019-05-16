package com.qf.service;

import com.qf.entity.Factory;

import java.io.Serializable;
import java.util.List;

public interface FactoryService {
    public List<Factory> find(Factory factory);
    public FactoryService get(Serializable id);
    public void insert(Factory factory);
    public void update(Factory factory);
    public void delete(Serializable id);
    public void delete(Serializable[] ids);

}
