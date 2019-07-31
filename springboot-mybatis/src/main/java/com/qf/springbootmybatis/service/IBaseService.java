package com.qf.springbootmybatis.service;


import com.qf.springbootmybatis.entity.PageBean;

/**
 * 公共的service接口，会定义CRUD的方法
 *
 */
public interface IBaseService<T> {

	public PageBean<T> getPage(PageBean<T> page);

	public void add(T t);

	public void update(T t);

	public void deleteById(Integer id);

	public T getById(Integer id);
}
