package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.HelloDao;
import com.example.demo.po.HelloPo;
import com.example.demo.service.DemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DemoPageController {
	@Autowired
	private DemoService demoService;
	@Autowired
	private HelloDao helloDao;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/query")
	public String query(String q, Model model) {
		model.addAttribute("hellos", demoService.query(q));
		return "query";
	}

	@PostMapping("/hello")
	public String hello(String username, Model model) {
		log.info("username is " + username);
		model.addAttribute("msg", "Hello " + username);
		helloDao.save(new HelloPo(username));
		return "index";
	}

}
