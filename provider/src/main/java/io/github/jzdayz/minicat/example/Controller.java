package io.github.jzdayz.minicat.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/test")
    public Object test(){

        return "Hello word";

    }
}
