package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Emp;
import com.bw.mapper.EmpDao;

@Service
public class EmpServiceImpl implements EmpService{

	@Resource
	EmpDao dao;
	
	@Override
	public List<Emp> listall() {
		return dao.listall();
	}

}
