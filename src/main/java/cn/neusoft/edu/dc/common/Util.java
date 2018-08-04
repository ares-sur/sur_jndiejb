/*
 * @(#) Util.java 1.0 2012-10-22
 *
 *   FILENAME     : Util.java
 *   CREATE DATE  : 2012-10-22
 *   AUTHOR       :  ����
 *   MODIFIED BY  : 
 *   DESCRIPTION  : 
 *
 */
package cn.neusoft.edu.dc.common;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Util {

	/**
	 * Web�������ж϶����Ƿ�Ϊ��
	 * �ַ�������Ϊ�㱻����Ϊ��
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
	 * �����Ƿ�Ϊ��
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Object obj){
		return !isEmpty(obj);
	}
	
	/**
	 * ��yyyy-MM-dd��ʽ��������
	 * @return
	 */
	public static String getLocalDate(){
		return getDate("yyyy-MM-dd");
	}
	
	/**
	 * ��ָ����ʽ�������ڴ�
	 * @param format
	 * @return
	 */
	public static String getDate(String format){
		return new SimpleDateFormat(format).format(new Date());
	}
	
	/**
	 * ���ݸ��������ȫ·������һ���µĶ���
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
