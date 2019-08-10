package com.example.demo;

import com.example.demo.entity.Parcela;
import com.example.demo.entity.Conta;
import com.example.demo.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class BootDemoApplication {
	@Autowired
	ContaRepository contaRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}


}
