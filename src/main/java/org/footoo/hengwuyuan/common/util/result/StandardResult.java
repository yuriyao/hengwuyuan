/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util.result;

import org.footoo.hengwuyuan.common.enums.StandErrorEnum;

/**
 * 有标准化的错误的结果
 * @author jeff
 * info  StandardResult.java 下午11:28:29
 */
public interface StandardResult extends CommonResult {
	/**
	 * 获取标准的错误信息
	 * @return
	 */
	public StandErrorEnum getStandErrorCode();
}
