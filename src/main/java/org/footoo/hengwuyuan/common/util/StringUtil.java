/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串的工具类
 * @author jeff
 * info  StringUtil.java 下午11:30:28
 */
public class StringUtil {
	/** 所有的空白字符 */
	private final static char BLANKS[] = {' ', '\t', '\n', '\r'};
	/** 空白字符列表 */
	private final static List<Character> BLANK_LIST = new ArrayList<Character>(); 
	
	
	static
	{
		//初始化空白字符列表
		for(int i = 0; i < BLANKS.length; i ++)
			BLANK_LIST.add(BLANKS[i]);
	}
	
	/**
	 * 字符串是否是空白的
	 * 包括str是null，或者str都是空白字符
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str)
	{
		if(str == null)
			return true;
		for(int i = 0; i < str.length(); i ++)
		{
			
			if(!BLANK_LIST.contains(str.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
}
