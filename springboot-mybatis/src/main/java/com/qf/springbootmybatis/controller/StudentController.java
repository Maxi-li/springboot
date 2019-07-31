package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.PageBean;
import com.qf.springbootmybatis.entity.Student;
import com.qf.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	public string test(){
	   system.out.println(.......)
	}
		

	// 登录
	@RequestMapping("login")
	public String login(Student student, HttpServletRequest request, HttpServletResponse response) throws IOException {
		Student stu = studentService.checkLogin(student);
		if (stu != null) {// 登录成功
			// 设置一个登录成功的标记
			request.getSession().setAttribute("LOGIN_STUDENT", stu);
			return "redirect:/student/page";
		} else {// 登录失败
			request.getSession().invalidate();
			response.getWriter().write("<script>alert('用户名和密码错误！');</script>");
			return null;
		}
	}

	// 分页显示学生信息
	@RequestMapping("page")
	public String page(PageBean<Student> page, Model model) {

		PageBean<Student> stuPage = studentService.getPage(page);
		stuPage.setUrl("student/page");
		model.addAttribute("page", stuPage);
		return "list";
	}

	// 添加学生
	@RequestMapping("add")
	public String add(Student student) {
		studentService.add(student);
		return "redirect:/student/page";
	}

	// 执行跳转到添加学生
	@RequestMapping("toAdd")
	public String toAdd() {
		return "add";
	}

	// 学生信息数据回显
	@RequestMapping("toUpdate/{id}")
	public String toUpdate(@PathVariable Integer id, Model model) {
		Student student = studentService.getById(id);
		model.addAttribute("student", student);
		return "update";
	}

	// 修改学生信息
	@RequestMapping("/update")
	public String update(Student student) {
		studentService.update(student);
		return "redirect:/student/page";
	}

	// 删除学生信息
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		studentService.deleteById(id);
		return "redirect:/student/page";
	}

}
