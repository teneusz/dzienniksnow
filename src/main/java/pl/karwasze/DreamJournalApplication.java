package pl.karwasze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class DreamJournalApplication {

	//Komentarz testowy sprawdzający jenkinsa
	public static void main(String[] args) {
		SpringApplication.run(DreamJournalApplication.class, args);
	}
}
