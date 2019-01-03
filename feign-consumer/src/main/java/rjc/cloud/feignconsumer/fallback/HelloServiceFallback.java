package rjc.cloud.feignconsumer.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import rjc.cloud.feignconsumer.entity.User;
import rjc.cloud.feignconsumer.service.HelloService;

@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String hello() {
        return "Service down.";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Service down.";
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("Unknow", 0);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Service down.";
    }
}
