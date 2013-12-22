/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util;

import java.io.Serializable;

/**
 * 使用ToStringUtil工具打印友好的对象的信息
 * 只要继承这个类，不用写toString函数，就可以实现
 * 获取友好的对象的字符串表示
 * @author jeff
 * info  ToString.java 下午11:38:26
 */
public class ToString implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -731776169307481487L;

	public String toString()
	{
		return ToStringUtil.getString(this);
	}
}
