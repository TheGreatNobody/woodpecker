package tw.com.nobody.woodpecker;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("tw.com.nobody.woodpecker.models.mapper")
public class WoodpeckerApplication {

	public static void main(String[] args) {
		log.warn("warn");
		log.info("info");
		log.error("error");
		log.debug("debug");
		SpringApplication.run(WoodpeckerApplication.class, args);
	}

}
