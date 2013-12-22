/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.test;

import org.apache.log4j.Logger;
import org.footoo.hengwuyuan.common.util.LoggerUtil;
import org.footoo.hengwuyuan.starter.Starter;

/**
 * @author jeff
 * info  LogTest.java 下午10:39:13
 */
public class LogTest {
	public static void main(String args[])
	{
		Starter.init();
		Logger log = Logger.getLogger(LogTest.class);
		LoggerUtil.info(log, "hello", "you", log);
		LoggerUtil.debug(log, "lin", "meimei");
	}
}
