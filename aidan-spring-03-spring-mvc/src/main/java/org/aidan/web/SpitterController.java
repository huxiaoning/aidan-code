package org.aidan.web;

import org.aidan.data.SpitterRepository;
import org.aidan.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

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
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
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
            List<ObjectError> allErrors = errors.getAllErrors();
            for (ObjectError objectError : allErrors) {
                System.out.println(objectError.getObjectName());
                System.out.println("---");
                Object[] arguments = objectError.getArguments();
                for (Object argument : arguments) {
                    System.out.println(argument);
                }
                System.out.println("---");
                System.out.println(objectError.getCode());
                System.out.println("---");
                String[] codes = objectError.getCodes();
                for (String code : codes) {
                    System.out.println(code);
                }
                System.out.println("---");
                System.out.println(objectError.getDefaultMessage());
            }
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
