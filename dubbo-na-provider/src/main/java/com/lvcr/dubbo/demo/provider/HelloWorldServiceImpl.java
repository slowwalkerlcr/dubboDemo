package com.lvcr.dubbo.demo.provider;

import com.lvcr.dubbo.demo.api.IHelloWorldService;

public class HelloWorldServiceImpl implements IHelloWorldService{

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello :"+name;
	}

}
