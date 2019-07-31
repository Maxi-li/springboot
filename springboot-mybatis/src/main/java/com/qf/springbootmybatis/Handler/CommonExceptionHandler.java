/**
 * FileName: CommonExceptionHandler
 * Author:   Max
 * Description:客户端看到的异常
 */
package com.qf.springbootmybatis.Handler;

import com.qf.springbootmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handleException(Exception e){

        return new ResultBean("500",e.getMessage());

    }
}

