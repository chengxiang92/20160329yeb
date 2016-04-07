package flyad.cx.entity;

import java.io.Serializable;
import java.util.Date;

public class ScoreItem implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer scoreId;
	
	/**
	 * 分数
	 */
	private Integer num;
	
	/**
	 * 标签
	 */
	private String label;
	
	/**
	 * 添加时间
	 */
	private Date date;
	
	/**
	 * 微信openId
	 */
	private String openId;

	public Integer getScoreId() {
		return scoreId;
	}

	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the openId
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * @param openId the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	
}
