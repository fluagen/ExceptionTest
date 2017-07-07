package com.example.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.TestException2;
import com.example.service.TestService2;

/**
 * Created by Ricky on 2017/3/24.
 */
@RestController
@RequestMapping("test2")
public class TestController2 {

    @Resource
    private TestService2 testService2;

    @RequestMapping("test1")
    public void test1() throws TestException2 {
    	testService2.test1();
    }

    @RequestMapping("test2")
    public void test2() throws TestException2{
    	testService2.test2();
    }
}
