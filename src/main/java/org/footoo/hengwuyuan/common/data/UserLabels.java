/**
 * copy right @ IBMTC
 * 2013-2013
 */
package org.footoo.hengwuyuan.common.data;

import java.util.ArrayList;
import java.util.List;

import org.footoo.hengwuyuan.common.util.StringUtil;

/**
 * 用户的标签
 * @author jeff
 * info  UserLabels.java 下午11:27:32
 */
public class UserLabels {
	private List<String> labels;
	
	/**
	 * 添加标签
	 * @param label 带添加的标签
	 */
	public void addLabel(String label)
	{
		//不接受空白标签
		if(StringUtil.isBlank(label))
			return;
		if(labels == null)
			labels = new ArrayList<String>();
		
		labels.add(label);
	}

	/**
	 * @return the labels
	 */
	public List<String> getLabels() {
		return labels;
	}

	/**
	 * @param labels the labels to set
	 */
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	
	
}
