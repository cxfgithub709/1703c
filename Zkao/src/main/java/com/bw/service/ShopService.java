package com.bw.service;

import java.util.List;

import com.bw.entity.Ping;
import com.bw.entity.Shop;

public interface ShopService {
	
	//列表
	List<Shop> listall(String sname);

	List<Ping> pingall();

	int addping(Shop shop);

	Shop pdate(int sid);

	int delall(String ids);
	
}
