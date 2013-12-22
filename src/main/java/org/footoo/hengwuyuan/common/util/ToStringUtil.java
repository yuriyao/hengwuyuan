/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.footoo.hengwuyuan.common.data.UserBaseInfo;
import org.footoo.hengwuyuan.common.data.UserInfo;

/**
 * 自动打印类信息的工具
 * 
 * @author jeff info ToStringUtil.java 下午11:19:15
 */
public class ToStringUtil {

	/** 最大递归打印的深度 */
	private static final int MAX_DEPTH = 3;

	/** 基本的类 */
	private static final List<Class<?> > baseClasses = new ArrayList<Class<?> >();
	
	/** 跳过的field名 */
	private static final List<String> ignoreFields = new ArrayList<>();
	
	private static int init = 0;

	static {
		baseClassesInit();
		
		ignoreFields.add("serialVersionUID");
	}
	
	private static void baseClassesInit()
	{
		//单次初始化
		if(init != 0)
			return;
		init = 1;
		
		baseClasses.add(Integer.class);
		baseClasses.add(Integer.TYPE);
		baseClasses.add(Character.class);
		baseClasses.add(Character.TYPE);
		baseClasses.add(Short.class);
		baseClasses.add(Short.TYPE);
		baseClasses.add(Long.class);
		baseClasses.add(Long.TYPE);
		baseClasses.add(Double.class);
		baseClasses.add(Double.TYPE);
		baseClasses.add(Float.class);
		baseClasses.add(Float.TYPE);
		baseClasses.add(Boolean.class);
		baseClasses.add(Boolean.TYPE);
		baseClasses.add(String.class);
	}

	public static String getString(Object obj) {
		//可能直接使用这个方法时，类还没有初始化，导致不能初始化
		if(baseClasses.isEmpty())
			baseClassesInit();
		
		return getString(obj, 0);

	}

	/**
	 * 递归进入每一个实例
	 * 
	 * @param obj
	 * @param depth
	 * @return
	 */
	private static String getString(Object obj, int depth) {
		// 参数检查
		if (obj == null)
			return "null";
		//超出最大的递归深度
		if(depth > MAX_DEPTH)
			return "...";
		
		//获取类别
		Class<?> clz = obj.getClass();
		//增加递归深度
		depth ++;
		//暂时存放结果
		StringBuffer result = new StringBuffer();
		//类名
		result.append(clz.getName());
		//添加所有的field
		result.append("\n");
		result.append(printInline(depth - 1));
		result.append("[\n");
		Field fields[] = clz.getDeclaredFields();

		for (Field field : fields) {
			StringBuffer t = new StringBuffer();
			try {
				field.setAccessible(true);
				
				/** 跳过一些无意义的field */
				if(ignoreFields.contains(field.getName()))
					continue;
				
				/** 跳过常量 */
				if((field.getModifiers() & Modifier.FINAL) != 0 &&
						(field.getModifiers() & Modifier.STATIC) != 0)
					continue;
				
				t.setLength(0);
				t.append(printInline(depth));
				t.append(field.getName());
				t.append("=");

				// 这是基本类
				if (baseClasses.contains(field.getType()))
					t.append(field.get(obj));
				else {
					t.append(getString(field.get(obj), depth));
				}
				t.append("\n");
				result.append(t);
			} catch (Exception e) {
				// 异常忽略
				e.printStackTrace();
			}
		}
		result.append(printInline(depth - 1));
		result.append("]");
		return result.toString();
	}
	
	public static void main(String args[])
	{
		UserInfo info = new UserInfo();
		
		UserBaseInfo baseInfo = new UserBaseInfo();
		
		baseInfo.setEmail("heishijj@gmail.com");
		info.setBaseInfo(baseInfo);
		
		System.out.println(getString(info));
		
		System.out.println(baseClasses.contains("s".getClass()));
	}
	
	private static String printInline(int number)
	{
		StringBuffer buffer = new StringBuffer();
		number = number < 0 ? 0 : number;
		for(int i = 0; i < number; i ++)
			buffer.append("    ");
		return buffer.toString();
	}
}
