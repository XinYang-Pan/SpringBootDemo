package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.po.HelloPo;
import com.example.demo.service.DemoService;

@RestController
public class DemoRestController {
	@Autowired
	private DemoService demoService;

	@GetMapping("/queryRest")
	public Iterable<HelloPo> query(String q) {
		return demoService.query(q);
	}

}
