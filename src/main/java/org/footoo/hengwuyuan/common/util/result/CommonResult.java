/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util.result;

/**
 * @author jeff
 * info  CommonResult.java 下午9:27:03
 */
public interface CommonResult {
	/**
	 * 操作是否成功
	 * @return
	 */
	public boolean isSuccess();
	
	/**
	 * 出错时，获取异常信息
	 * @return 异常信息
	 */
	public Throwable getException();
	
	/**
	 * 获得出错的提示信息
	 * @return
	 */
	public String getMessage();
	
	/**
	 * 获取出错的提示，但这是一个object
	 * @return
	 */
	public Object getObject();
}
