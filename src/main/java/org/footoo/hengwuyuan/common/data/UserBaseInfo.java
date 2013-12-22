/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.data;

import org.footoo.hengwuyuan.common.enums.SexEnum;
import org.footoo.hengwuyuan.common.util.ToString;

/**
 * 用户的基本信息
 * @author jeff
 * info  UserBaseInfo.java 下午11:03:24
 */
public class UserBaseInfo extends ToString{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4700752893054701992L;
	
	/** 用户名*/
	private String userName;
	/** 真实姓名 */
	private String realName;
	/** 密码，这必须是经过加密处理过的 */
	private String pwd;
	/** email邮箱 */
	private String email;
	/** 性别 */
	private SexEnum sex;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the sex
	 */
	public SexEnum getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(SexEnum sex) {
		this.sex = sex;
	}
	
}
