/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.enums;

import org.footoo.hengwuyuan.common.util.ToString;

/**
 * @author jeff
 * info  SexEnum.java 上午12:04:41
 */
public class SexEnum extends ToString{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8216875292485540473L;
	/** 男性枚举 */
	public static final SexEnum MALE = new SexEnum(0, "男");
	/** 女性枚举 */
	public static final SexEnum FEMALE = new SexEnum(1, "女");
	/** 无法区分性别枚举 */
	public static final SexEnum UNKNOWN = new SexEnum(1, "我也不知道啊");
	
	/** 整数枚举值 */
	private final IntEnum code;
	/** 字符串枚举值，存放备注 */
	private final StringEnum memo;
	
	private SexEnum(int code, String memo)
	{
		this.code = IntEnum.create(code);
		this.memo = StringEnum.create(memo);
	}
	
	public int getCode()
	{
		return code.getValue();
	}
	
	public String getMemo()
	{
		return memo.getValue();
	}
	
	public String toString()
	{
		return this.getMemo();
	}
}
