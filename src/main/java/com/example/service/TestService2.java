package com.example.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.example.enums.ErrorCode;
import com.example.exception.TestException2;

@Service
public class TestService2 {

    public void test1() throws TestException2 {
        throw new TestException2(ErrorCode.TEST_ERROR1);
    }

    public void test2() throws TestException2 {
        try {
            throw new SQLException();
        } catch (SQLException e) {
            throw new TestException2(ErrorCode.TEST_ERROR2, e);
        }

    }
}

