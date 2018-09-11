package org.aidan.aidanfiddler01http.web;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public Map<String, Object> hello1(Integer type) {
        Map<String, Object> resp = new HashMap<>(2);
        System.out.println("type = " + type);
        resp.put("code", 0);
        resp.put("msg", "操作成功！");
        return resp;
    }


    @PostMapping("/world")
    public Map<String, Object> hello2(@RequestBody JSONObject jsonObject) {
        Map<String, Object> resp = new HashMap<>(2);
        Integer type = jsonObject.getInteger("type");
        System.out.println("type = " + type);
        resp.put("code", 0);
        resp.put("msg", "操作成功！");
        return resp;
    }

    @PutMapping("/world")
    public Map<String, Object> hello3(@RequestBody JSONObject jsonObject) {
        Map<String, Object> resp = new HashMap<>(2);
        Integer type = jsonObject.getInteger("type");
        System.out.println("type = " + type);
        resp.put("code", 0);
        resp.put("msg", "操作成功！");
        return resp;
    }

    @DeleteMapping("/world")
    public Map<String, Object> hello4(Integer type) {
        Map<String, Object> resp = new HashMap<>(2);
        System.out.println("type = " + type);
        resp.put("code", 0);
        resp.put("msg", "操作成功！");
        return resp;
    }
}
