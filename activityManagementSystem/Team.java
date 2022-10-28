package activityManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * 团队类，主要信息包括有：
 * <ol>
 * 	<li>创建者</li>
 * 	<li>团队包含的学生列表</li>
 * 	<li>团队包含的教师列表</li>
 * </ol>
 * <p>功能：</p>
 * <ol>
 * 	<li>创建团队</li>
 * 	<li>添加团队成员（学生）</li>
 * 	<li>添加指导老师（教师）</li>
 * </ol>
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class Team {
	private String teamId;
	private String teamName;
	private String department;
	private Student creator;
	private List<Student> studentList;
	private List<Teacher> TeacherList;
	/**
	 * 构造函数初始化基本信息,并为studentList和TeacherList分配空间
	 * @param teamId
	 * @param teamName
	 * @param department
	 * @param creator
	 */
	public Team(String teamId, String teamName, String department, Student creator) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.department = department;
		this.creator = creator;
		studentList=new ArrayList<Student>();
		TeacherList=new ArrayList<Teacher>();
	}
	
	/**
	 * 返回团队id
	 * @return 团队id
	 */
	public String getTeamId() {
		return teamId;
	}
	
	/**
	 * 返回团队名字
	 * @return 团队名字
	 */
	public String getTeamName() {
		return teamName;
	}
	
	/**
	 * 返回团队隶属部门
	 * @return 团队隶属部门
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * 返回团队创建者，类型为{@link Student}
	 * @return 团队创建者
	 */
	public Student getCreator() {
		return creator;
	}
	
	/**
	 * 返回团队学生成员列表
	 * @return 团队学生成员列表
	 */
	public List<Student> getStudentList() {
		return studentList;
	}
	
	/**
	 * 返回团队教师成员列表
	 * @return 团队教师成员列表
	 */
	public List<Teacher> getTeacherList() {
		return TeacherList;
	}
	
	/**
	 * 打印它自己的所有信息，用下划线分割
	 */
	@Override
	public String toString() {
		return teamId + "_" + teamName + "_" + department;
	}
	
	/**
	 * 在团队中添加学生
	 * @param student 需要添加的学生
	 */
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	/**
	 * 在团队中添加教师
	 * @param teacher 需要添加的教师
	 */
	public void addTeacher(Teacher teacher) {
		TeacherList.add(teacher);
	}
	
	
	
}
