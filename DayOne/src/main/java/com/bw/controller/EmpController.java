package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bw.entity.Emp;
import com.bw.service.EmpService;

@Controller
public class EmpController {

	@Resource
	EmpService service;
	
	@RequestMapping("list.do")
	public String listall(ModelMap map){
		List<Emp> list = service.listall();
		map.put("list", list);
		return "list";
	}
}
