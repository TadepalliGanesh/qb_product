package com.example.cart.order;

import com.example.cart.order.helloService.HelloService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/helloController")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @PostMapping("/hello")
    public void sendHelloMessage(@RequestBody String message) {
        helloService.sendMessage("Consumer is "+message);
    }

}
