/**
 * FileName: UserController
 * Author:   Max
 * Description: 22
 */
package com.qianfeng.springboothello.controller;


import com.qianfeng.springboothello.entity.Resource;
import com.qianfeng.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController {

   /* @Value("${images.serverpath}")
    private String imageServer;

    @Value("${emails.serverpath}")
    private String emailServer;*/

    @Autowired
    private Resource resource;

    @RequestMapping("hello")
    public String hello(){
        return "hello！！！33";
    }

    @GetMapping("page")
    public String pageIndex(@RequestParam(name = "pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @GetMapping("page/{pageIndex}")
    public String pageRestful(@PathVariable(name = "pageIndex")Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @PostMapping("add")
    public User addUser(User user){
        user.setEntrydate(new Date());
        return user;
    }

    @RequestMapping("properties")
    public String properties(){
        return resource.getEmailService()+resource.getImagesService();
    }














}

