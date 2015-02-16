package org.david.entity;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * Created by william on 14-12-23.
 */
public class Test {

    public Test() {
    }

    public Test(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
