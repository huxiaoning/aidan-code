package org.aidan.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Aidan
 * @创建时间：2018/11/12 上午11:05
 * @描述: HomeController
 */
@Controller
@RequestMapping(value = {"/", "/homepage"})
public class HomeController {

    @RequestMapping(method = {RequestMethod.GET})
    public String home() {
        return "home";
    }
}
