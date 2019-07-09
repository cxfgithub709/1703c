package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Ping;
import com.bw.entity.Shop;
import com.bw.mapper.ShopDao;

@Service
public class ShopServiceImpl implements ShopService{

	//按照名称注入
	@Resource
	ShopDao dao;
	
	@Override
	public List<Shop> listall(String sname) {
		return dao.listall(sname);
	}

	@Override
	public List<Ping> pingall() {
		return dao.pingall();
	}

	@Override
	public int addping(Shop shop) {
		return dao.addping(shop);
	}

	public Shop pdate(int sid) {
		return dao.pdate(sid);
	}

	@Override
	public int delall(String ids) {
		return dao.delall(ids);
	}

	
	
}
