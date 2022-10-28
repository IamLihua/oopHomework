package activityManagementSystem;

import java.util.Date;

/**
 * 讲座活动类，继承自{@link Activity}
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class LectureActivity extends Activity{
	private String keySpeaker;
	/**
	 * 构造函数，初始化成员信息
	 * @param id
	 * @param name
	 * @param startTime
	 * @param endTime
	 * @param description
	 * @param site
	 * @param keySpeaker
	 */
	public LectureActivity(String id, String name, Date startTime, Date endTime, String description, String site,
			String keySpeaker) {
		super(id, name, startTime, endTime, description, site);
		this.keySpeaker = keySpeaker;
	}
	/**
	 * 获取主讲人
	 * @return 主讲人
	 */
	public String getKeySpeaker() {
		return keySpeaker;
	}
	
	/**
	 * 打印其父类和它自己的所有信息，用下划线分割
	 * @see Activity#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "_" + keySpeaker;
	}
	
}
