package tw.com.nobody.woodpecker;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Log4j2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WoodpeckerApplication {

	public static void main(String[] args) {
		log.warn("warn");
		log.info("info");
		log.error("error");
		log.debug("debug");
		SpringApplication.run(WoodpeckerApplication.class, args);
	}

}
