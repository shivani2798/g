package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contrtoller
{
@RequestMapping("/hello")
public Object helloWorld()
{
	return new Date();
}
}
