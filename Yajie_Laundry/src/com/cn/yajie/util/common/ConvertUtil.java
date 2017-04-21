package com.cn.yajie.util.common;

public class ConvertUtil {
	public static int String2Int(String str){
		int result = 0;
		if(str!=null && ("").equals(str)){
			try {
				result = Integer.parseInt(str);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
