package com.cognizant.spring_learn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication(scanBasePackages = "com.cognizant.spring_learn")
public class SpringLearnApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {

		log.info("Start");
		SpringApplication.run(SpringLearnApplication.class, args);
//		displayCountry();
		displayDate();
		log.info("end");

	}

	private static void displayCountry(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country");
		log.debug("Country : {}", country.toString());
	}

	private static void displayDate(){
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date parsedDate = format.parse("31/12/2018");
			System.out.println(parsedDate);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
