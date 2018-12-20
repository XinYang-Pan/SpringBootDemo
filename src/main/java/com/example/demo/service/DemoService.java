package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.dao.HelloDao;
import com.example.demo.po.HelloPo;

@Service
public class DemoService {

	@Autowired
	private HelloDao helloDao;

	public Iterable<HelloPo> query(String q) {
		if (StringUtils.isEmpty(q)) {
			return helloDao.findAll();
		}
		return helloDao.findByUsername(q);
	}

}
