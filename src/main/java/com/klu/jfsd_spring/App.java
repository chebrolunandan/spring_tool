package com.klu.jfsd_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
    	College c1 =(College)context.getBean("col1");
        System.out.println( c1 );
        System.out.println("Hello World");
    }
}
