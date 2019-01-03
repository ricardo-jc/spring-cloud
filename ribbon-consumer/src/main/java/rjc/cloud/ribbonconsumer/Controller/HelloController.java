package rjc.cloud.ribbonconsumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rjc.cloud.ribbonconsumer.Service.HelloService;

@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @RequestMapping(value = "/hello")
    public String helloConsumer() {
        return service.Hello();
    }
}
