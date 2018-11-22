package org.aidan.web;

import org.aidan.data.SpitterRepository;
import org.aidan.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author Aidan
 * @创建时间：2018/11/14 下午5:10
 * @描述: SpittleController
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    private SpitterRepository spitterRepository;

    @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        /**
         * 参数校验
         * spring mvc 使用 JSR303 AOP 参考：https://blog.csdn.net/gaoshanliushui2009/article/details/46288273
         * 其中 BindingResult是Errors的子接口
         */

        if (errors.hasErrors()) {
            return "registerForm";
        }

        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = {"/{username}"}, method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, ModelMap modelMap) {
        Spitter spitter = spitterRepository.findByUserName(username);
        modelMap.addAttribute(spitter);
        return "profile";
    }
}
