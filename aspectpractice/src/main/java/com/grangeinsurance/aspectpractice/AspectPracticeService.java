package com.grangeinsurance.aspectpractice;

import org.springframework.stereotype.Service;

@Service
public class AspectPracticeService {
       
       public String sayHello(String name) {
              return new StringBuilder("Hello ")
                     .append(name)
                     .toString();
       }
}