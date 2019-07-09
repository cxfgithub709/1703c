package com.bw.entity;

public class Shop {
	private Integer sid;
	private String sname;
	private String stime;
	private Integer pid;
	private String pname;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
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
		return "Shop [sid=" + sid + ", sname=" + sname + ", stime=" + stime + ", pid=" + pid + ", pname=" + pname + "]";
	}
	public Shop(Integer sid, String sname, String stime, Integer pid, String pname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.stime = stime;
		this.pid = pid;
		this.pname = pname;
	}
	public Shop() {
		super();
	}
	
	
	
	
}
