package com.lvcr.dubbo.demo.dubbo_consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lvcr.dubbo.demo.api.IHelloWorldService;

/**
 * dubbo点对点演示——consumer
 *
 */
public class Consumer 
{
    public static void main( String[] args )
    {
    	try{
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
    	IHelloWorldService helloService=(IHelloWorldService)context.getBean("demoService");
    	String str = helloService.sayHello("Edison");
    	System.out.println("==================="+str);
    	System.in.read();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
