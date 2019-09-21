package com.hacks.devbackend.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Check {
	@Before(value = "*.*.set*(..)")
	void runBefore() {
		System.out.println("aspect before run");
	}
	@After(value = "*.*.set*(..)")
	void runAfter() {
		System.out.println("aspect after run");
	}
}
