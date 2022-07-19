package com.grangeinsurance.aspectpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectPracticeController {
       
       private AspectPracticeService service;
       
       public AspectPracticeController(AspectPracticeService service) {
              this.service = service;
       }
       
       @GetMapping("/hello/{name}")
       public String sayHello(@PathVariable("name") String name) {
              return service.sayHello(name);
       }
}

