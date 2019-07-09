package com.bw.entity;

public class Ping {
	private Integer pid;
	private String pname;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Ping [pid=" + pid + ", pname=" + pname + "]";
	}
	public Ping(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Ping() {
		super();
	}
	
	
	
	
	
}
