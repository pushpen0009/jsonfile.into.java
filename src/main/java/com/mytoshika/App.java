package com.mytoshika;

import java.io.File;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mytoshika.dto.Employee;

@SpringBootApplication
public class App  implements CommandLineRunner {
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        File file = ResourceUtils.getFile("classpath:employee.json");
        ObjectMapper objectMapper = new ObjectMapper();
        Employee emp = objectMapper.readValue(file, Employee.class);
        
        System.out.println(emp);
    }
}
