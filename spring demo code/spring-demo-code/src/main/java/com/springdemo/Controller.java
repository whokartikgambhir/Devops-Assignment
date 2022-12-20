package com.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // One syntax to implement a
    // GET method
    @GetMapping("/")
    public String home()
    {
        String str
                = "<html><body><font color=\"green\">"
                + "<h1>This is Demo SpringBoot Project for Jenkins Assignment</h1>"
                + "</font></body></html>";
        return str;
    }

    // Another syntax to implement a
    // GET method
    @RequestMapping(
            method = { RequestMethod.GET },
            value = { "/page" })

    public String info()
    {
        String str2
                = "<html><body><font color=\"red\">"
                + "<h2>Jenkins is an open-source automation tool written in Java"
                + " with plugins built for continuous integration. "
                + "Jenkins achieves Continuous Integration with the help of plugins. "
                + "Plugins allow the integration of Various DevOps stages. "
                + "well thought and well explained "
                + "solutions for selected questions."
                + "</h2></font></body></html>";
        return str2;
    }
}
