/**
 * Copyright (C) 2014 coney geng <coneylife@gmail.com> 
 * @Package com.coney.util
 * @Title: DateTools.java 
 * Author: coney Geng
 * Create Date: 2013-5-31下午12:26:13
 */

package com.coney.util;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import android.util.Log;

/**
 * @ClassName: DateTools
 * @Description: TODO
 * @author coney Geng
 * @date 2014年9月19日 下午5:23:17
 * 
 */
public class DateTools {

	/**
	 * 计算<code>date2</code>和<code>date1</code>相差的天数
	 * 
	 * 
	 * @param date1
	 * @param date2
	 * @return 如果<code>date2</code>和<code>date1</code>中有一个为null，返回0； 否则返回
	 *         <code>date2</code>和<code>date1</code>相差的天数
	 */
	public static int dateDiffer(Date date1, Date date2) {
		if (date1 == null || date2 == null)
			return 0;
		return (int) ((date2.getTime() + 28800000) / 86400000 - (date1
				.getTime() + 28800000) / 86400000);
	}

	/**
	 * 计算<code>date2</code>和<code>date1</code>相差的天数
	 * 
	 * 
	 * @param date1
	 * @param date2
	 * @return 如果<code>date2</code>和<code>date1</code>中有一个为null，返回0； 否则返回
	 *         <code>date2</code>和<code>date1</code>相差的天数
	 */
	public static int dateDiffer(java.sql.Date date1, java.sql.Date date2) {
		if (date1 == null || date2 == null)
			return 0;
		return (int) ((date2.getTime() + 28800000) / 86400000 - (date1
				.getTime() + 28800000) / 86400000);
	}

	public static int dateDiffer(Timestamp date1, Timestamp date2) {
		if (date1 == null || date2 == null)
			return 0;
		return (int) ((date2.getTime() + 28800000) / 86400000 - (date1
				.getTime() + 28800000) / 86400000);
	}

	/**
	 * 将字符串的日期转换成<code>java.sql.Timestamp</code>对象
	 * 
	 * @param str
	 *            字符串日期。支持两种格式：yyyy-MM-dd或者yyyy-MM-dd HH:mm:ss
	 * @return 字符串日期的转换结果。如果<code>str</code>为空或者不匹配给定的两种格式之一，则返回空
	 */
	public static Timestamp str2Timestamp(String str) {
		if (str == null)
			return null;
		str = str.trim();
		if (!str.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\d$")
				&& !str.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\d \\d\\d:\\d\\d:\\d\\d$"))
			return null;

		String[] ss = str.split("-| |:");
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, Integer.parseInt(ss[0]));
		gc.set(Calendar.MONTH, Integer.parseInt(ss[1]) - 1);
		gc.set(Calendar.DAY_OF_MONTH, Integer.parseInt(ss[2]));
		if (ss.length == 6) {
			gc.set(Calendar.HOUR_OF_DAY, Integer.parseInt(ss[3]));
			gc.set(Calendar.MINUTE, Integer.parseInt(ss[4]));
			gc.set(Calendar.SECOND, Integer.parseInt(ss[5]));
		}
		return new Timestamp(gc.getTimeInMillis());
	}

	public static java.sql.Date str2Date(String str) {
		if (str == null)
			return null;
		str = str.trim();
		if (!str.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\d$")
				&& !str.matches("^\\d\\d\\d\\d-\\d\\d-\\d\\d \\d\\d:\\d\\d:\\d\\d$"))
			return null;

		String[] ss = str.split("-| |:");
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.YEAR, Integer.parseInt(ss[0]));
		gc.set(Calendar.MONTH, Integer.parseInt(ss[1]) - 1);
		gc.set(Calendar.DAY_OF_MONTH, Integer.parseInt(ss[2]));
		if (ss.length == 6) {
			gc.set(Calendar.HOUR_OF_DAY, Integer.parseInt(ss[3]));
			gc.set(Calendar.MINUTE, Integer.parseInt(ss[4]));
			gc.set(Calendar.SECOND, Integer.parseInt(ss[5]));
		}
		return new java.sql.Date(gc.getTimeInMillis());
	}

	@SuppressWarnings("deprecation")
	public static String date2String(java.sql.Date date) {
		if (date == null)
			return "";
		return (date.getYear() + 1900) + "-" + (date.getMonth() + 1) + "-"
				+ date.getDate();
	}

	/** 
	* @Title: getDelayTime 
	* @Description: get the subtract of params.
	* @param @param receiveTime long
	* @param @param sendTime long
	* @param @return    
	* @return double    
	* @throws 
	*/
	public static double getDelayTime(long receiveTime, long sendTime) {
		double a = receiveTime - sendTime;
		return a / 1000;
	}
}
