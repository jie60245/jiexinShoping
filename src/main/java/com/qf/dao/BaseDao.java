package com.qf.dao;

import java.io.Serializable;
import java.util.List;

/*泛型类，基础的dao接口*/
public interface BaseDao<T> {
    public List<T> find(T entity);
    public T get(Serializable id);
    public void insert(T entity);
    public void update(T entity);
    public void delete(Serializable id);
    public void delete(Serializable[] ids);

}
