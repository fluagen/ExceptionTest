package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ricky on 2017/3/24.
 */
@ControllerAdvice
public class GlobalControlAdvice {

    @ExceptionHandler(TestException2.class)
    @ResponseBody
    public String exceptionHandler(TestException2 e) {
        e.printStackTrace();
        return e.getMessage();
    }
}
