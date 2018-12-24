package org.aidan.web.advice;

import org.aidan.exception.DuplicateObjectException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Aidan
 * @创建时间：2018/11/23 3:04 PM
 * @描述: ControllerAdvice    控制器通知类
 */
@ControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(DuplicateObjectException.class)
    public String duplicateObjectHandler() {
        return "error/duplicate";
    }
}
