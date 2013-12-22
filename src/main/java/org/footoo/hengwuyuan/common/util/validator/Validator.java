/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util.validator;

import org.footoo.hengwuyuan.common.util.result.CommonResult;

/**
 * 基本的校验器的接口
 * @author jeff
 * info  Validator.java 下午9:19:22
 */
public interface Validator<T> {
	
	/**
	 * 进行验证
	 * @param obj 需要验证的obj
	 * @return
	 */
	CommonResult validate(T obj);
}
