package activityManagementSystem;

/**
 * 主办方类，继承自{@link User}
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class Organizer extends User{
	private String unit;
	
	/**
	 * 构造函数初始化基本信息
	 * @param id
	 * @param name
	 * @param phoneNo
	 * @param email
	 * @param unit
	 */
	public Organizer(String id, String name, String phoneNo, String email, String unit) {
		super(id, name, phoneNo, email);
		this.unit = unit;
	}

	/**
	 * 返回隶属的学校管辖的职能部门或学院
	 * @return 隶属的学校管辖的职能部门或学院
	 */
	public String getUnit() {
		return unit;
	}
	
	/**
	 * 打印其父类和它自己的所有信息，用下划线分割
	 * @see User#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "_" + unit;
	}
	
	
}
