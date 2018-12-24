package org.aidan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Aidan
 * @创建时间：2018/11/23 2:30 PM
 * @描述: ObjectNotFoundException
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "object not find")
public class ObjectNotFoundException extends RuntimeException {
}
