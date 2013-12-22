/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.test;

import org.footoo.hengwuyuan.common.data.UserBaseInfo;
import org.footoo.hengwuyuan.common.enums.SexEnum;
import org.junit.Test;

/**
 * @author jeff
 * info  ToStringTest.java 下午11:43:41
 */
public class ToStringTest {
	@Test
	public void testToString()
	{
		UserBaseInfo baseInfo = new UserBaseInfo();
		baseInfo.setEmail("heishijj@gmail.com");
		baseInfo.setPwd("123");
		baseInfo.setRealName("");
		baseInfo.setSex(SexEnum.FEMALE);
		baseInfo.setUserName("jeff");
		System.out.println(baseInfo);
	}
}
