package activityManagementSystem;

import java.util.Date;

/**
 * 文艺活动类，继承自{@link Activity}
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class ArtisticActivity extends Activity{
	private String type;
	/**
	 * 构造函数初始化类的基本信息
	 * @param id
	 * @param name
	 * @param startTime
	 * @param endTime
	 * @param description
	 * @param site
	 * @param type
	 */
	public ArtisticActivity(String id, String name, Date startTime, Date endTime, String description, String site,
			String type) {
		super(id, name, startTime, endTime, description, site);
		this.type = type;
	}
	/**
	 * 返回文艺类型
	 * @return 文艺类型
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * 打印其父类和它自己的所有信息，用下划线分割
	 * @see Activity#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "_" + type;
	}
	
}
