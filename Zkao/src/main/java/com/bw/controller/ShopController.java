package com.bw.controller;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Ping;
import com.bw.entity.Shop;
import com.bw.service.ShopService;

@Controller
public class ShopController {
	//按照名称注入
	@Resource 
	ShopService service;

	
	//列表
	@RequestMapping("list.do")
	public String listall(ModelMap map,String sname){
		List<Shop> list = service.listall(sname);
		map.put("list", list);
		return "list";
	}
	
	//添加
	@RequestMapping("ping.do")
	@ResponseBody
	public String  pingall(){
		List<Ping> list = service.pingall();
		return "add";
	}
	//多对多添加
	@RequestMapping("addping.do")
	@ResponseBody
	public int addping(Shop shop){
		int save  = service.addping(shop);
		return save;
	}
	
	
	//查看详细
	@RequestMapping("update.do")	
	@ResponseBody
	public Shop update(int sid){
		Shop shop = service.pdate(sid);
		System.out.println(shop);
		return shop;
	}
	
	//批量删除
	@RequestMapping("delall.do")
	@ResponseBody
	public int deleteall(String ids){
		System.out.println(ids);
		int del = service.delall(ids);
		return del;
		
	}
	
}
