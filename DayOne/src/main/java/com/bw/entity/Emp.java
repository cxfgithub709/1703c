package com.bw.entity;

import java.security.KeyStore.PrivateKeyEntry;

public class Emp {

	private Integer eid;
	private String ename;
	private String sex;
	private int did;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", sex=" + sex + ", did=" + did + "]";
	}
	public Emp(Integer eid, String ename, String sex, int did) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sex = sex;
		this.did = did;
	}
	public Emp() {
		super();
	}
	
	
	
	
}
