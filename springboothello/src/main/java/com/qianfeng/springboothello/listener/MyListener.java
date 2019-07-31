/**
 * FileName: MyListener
 * Author:   Max
 * Description:
 */
package com.qianfeng.springboothello.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

@Component
public class MyListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println("request请求要结束了,开始留言");
    }

    @Override
    public void requestInitialized(ServletRequestEvent arg0) {
        System.out.println("request请求创建后，开始监听");
    }


}

