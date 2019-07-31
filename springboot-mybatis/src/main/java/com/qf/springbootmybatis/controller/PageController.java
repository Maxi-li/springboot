/**
 * FileName: PageController
 * Author:   Max
 * Description:
 */
package com.qf.springbootmybatis.controller;

import com.qf.springbootmybatis.entity.Student;
import com.qf.springbootmybatis.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {

    @Autowired
    private IStudentService studentService;

    //测试前端页面模板
    @RequestMapping("home")
    public String home(Model model){
        Student student = new Student();
        student.setUsername("小马哥");
        model.addAttribute("student", student);

        List<Student> students = studentService.getStudentList();
        model.addAttribute("list", students);

        //int i=1/0;
        Integer age = 18;
        model.addAttribute("age", age);

        Date birthday= new Date();
        model.addAttribute("birthday", birthday);

        return "home";
    }

    @RequestMapping("add")
    @ResponseBody
    public String get(@Valid Student student){
        System.out.println(student);
        return "success";
    }


}

