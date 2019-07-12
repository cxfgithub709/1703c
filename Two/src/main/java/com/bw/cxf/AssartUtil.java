package com.bw.cxf;

import java.util.Collection;

import javax.sound.midi.MidiMessage;

public class AssartUtil {

	
	/**
	 *  1.断言为真
	 * @param exp
	 * @param message
	 */
	public  static void isTrue(Boolean exp,String message){
		if(!exp){
		 throw	new runtimeException(message);
		}
	}
	
	/**
	 * 断言为假；
	 */
	public static void isFalse(Boolean exp,String message){
		if(exp){
			throw new runtimeException(message);
		}
	}
	
	/**
	 *断言对象不为空； 
	 */
	public static void  isNull(String exp,String message){
		if(exp == null||exp.length()==0){
			throw new runtimeException(message);
		}
	}
	
	/**
	 * 断言对象必须空；
	 */
	public static void  Null(String exp,String message){
		if(!(exp == null||exp.length()==0)){
			throw new runtimeException(message);
		}
	}
	
	
	/**
	 * 断言 List 或 Set 集合不为空，没有元素也算空；
	 */
	public static void  Collections(Collection<?> exp,String message){
		if(exp ==null || exp.size()==0 ){
			throw new runtimeException(message);
		}
	}
	
	

	/**
	 * 断言字符串必须有值，去掉空格后，长度必须大于 0；
	 */
	public static void  iszhi(String  exp,String message){
		if(!(exp.trim().length() >0 )){
			throw new runtimeException(message);
		}
	}
	
	
	
	
}
