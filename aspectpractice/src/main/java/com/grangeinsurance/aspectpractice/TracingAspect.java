package com.grangeinsurance.aspectpractice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RefreshScope
public class TracingAspect {
	
	@Value("${spring.datasource.username}")
	private String username;

	@Pointcut("execution(String com.grangeinsurance.aspectpractice.AspectPracticeService.sayHello(String))")
	public void sayHelloMethod() {/* Left Empty */}
	
	@Before ("sayHelloMethod()")
	public void beforeEntering (JoinPoint joinpoint) {
		System.out.println("Before Entering Method");
	}
	
	@Around ("sayHelloMethod()")
	public String aroundMethod (ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Advice for Method");
		return (String) pjp.proceed(new Object[] {username});
	}
}
