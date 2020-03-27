package ua.lviv.iot.spring.labseven.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({" ua.lviv.iot.spring.labseven.data",
	"ua.lviv.iot.spring.labseven.business","ua.lviv.iot.spring.labseven.rest.RestAplication.controller"})
@EnableJpaRepositories({"ua.lviv.iot.spring.labseven.data"})
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
