package com.qf.springbootmybatis.entity;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * 放分页相关的一些参数
 * 
 * @author Max
 * @param <T>
 */

public class PageBean<T> {

	private Integer currentPage = 1;// 当前页
	private Integer pageSize = 5;// 每页显示的条数
	private Integer totalCount;// 总条数
	private String url;// 分页的跳转地址
	private List<T> list;// 分页的集合数据

	public PageBean(List<T> list) {
		Page<T> page = (Page<T>) list;
		this.currentPage = page.getPageNum();
		this.pageSize = page.getPageSize();
		this.totalCount = (int) page.getTotal();
		this.list = page.getResult();
	}

	public PageBean() {
		super();
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

}
