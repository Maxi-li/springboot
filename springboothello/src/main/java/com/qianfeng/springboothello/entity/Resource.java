/**
 * FileName: Resource
 * Author:   Max
 * Description:
 */
package com.qianfeng.springboothello.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Resource {

    @Value("${resource.imageServer}")
    private String imagesService;

    @Value("${resource.emailServer}")
    private String emailService;

    public String getImagesService() {
        return imagesService;
    }

    public void setImagesService(String imagesService) {
        this.imagesService = imagesService;
    }

    public String getEmailService() {
        return emailService;
    }

    public void setEmailService(String emailService) {
        this.emailService = emailService;
    }
}

