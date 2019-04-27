package com.abin.springboot.configuration.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentProperties {

    @Value("${com.abin.id}") // 注入classpath下的properties文件的对应key的value值
    private Integer id;
    @Value("${com.abin.name}")
    private String name;
    @Value("${com.abin.age}")
    private Integer age;

    @Value("${com.abin.value}")
    private String value;
    @Value("${com.abin.number}")
    private Integer number;
    @Value("${com.abin.bignumber}")
    private Long bignumber;
    @Value("${com.abin.test1}")
    private Integer test1;
    @Value("${com.abin.test2}")
    private Integer test2;

    @Value("${config.server.port}")
    private Integer serverPort;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBignumber() {
        return bignumber;
    }

    public void setBignumber(Long bignumber) {
        this.bignumber = bignumber;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }
}
