package com.qf.dao.impl;

import com.qf.dao.BaseDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/*SqlSessionDaoSupport是一个抽象支持类，实现了sqlsession模板*/
public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {

    @Autowired
    //mybatis-spring 1.0无需此方法；mybatis-spring1.2必须注入。
    public void setSqlsessionFactory(SqlSessionFactory sqlsessionFactory){
        super.setSqlSessionFactory(sqlsessionFactory);
    }
    private String ns;//命名空间
    public String getNs(){
        return ns;
    }
    public void setNs(String ns){
        this.ns = ns;
    }

    @Override
    public List<T> find(T entity) {
        List<T> OList = this.getSqlSession().selectList(ns + "fing", entity);
        return OList;
    }

    @Override
    public T get(Serializable id) {
        return this.getSqlSession().selectOne(ns+"get",id);
    }

    @Override
    public void insert(T entity) {
        this.getSqlSession().insert(ns+"insert",entity);
    }

    @Override
    public void update(T entity) {
        this.getSqlSession().update(ns+"update",entity);
    }

    @Override
    public void delete(Serializable id) {
        this.getSqlSession().delete(ns+"delete",id);
    }

    @Override
    public void delete(Serializable[] ids) {
        this.getSqlSession().delete(ns+"delete",ids);
    }
}
