/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util;

import org.apache.log4j.Logger;


/**
 * 简单封装一下log
 * @author jeff
 * info  LoggerUtil.java 下午10:32:44
 */
public class LoggerUtil {
	
	
	/**
	 * 简单封装一下log的info
	 * @param log
	 * @param message
	 */
	public static void info(Logger log, Object ... messages)
	{
		if(log.isInfoEnabled())
		{
			log.info(varsToString(messages));
		}
	}
	
	/**
	 * 简单封装一下log的debug
	 * @param log
	 * @param messages
	 */
	public static void debug(Logger log, Object ... messages)
	{
		if(log.isDebugEnabled())
		{
			log.debug(varsToString(messages));
		}
	}
	
	/**
	 * 
	 * @param log
	 * @param messages
	 */
	public static void error(Logger log, Object ...messages)
	{
		log.error(varsToString(messages));
	}
	
	/**
	 * 
	 * @param log
	 * @param messages
	 */
	public static void warn(Logger log, Object ...messages)
	{
		log.warn(varsToString(messages));
	}
	
	/**
	 * 将多个变量转换为字符串
	 * @param messages
	 * @return
	 */
	private static String varsToString(Object ...messages)
	{
		StringBuffer buffer = new StringBuffer();
		for(Object message : messages)
		{
			buffer.append(message);
			buffer.append("\t");
		}
		return buffer.toString();
	}
	
	
}
