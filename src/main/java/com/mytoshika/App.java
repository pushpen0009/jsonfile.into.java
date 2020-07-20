package com.mytoshika;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mytoshika.dto.Derived;
import com.mytoshika.dto.Employee;
import com.mytoshika.dto.RuleEngine;

@SpringBootApplication
public class App  implements CommandLineRunner {
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    Derived derived = new Derived();
	    
        Employee emp = objectMapper.readValue(ResourceUtils.getFile("classpath:employee.json"), Employee.class);
        RuleEngine rtr = objectMapper.readValue(ResourceUtils.getFile("classpath:rtr.json"), RuleEngine.class);

	    String oldEmpExp = emp.getEmpId() + rtr.getOldEmployee().getOperator() + rtr.getOldEmployee().getValue();
        derived.setOldEmployee((Boolean)engine.eval(oldEmpExp));
        
	    String goodSalaryExp = emp.getSalary() + rtr.getGoodSalary().getOperator() + rtr.getGoodSalary().getValue();
        derived.setGoodSalary((Boolean)engine.eval(goodSalaryExp));
        
        System.out.println(derived);
    }
}
