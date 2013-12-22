/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.service.user;

import org.footoo.hengwuyuan.common.data.UserBaseInfo;
import org.footoo.hengwuyuan.common.data.UserInfo;
import org.footoo.hengwuyuan.service.result.ServiceResult;

/**
 * 用户系统的服务
 * @author jeff
 * info  UserService.java 下午11:09:31
 */
public interface UserService {
	/**
	 * 通过用户名获得用户的基本信息
	 * @param userName 用户名，这个可以唯一标记一个用户
	 * @return 用户的基本信息
	 */
	public UserBaseInfo getUserBaseInfo(String userName);
	
	/**
	 * 通过用户名获得用户的完整信息
	 * @param userName 用户名
	 * @return 用户的完整信息
	 */
	public UserInfo getUserInfo(String userName);
	
	/**
	 * 用户注册
	 * @param baseInfo 用户基本信息
	 * @return 注册的结果
	 */
	public ServiceResult register(UserBaseInfo baseInfo);
	
	/**
	 * 用户登陆
	 * @param baseInfo 用户的基本信息，主要是用户名和密码
	 * @return 登陆结果
	 */
	public ServiceResult loginin(UserBaseInfo baseInfo);
	
}
