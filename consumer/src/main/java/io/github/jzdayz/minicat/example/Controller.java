package io.github.jzdayz.minicat.example;

import io.github.jzdayz.minicat.LoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    private LoadBalancer loadBalancer;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public Object test(){

        String host = loadBalancer.chose("p_service");
        return restTemplate.getForObject("http://"+host+"/test",String.class);

    }
}
