/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.serviceImpl;

import org.apache.log4j.Logger;
import org.footoo.hengwuyuan.common.data.UserBaseInfo;
import org.footoo.hengwuyuan.common.data.UserInfo;
import org.footoo.hengwuyuan.common.util.LoggerUtil;
import org.footoo.hengwuyuan.common.util.result.CommonResult;
import org.footoo.hengwuyuan.common.util.validator.Validator;
import org.footoo.hengwuyuan.service.result.ServiceResult;
import org.footoo.hengwuyuan.service.user.UserService;

/**
 * 实现用户服务
 * @author jeff
 * info  UserServiceImpl.java 下午8:49:43
 */
public class UserServiceImpl implements UserService {

	/** 用户名校验器 */
	private Validator<String> userNameValidator;
	
	/** 日志 */
	private final Logger log = Logger.getLogger(UserServiceImpl.class);
	
	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.service.user.UserService#getUserBaseInfo(java.lang.String)
	 */
	@Override
	public UserBaseInfo getUserBaseInfo(String userName) {
		//校验
		CommonResult result = userNameValidator.validate(userName);
		
		//校验失败
		if(!result.isSuccess())
		{
			//打印警告信息
			LoggerUtil.warn(log, result.getMessage() + userName);
			return null;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.service.user.UserService#getUserInfo(java.lang.String)
	 */
	@Override
	public UserInfo getUserInfo(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.service.user.UserService#register(org.footoo.hengwuyuan.common.data.UserBaseInfo)
	 */
	@Override
	public ServiceResult register(UserBaseInfo baseInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.service.user.UserService#loginin(org.footoo.hengwuyuan.common.data.UserBaseInfo)
	 */
	@Override
	public ServiceResult loginin(UserBaseInfo baseInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
