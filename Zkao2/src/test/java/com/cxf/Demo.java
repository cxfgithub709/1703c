package com.cxf;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Demo {

	@Test  //测试是否为真
	public void fun1(){
		try {
			AssertUtil.isTrue(false, "这不是真的");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test  //测试是否为假
	public void fun2(){
		try {
			AssertUtil.isFalse(true, "这不是假的");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test  //测试是否为空果
	public void fun3(){
		try {
			AssertUtil.notNull("","为空");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Test  //测试不为空
	public void fun4(){
		try {
			AssertUtil.notNull("", "不为空");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test  //测试集合为空
	public void fun5(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(1);
			AssertUtil.notEmpty(arrayList, "集合为空");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Test   //测试集合为空
	public void fun6(){
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			AssertUtil.notEmpty(map, "集合为空");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test   //测试没有值
	public void fun7(){
		try {
			AssertUtil.hasText(" dadadad dadad", "没有值");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test  //测试小于或等于0
	public void fun8(){
		try {
			AssertUtil.greaterThanZero(new BigDecimal(0), "小于或等于0");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
