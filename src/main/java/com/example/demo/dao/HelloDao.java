package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.po.HelloPo;

public interface HelloDao extends CrudRepository<HelloPo, Long> {

	List<HelloPo> findByUsername(String username);

}
