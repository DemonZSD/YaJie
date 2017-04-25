package com.cn.yajie.util.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class ConvertUtil {
	private static Logger logger = Logger.getLogger(ConvertUtil.class);
	public static int String2Int(String str){
		int result = 0;
		if(str!=null && !("").equals(str)){
			try {
				result = Integer.parseInt(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static String Data2String(Date date,String pattern){
		String dateStr = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			dateStr = sdf.format(date);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("格式化"+new Date()+"为"+pattern + "出错！");
			return "";
		}
		
		return dateStr;
	}
}
