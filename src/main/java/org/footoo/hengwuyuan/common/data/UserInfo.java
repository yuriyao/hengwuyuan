/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.data;

import org.footoo.hengwuyuan.common.util.ToString;


/**
 * 完整的用户信息
 * @author jeff
 * info  UserInfo.java 下午11:11:05
 */
public class UserInfo extends ToString
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7240393279545097952L;
	/** 用户的基本信息 */
	private UserBaseInfo baseInfo;
	/** 用户标签 */
	private UserLabels labels;
	/** 用户的工作信息 */
	private WorkInfo workInfo;
	/** 用户的头衔 */
	private Title title;
	/** 偏好设置 */
	private Setting setting;
	
	/**
	 * @return the baseInfo
	 */
	public UserBaseInfo getBaseInfo() {
		return baseInfo;
	}
	/**
	 * @param baseInfo the baseInfo to set
	 */
	public void setBaseInfo(UserBaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}
	/**
	 * @return the labels
	 */
	public UserLabels getLabels() {
		return labels;
	}
	/**
	 * @param labels the labels to set
	 */
	public void setLabels(UserLabels labels) {
		this.labels = labels;
	}
	/**
	 * @return the workInfo
	 */
	public WorkInfo getWorkInfo() {
		return workInfo;
	}
	/**
	 * @param workInfo the workInfo to set
	 */
	public void setWorkInfo(WorkInfo workInfo) {
		this.workInfo = workInfo;
	}
	/**
	 * @return the title
	 */
	public Title getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(Title title) {
		this.title = title;
	}
	/**
	 * @return the setting
	 */
	public Setting getSetting() {
		return setting;
	}
	/**
	 * @param setting the setting to set
	 */
	public void setSetting(Setting setting) {
		this.setting = setting;
	}
	
	
	
}
