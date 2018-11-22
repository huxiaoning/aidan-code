package org.aidan.web;

import org.aidan.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Aidan
 * @创建时间：2018/11/13 上午10:25
 * @描述: SpittleController
 */
@Controller
@RequestMapping("/spittles")
public class SpittlesController {

    private static final String MAX_LONG_AS_STRING = Long.MAX_VALUE + "";

    @Autowired
    private SpittleRepository spittleRepository;

    @RequestMapping(method = {RequestMethod.GET})
    public String spittles(
            @RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count", defaultValue = "20") int count,
            Model model
    ) {
        model.addAttribute("spittleList", spittleRepository.findSpittles(max, count));
        return "spittles";
    }

    @RequestMapping(value = {"/show/{spittleId}"}, method = RequestMethod.GET)
    public String showSpittle(
            @PathVariable(value = "spittleId") long spittleId,
            ModelMap model
    ) {
        model.put("spittle", spittleRepository.findOne(spittleId));
        return "spittle";
    }


}
