/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.enums;

import java.util.HashMap;
import java.util.Map;

import org.footoo.hengwuyuan.common.util.ToString;

/**
 * 数字枚举的基本类
 * @author jeff
 * info  IntEnum.java 下午11:46:42
 */
public class IntEnum extends ToString{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9208310241392650780L;

	/** 维护的整数值，用来区别不同的枚举,只读的 */
	private final int value;
	
	/** 实现享元模式 */
	private static final Map<IntEnum, IntEnum> pool= new HashMap<IntEnum, IntEnum>(); 
	
	private IntEnum()
	{
		this(0);
	}
	
	private IntEnum(int value)
	{
		this.value = value;
	}
	
	/**
	 * 创建一个新的枚举，如果已经存在，则直接返回
	 * @param value 枚举值
	 * @return 返回创建成功的枚举
	 */
	public static IntEnum create(int value)
	{
		IntEnum key = new IntEnum(value);
		IntEnum _value;
		synchronized(pool)
		{
			_value = pool.get(key);
			if(_value == null)
			{
				pool.put(key, key);
				_value = key;
			}
		}
		return _value;
		
	}
	
	public int getValue()
	{
		return value;
	}
	
	@Override
	public int hashCode()
	{
		return value;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof IntEnum))
			return false;
		
		return (this.value == ((IntEnum)other).value);
	}
	
	public String toString()
	{
		return this.getValue() + "";
	}
}
