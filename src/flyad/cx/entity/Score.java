package flyad.cx.entity;

import java.io.Serializable;

public class Score implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Integer id;
	
	/**
	 * 总分数
	 */
	private Integer num;
	
	/**
	 * 标签，以逗号分隔进行存储
	 */
	private String label;
	
	/**
	 * 由年月组成的字符串，用于区分月榜
	 * 例：2016-03
	 */
	private String dateScope;
	
	public Score() {}
	
	public Score(String dateScope)	{
		this.dateScope = dateScope;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getDateScope() {
		return dateScope;
	}

	public void setDateScope(String dateScope) {
		this.dateScope = dateScope;
	}
	
	
}
