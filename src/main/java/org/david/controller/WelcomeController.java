package org.david.controller;

import org.david.entity.Test;
import org.david.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @Resource(name = "testService")
    private TestService testService;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap mm) {

        List<Test> list = this.testService.find();

        this.testService.add(new Test("david", 31));

        mm.addAttribute("message", list.get(32).getName());
//        mm.addAttribute("content", sb.toString());

        return "hello";
    }



}
