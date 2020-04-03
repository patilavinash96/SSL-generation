package com.example.SSLExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSlOperation {

	@RequestMapping(value="/SSlOperation",produces="application/json",method=RequestMethod.GET)
	public String search()
	{
		return "hello";
	}
}
