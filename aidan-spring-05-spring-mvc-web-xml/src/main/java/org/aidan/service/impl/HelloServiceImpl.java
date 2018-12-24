package org.aidan.service.impl;

import org.aidan.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author Aidan
 * @创建时间：2018/11/22 10:48 PM
 * @描述: HelloServiceImpl
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public void say(String name) {
        System.out.println("Hello " + name);
    }
}
