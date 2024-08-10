package tw.com.nobody.woodpecker.api.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tw.com.nobody.woodpecker.api.ao.SampleRespAo;

import java.util.Optional;

@RestController
@RequestMapping("/sample")
@Log4j2
public class SampleRestController {

    @Value("${system.env:none}")
    private String env;

    @Value("${spring.application.name}")
    private String appName;

    // from pom.xml properties java.version
    @Value("${system.java-version}")
    private String javaVersion;

    @Value("${system.author:Ryan}")
    private String author;

    @GetMapping("/hello")
    String sayHello(@RequestParam Optional<String> name){
        log.debug("your name is {}", name);
        return "Hello " + name.orElse("World");
    }


    @GetMapping("/system/info")
    String getSystemInfo(){
        return env + " " + appName + " " + author + " " + javaVersion + " " + System.getProperty("os.name") + " " + System.getProperty("os.version");
    }

    @GetMapping(value = "/sample", produces = "application/json")
    public SampleRespAo getSample(){
        return  SampleRespAo.builder()
                .name(null)
                .age(null)
                .address("  ")
                .job("programmer")
                .sex("male")
                .build();
    }

}
