package org.aidan.web;

import org.aidan.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Aidan
 * @创建时间：2018/11/22 10:43 PM
 * @描述: HomeController
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        helloService.say("World");
        return "home";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestPart(value = "profilePicture") MultipartFile profilePicture) {
        try {
            profilePicture.transferTo(new File("/tmp/spittr/uploads/" + profilePicture.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "uploadSuccess";
    }
}
