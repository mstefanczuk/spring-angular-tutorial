package pl.stefan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)
@SpringBootApplication
public class SpringAngularTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularTutorialApplication.class, args);
	}
}
