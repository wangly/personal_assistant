package com.fzu.pa.controller;

import com.fzu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lilian on 2017/8/13.
 */
@RestController
@RequestMapping("/knowledge")
public class KnowledgeController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Map test() {
        Map<String, Object> map = new HashMap();
        String result = testService.clear("sdfsfdf    ");
        map.put("code", "200");
        map.put("message", result);
        return map;
    }
}
