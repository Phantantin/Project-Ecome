package org.example.projectecome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example", "org.example.projectecome"})
public class ProjectEcomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectEcomeApplication.class, args);
    }
}
