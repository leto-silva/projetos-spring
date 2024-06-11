package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projet Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 *  - Spring Data JPA
 *  - Spring Web
 *  - H2 Database
 *  - OpenFeign
 *  
 *  @author eugenio.silva
 */
@EnableFeignClients
@SpringBootApplication(scanBasePackages={
		"one.digitalinnovation.gof.service"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
