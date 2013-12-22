/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.starter;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

/**
 * 启动
 * @author jeff
 * info  Starter.java 下午10:47:06
 */
public class Starter {
	
	public static void init()
	{
		init("log/log4j.properities");
	}
	
	/**
	 * 启动时进行初始化
	 * @param log4jPath log4j的配置文件目录
	 */
	public static void init(String log4jPath)
	{
		initLog4j(log4jPath);
	}
	
	/**
	 * 初始化log4j
	 * @param path
	 */
	private static void initLog4j(String path)
	{
		try {
			//加载log4j的配置文件
			InputStream input = Starter.class.getClassLoader().getResourceAsStream(path);
			Properties properties = new Properties();
			properties.load(input);
			//
			PropertyConfigurator.configure(properties);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("无法加载log4j的配置文件，使用默认的配置");
		}
		BasicConfigurator.configure();
	}
}
