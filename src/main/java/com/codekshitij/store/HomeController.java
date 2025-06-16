package com.codekshitij.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index(){
//        String viewname = getviewname(); // this is a break point
//       // System.out.println(viewname); // for debugging where's the problem
//         return viewname;

        System.out.println("App Name : " + appName);
        return "index.html";
    }

//    private String getviewname(){
//        return "index.html";
//    }
}
