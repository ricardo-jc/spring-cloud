package rjc.cloud.feignconsumer.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import rjc.cloud.feignconsumer.entity.User;
import rjc.cloud.feignconsumer.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rjc.cloud.feignconsumer.service.RefactorHelloService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ConsumerController {
    private final HelloService service;
    private final RefactorHelloService refactorService;

    @RequestMapping(value = "/feign-consumer")
    public String helloConsumer() {
        return service.hello();
    }

    @RequestMapping(value = "/feign-consumer2")
    public String hellConsumer2() {
        return service.hello() + "\n"
                + service.hello("xixi") + "\n"
                + service.hello("haha",23) + "\n"
                + service.hello(new User("hehe", 22)) + "\n";
    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        return refactorService.hello("xixi") + "\n"
                + refactorService.hello("haha", 22) + "\n"
                + refactorService.hello(new rjc.cloud.helloserviceapi.entity.User("hehe", 23));
    }
}
