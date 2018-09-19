package com.training;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.training.model.Employe;
import com.training.service.EmployeService;
import com.training.service.IEmployeService;

@SpringBootApplication
public class DemoSpringBootMysqlApplication implements CommandLineRunner {

	@Autowired
	IEmployeService  employeService;
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Employe emp=new Employe();
		emp.setNom("dridi");
		emp.setPrenom("ramzi");
		employeService.add(emp);
   	List<Employe>	listemp=employeService.findAll();
	for (Employe employe : listemp) {
		System.out.println(employe.getNom()+" "+ employe.getPrenom());
		
	}
	}
}
