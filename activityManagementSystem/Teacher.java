package activityManagementSystem;

/**
 * 教师类，继承自{@link User}
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class Teacher extends User{
	private String teacherNo;
	private String department;
	
	/**
	 * 返回教师的学院
	 * @return 教师的学院
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * 设置教师的学院
	 * @param department 教师的学院
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * 返回教师的编号
	 * @return 教师的编号
	 */
	public String getTeacherNo() {
		return teacherNo;
	}
	
	
	/**
	 * 构造函数初始化基本信息
	 * @param id
	 * @param name
	 * @param phoneNo
	 * @param email
	 * @param teacherNo
	 * @param department
	 */
	public Teacher(String id, String name, String phoneNo, String email, String teacherNo, String department) {
		super(id, name, phoneNo, email);
		this.teacherNo = teacherNo;
		this.department = department;
	}
	
	@Override
	/**
	 * 打印其父类和它自己的所有信息，用下划线分割
	 * @see User#toString()
	 */
	public String toString() {
		return super.toString() + "_" + teacherNo + "_" + department;
	}
	
}
