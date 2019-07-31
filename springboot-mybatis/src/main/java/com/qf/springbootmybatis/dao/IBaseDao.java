package com.qf.springbootmybatis.dao;

import java.util.List;

public interface IBaseDao<T> {

	public void add(T t);

	public void update(T t);

	public void deleteById(Integer id);

	public T getById(Integer id);

	public List<T> getList();
}
