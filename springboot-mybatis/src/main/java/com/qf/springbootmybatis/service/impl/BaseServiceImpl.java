package com.qf.springbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.qf.springbootmybatis.dao.IBaseDao;
import com.qf.springbootmybatis.entity.PageBean;
import com.qf.springbootmybatis.service.IBaseService;

import java.util.List;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {
	// studetnServiceImpl studetnService.add(student);
	public abstract IBaseDao<T> getDao();

	@Override
	public PageBean<T> getPage(PageBean<T> page) {
		PageHelper.startPage(page.getCurrentPage(), page.getPageSize());
		List<T> list = getDao().getList();
		return new PageBean<>(list);
	}

	@Override
	public void add(T t) {
		getDao().add(t);
	}

	@Override
	public void update(T t) {
		getDao().update(t);
	}

	@Override
	public void deleteById(Integer id) {
		getDao().deleteById(id);
	}

	@Override
	public T getById(Integer id) {
		return getDao().getById(id);
	}

}
