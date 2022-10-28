package activityManagementSystem;

import java.util.ArrayList;

/**
 * 学生类，继承自{@link User}
 * <p>每个学生通过一个<code>teamList</code>来管理自己作为creator的团队</p>
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class Student extends User {
	private String studentNo;
	private boolean gender;
	private String grade;
	private String department;
	
	/**
	 * 学生创建的团队列表
	 */
	private ArrayList<Team> teamList;
	
	/**
	 * 构造函数初始化基本信息，并为{@code teamList分配对象空间}
	 * @param id
	 * @param name
	 * @param phoneNo
	 * @param email
	 * @param studentNo
	 * @param gender
	 * @param grade
	 * @param department
	 */
	public Student(String id, String name, String phoneNo, String email, String studentNo, boolean gender, String grade,
			String department) {
		super(id, name, phoneNo, email);
		this.studentNo = studentNo;
		this.gender = gender;
		this.grade = grade;
		this.department = department;
		teamList=new ArrayList<Team>();
	}
	
	/**
	 * 返回学生学号
	 * @return 学生学号
	 */
	public String getStudentNo() {
		return studentNo;
	}
	
	/**
	 * 返回学生性别
	 * @return 学生性别
	 */
	public boolean getGender() {
		return gender;
	}
	
	/**
	 * 返回年级
	 * @return 年级
	 */
	public String getGrade() {
		return grade;
	}
	
	/**
	 * 返回学生学院
	 * @return 学生学院
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * 返回学生创建团队列表
	 * @return 学生创建团队列表
	 */
	public ArrayList<Team> getTeamList() {
		return teamList;
	}
	
	/**
	 * 打印其父类和它自己的所有信息，用下划线分割
	 * @see User#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "_" + studentNo + "_" + gender + "_" + grade + "_" + department;
	}
	
}
