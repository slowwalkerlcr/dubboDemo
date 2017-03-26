package com.lvcr.dubbo.demo.dubbo_provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  dubbo点对点演示——provider
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	try {
    		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
    		context.start();
			System.in.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
