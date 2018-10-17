package com.dhc.bootdemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * User: DHC
 * Date: 2017/12/1
 * Time: 17:32
 * Version:V1.0
 */
@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperty {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
