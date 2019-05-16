package com.qf.dao.impl;

import com.qf.dao.FactoryDao;
import com.qf.entity.Factory;

public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {
    public FactoryDaoImpl(){
        this.setNs("com.qf.mapper.FactoryMapper."); //设置命名空间
    }
}
