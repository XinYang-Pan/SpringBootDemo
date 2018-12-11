package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.HelloDao;
import com.example.demo.po.HelloPo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DemoController {
	@Autowired
	private HelloDao helloDao;

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/query")
	public String query(String q, Model model) {
		List<HelloPo> helloPos = helloDao.findByUsername(q);
		model.addAttribute("hellos", helloPos);
		return "query";
	}

	@GetMapping("/queryRest")
	@ResponseBody
	public List<HelloPo> query(String q) {
		return helloDao.findByUsername(q);
	}

	@PostMapping("/hello")
	public String hello(String username, Model model) {
		log.info("username is " + username);
		model.addAttribute("msg", "Hello " + username);
		helloDao.save(new HelloPo(username));
		return "index";
	}

}
