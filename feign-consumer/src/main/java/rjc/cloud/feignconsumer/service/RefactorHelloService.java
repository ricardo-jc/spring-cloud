package rjc.cloud.feignconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import rjc.cloud.helloserviceapi.service.HelloService;

@FeignClient(value = "hello-service")
public interface RefactorHelloService extends HelloService {
}
