package flyad.cx.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户信息表
 * @author chengxiang
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Integer id;
	
	/**
	 * 余额宝用户区分标识
	 */
	private String yebId;
	
	/**
	 * 余额宝用户昵称
	 */
	private String yebName;
	
	/**
	 * 暗号
	 */
	private String cipher;
	
	/**
	 * 分数关联Id
	 */
	private Integer scoreId;
	
	/**
	 * 创建时间
	 */
	private String createDate;
	
	private Score score;
	
	
	/**
	 * 获取{@link #id}
	 * @return
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 设置{@link #id}
	 * @return
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 获取{@link #yebId}
	 * @return
	 */
	public String getYebId() {
		return yebId;
	}
	
	/**
	 * 设置{@link #yebId}
	 * @return
	 */
	public void setYebId(String yebId) {
		this.yebId = yebId;
	}
	
	/**
	 * 获取{@link #yebName}
	 * @return
	 */
	public String getYebName() {
		return yebName;
	}
	
	/**
	 * 设置{@link #yebName}
	 * @return
	 */
	public void setYebName(String yebName) {
		this.yebName = yebName;
	}
	
	/**
	 * 获取{@link #cipher}
	 * @return
	 */
	public String getCipher() {
		return cipher;
	}
	
	/**
	 * 设置{@link #cipher}
	 * @return
	 */
	public void setCipher(String cipher) {
		this.cipher = cipher;
	}
	
	/**
	 * 获取{@link #scoreId}
	 * @return
	 */
	public Integer getScoreId() {
		return scoreId;
	}
	
	/**
	 * 设置{@link #scoreId}
	 * @return
	 */
	public void setScoreId(Integer scoreId) {
		this.scoreId = scoreId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

}
