package br.com.ehrm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EhrmagnagerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(EhrmagnagerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EhrmagnagerApplication.class, args);
		LOGGER.debug("--Application Started--");
	}
}
