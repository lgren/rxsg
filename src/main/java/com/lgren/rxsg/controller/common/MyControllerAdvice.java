package com.lgren.rxsg.controller.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;

/**
 * @author lgren
 * @create 2019-05-25 16:10
 **/
@ControllerAdvice
public class MyControllerAdvice {
    @Value("contentPath")
    private String contentPath;

    @ModelAttribute
    public void addAttributes(Map<String, Object> map) {
        // map.put("contentPath", contentPath);
        map.put("version", System.currentTimeMillis());
    }
}
