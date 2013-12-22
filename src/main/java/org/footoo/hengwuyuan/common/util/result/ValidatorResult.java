/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.util.result;

/**
 * 校验的结果
 * @author jeff
 * info  ValidatorResult.java 下午9:30:38
 */
public class ValidatorResult implements CommonResult {
	
	/** 是否成功 */
	private boolean success = false;
	/** 发生的异常，只有失败的时候，这个域才有用 */
	private Throwable exception;
	/** 错误提示信息 */
	private String message;
	/** 错误提示信息 */
	private Object object;
	

	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.common.util.result.CommonResult#isSuccess()
	 */
	@Override
	public boolean isSuccess() {
		return success;
	}

	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.common.util.result.CommonResult#getException()
	 */
	@Override
	public Throwable getException() {
		return exception;
	}

	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.common.util.result.CommonResult#getMessage()
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/* (non-Javadoc)
	 * @see org.footoo.hengwuyuan.common.util.result.CommonResult#getObject()
	 */
	@Override
	public Object getObject() {
		return object;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @param exception the exception to set
	 */
	public void setException(Throwable exception) {
		this.exception = exception;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(Object object) {
		this.object = object;
	}

}
