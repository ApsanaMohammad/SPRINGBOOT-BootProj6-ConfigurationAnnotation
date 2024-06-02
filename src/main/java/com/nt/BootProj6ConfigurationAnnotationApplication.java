package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.CompanyDetails;

@SpringBootApplication
public class BootProj6ConfigurationAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj6ConfigurationAnnotationApplication.class, args);
		
		CompanyDetails com=ctx.getBean("company",CompanyDetails.class);
		System.out.println(com);
	}

}
