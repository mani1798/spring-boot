package com.pytosoft.springboot.empservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.pytosoft.springbootcontroller.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class HelloService implements ServiceImpl{
//	public HelloService() {
//		super();
//	}
	@Override
	public String hello() {
		return "hello My name is Mani ";
}
//	@Override
//    @Transactional
//	public Employee signup(Employee Mani) {
//		return Mani;
//}
}