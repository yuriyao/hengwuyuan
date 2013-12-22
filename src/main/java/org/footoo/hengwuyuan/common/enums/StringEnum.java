/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.enums;

import java.util.HashMap;
import java.util.Map;

import org.footoo.hengwuyuan.common.util.ToString;

/**
 * 字符串枚举
 * @author jeff
 * info  StringEnum.java 上午12:04:24
 */
public class StringEnum extends ToString{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5029425784980962257L;
	/** 存的字符串值 */
	private final String value;
	/** 实现享元模式 */
	private final static Map<String, StringEnum> pool = new HashMap<String, StringEnum>();
	
	private StringEnum()
	{
		this(null);
	}
	
	private StringEnum(String value)
	{
		if(value == null)
			value = "";
		this.value = value;
	}
	
	/**
	 * 虽然value可以为null，但建议不要这样使用，最好直接用""
	 * @param value
	 * @return
	 */
	public static StringEnum create(String value)
	{
		StringEnum ret;
		
		if(value == null)
			value = "";
		synchronized(pool)
		{
			ret = pool.get(value);
			if(ret == null)
			{
				ret = new StringEnum(value);
				pool.put(value, ret);
			}
		}
		return ret;
	}
	
	public String getValue()
	{
		return value;
	}
}
