package com.bw;

import java.util.ArrayList;

import org.junit.Test;

import com.bw.cxf.AssartUtil;
import com.bw.cxf.runtimeException;

public class TwoDemo {

	@Test
	public void fun1(){
		try {
			AssartUtil.isTrue(false, "不是一个真的");
		} catch (runtimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2(){
		try {
			AssartUtil.isFalse(true, "不是一个假的");
		} catch (runtimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3(){
		try {
			AssartUtil.isNull("hgjgjhgjh", "对象为空");
		} catch (runtimeException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fun4(){
		try {
			AssartUtil.isNull("hjkhjk", "对象不为空");
		} catch (runtimeException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun5(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(1);
			AssartUtil.Collections(arrayList, "集合为空");
		} catch (runtimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun6(){
		try {
			AssartUtil.iszhi("uiui uiui ", "字符串为空");
		} catch (runtimeException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
