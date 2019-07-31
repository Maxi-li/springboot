package com.qf.springbootmybatis.service.impl;

import com.qf.springbootmybatis.dao.IBaseDao;
import com.qf.springbootmybatis.entity.Student;
import com.qf.springbootmybatis.mapper.StudentMapper;
import com.qf.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public IBaseDao<Student> getDao() {
		return studentMapper;
	}


	@Override
	public Student checkLogin(Student student) {
		return studentMapper.getStudent(student);
	}

	@Override
	public List<Student> getStudentList() {
		return studentMapper.getList();
	}

}
