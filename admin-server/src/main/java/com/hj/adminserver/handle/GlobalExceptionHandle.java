package com.hj.adminserver.handle;


import com.hj.adminserver.exceptions.NoLoginException;
import com.hj.adminserver.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    public String handlerNoLoginException(Exception exception)
    {

        log.error(exception.getMessage());
        return exception.getMessage();
    }

}
