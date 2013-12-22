/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util.validator;

import org.footoo.hengwuyuan.common.util.StringUtil;
import org.footoo.hengwuyuan.common.util.result.CommonResult;
import org.footoo.hengwuyuan.common.util.result.ValidatorResult;

/**
 * 校验用户名
 * 用户名必须是字母、数字、下划线以及横綱
 * @author jeff
 * info  UserNameValidator.java 下午9:58:08
 */
public class UserNameValidator implements Validator<String> {

	/* 校验用户名
	 * @see org.footoo.hengwuyuan.common.util.validator.Validator#validate(java.lang.Object)
	 */
	@Override
	public CommonResult validate(String obj) {
		ValidatorResult result = new ValidatorResult();
		
		//用户名不能是空白
		if(StringUtil.isBlank(obj))
		{
			result.setSuccess(false);
			result.setMessage("用户名不能为空白");
			return result;
		}
		
		//字符合法性检测
		for(char c : obj.toCharArray())
		{
			if((c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != '_' && c != '-')
			{
				result.setSuccess(false);
				result.setMessage("用户名含有非法字符\"" + c + "\"");
				return result;
			}
		}
		result.setSuccess(true);
		return result;
	}

}
