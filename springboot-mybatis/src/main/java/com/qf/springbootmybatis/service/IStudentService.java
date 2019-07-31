package com.qf.springbootmybatis.service;


import com.qf.springbootmybatis.entity.Student;

import java.util.List;

public interface IStudentService extends IBaseService<Student> {

	Student checkLogin(Student student);

    List<Student> getStudentList();

}
