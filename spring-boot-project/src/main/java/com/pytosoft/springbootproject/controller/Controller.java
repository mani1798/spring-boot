package com.pytosoft.springbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pytosoft.springboot.empservice.ServiceImpl;
import com.pytosoft.springbootcontroller.entity.Employee;

import jakarta.transaction.Transactional;

@RestController
public class Controller {
	@Autowired
	private ServiceImpl service;
	
//	@Autowired
//	private Employee employee;
	
	@GetMapping("/hello")
	public String hello() {
			return service.hello();
	}
//	@PostMapping("/signup")
//	@Transactional
//	public Employee signup(@RequestBody Employee Mani) {
//		System.out.println("Mani---"+Mani);
//		
//		return service.signup(Mani);
//		}
	

}
