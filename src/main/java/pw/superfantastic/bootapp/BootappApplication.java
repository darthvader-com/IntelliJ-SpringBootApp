package pw.superfantastic.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "pw.superfantastic.*")
public class BootappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootappApplication.class, args);
    }

}
