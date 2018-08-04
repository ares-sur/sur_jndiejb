/*
 * @(#) Util.java 1.0 2012-10-22
 *
 *   FILENAME     : Util.java
 *   CREATE DATE  : 2012-10-22
 *   AUTHOR       :  刘阳
 *   MODIFIED BY  : 
 *   DESCRIPTION  : 
 *
 */
package cn.neusoft.edu.dc.common;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Util {

	/**
	 * Web环境下判断对象是否为空
	 * 字符串长度为零被定义为空
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj){
		if(obj==null)
			return true;
		if(obj instanceof String)
			return ((String)obj).trim().length()==0;
		return false;
	} 
	
	/**
	 * 对象是否不为空
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Object obj){
		return !isEmpty(obj);
	}
	
	/**
	 * 按yyyy-MM-dd格式返回日期
	 * @return
	 */
	public static String getLocalDate(){
		return getDate("yyyy-MM-dd");
	}
	
	/**
	 * 按指定格式返回日期串
	 * @param format
	 * @return
	 */
	public static String getDate(String format){
		return new SimpleDateFormat(format).format(new Date());
	}
	
	/**
	 * 根据给定的类的全路径返回一个新的对象
	 * @param clazz
	 * @return
	 */
	public static Object createObject(String clazz){
		Object obj=null;
		try {
			obj=Class.forName(clazz).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
