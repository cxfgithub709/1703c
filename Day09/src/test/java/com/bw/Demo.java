package com.bw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import org.junit.Test;

public class Demo {

	@Test
	public void Test1(){
		
		OutputStream oStream = new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		StreamUtil.closeAll(oStream);
	}
	
	@Test
	public void Test2(){
		
		
		InputStream src = new InputStream() {
			
			@Override
			public int read() throws IOException {
				return 0;
			}
		};
		
		OutputStream out = new OutputStream() {
			
			@Override
			public void write(int b) throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
				
	}
	
	
	@Test
	public void Test3() throws Exception{
		
		File file = new File("D:test.txt");
		
		StreamUtil.readTextFile(file);
		
		
	}
	
	
	
	@Test
	public void Test4() throws Exception{
		
		InputStream src = new InputStream() {
			
			@Override
			public int read() throws IOException {
				return 0;
			}
		};
		
		StreamUtil.readTextFile(src);
		
		
	}
		
	@Test
	public void Test5(){
		String message = "huahu1";
		StreamUtil.readStringFromSystemIn(message);
		
	}
	
	@Test
	public void Test6(){
		String message = "1";
		StreamUtil.readIntFromSystemIn(message);
		
		
	}
	
	
}
