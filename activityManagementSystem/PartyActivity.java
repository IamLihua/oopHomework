package activityManagementSystem;

import java.util.Date;

/**
 * 党日活动类，继承自{@link Activity}
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class PartyActivity extends Activity{
	private String theme;
	private String classification;

	/**
	 * 构造函数初始化基本信息
	 * @param id
	 * @param name
	 * @param startTime
	 * @param endTime
	 * @param description
	 * @param site
	 * @param theme
	 * @param classification
	 */
	public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site,
			String theme, String classification) {
		super(id, name, startTime, endTime, description, site);
		this.theme = theme;
		this.classification = classification;
	}
	
	/**
	 * 返回主题
	 * @return 主题
	 */
	public String getTheme() {
		return theme;
	}
	
	/**
	 * 返回活动类别
	 * @return 活动类别
	 */
	public String getClassification() {
		return classification;
	}
	
	/**
	 * 打印其父类和它自己的所有信息，用下划线分割
	 * @see Activity#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "_" + theme + "_"	+ classification;
	}
	
}
