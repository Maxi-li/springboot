package com.qf.springbootmybatis.mapper;


import com.qf.springbootmybatis.dao.IBaseDao;
import com.qf.springbootmybatis.entity.Student;


public interface StudentMapper extends IBaseDao<Student> {


	Student getStudent(Student student);
}
