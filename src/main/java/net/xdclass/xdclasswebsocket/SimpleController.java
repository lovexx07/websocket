package net.xdclass.xdclasswebsocket;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "hello world";
    }
}
