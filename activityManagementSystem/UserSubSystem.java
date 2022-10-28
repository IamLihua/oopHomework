package activityManagementSystem;

import java.util.ArrayList;
import java.util.List;
/**
 * 用户管理子系统
 * <p>用于管理活动类{@link User}，所管理的有：</p>
 * <ol>
 * 	<li>{@link Student}类</li>
 * 	<li>{@link Teacher}类</li>
 * 	<li>{@link Organizer}类</li>
 * </ol>
 * <p>功能：增、删（通过ID）、改、查（通过ID）学生/教师/主办方信息</p>
 * @see User
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class UserSubSystem {
	private List<User> studentList;
	private List<User> organizerList;
	private List<User> teacherList;
	
	/**
	 * 构造函数初始化基本信息，为成员分配对象空间
	 */
	public UserSubSystem() {
		super();
		studentList=new ArrayList<>();
		organizerList=new ArrayList<>();
		teacherList=new ArrayList<>();
	}
	
	/**
	 * 新增学生
	 * @param student 要添加的学生
	 */
	public void addStudent(Student student)
	{
		studentList.add(student);
	}
	
	/**
	 * 通过id删除学生
	 * @param id 要删除的学生
	 */
	public void removeStudentById(String id)
	{
		for(User student:studentList)
		{
			if(student.getId().equals(id))
			{
				studentList.remove(student);
				return;
			}
		}
	}
	
	/**
	 * 通过id查找学生
	 * @param id 要查找学生的id
	 * @return <ul>
	 * <li>如果有指定的学生=>返回对应id的学生</li>
	 * <li>如果没有找到指定的学生=>返回null</li>
	 * </ul>
	 */
	public Student getStudentById(String id)
	{
		for(User student:studentList)
		{
			if(student.getId().equals(id))
			{
				return (Student) student;
			}
		}
		return null;
	}
	
	/**
	 * 返回所有学生的列表
	 * @return 所有学生的列表
	 */
	public List<User> getStudentList() {
		return studentList;
	}
	/**
	 * 返回所有主办方的列表
	 * @return 所有主办方的列表
	 */
	public List<User> getOrganizerList() {
		return organizerList;
	}
	
	/**
	 * 返回所有教师的列表
	 * @return 所有教师的列表
	 */
	public List<User> getTeacherList() {
		return teacherList;
	}
	
	/**
	 * 新增教师
	 * @param teacher 要新增的教师
	 */
	public void addTeacher(Teacher teacher)
	{
		teacherList.add(teacher);
	}
	
	/**
	 * 通过id删除老师
	 * @param id 要删除老师的id
	 */
	public void removeTeacherById(String id)
	{
		for(User teacher:teacherList)
		{
			if(teacher.getId().equals(id))
			{
				teacherList.remove(teacher);
				return;
			}
		}
	}
	
	/**
	 * 通过id获取老师
	 * @param id 要获取老师的id
	 * @return <ul>
	 * <li>如果有指定的老师=>返回对应id的老师</li>
	 * <li>如果没有找到指定的老师=>返回null</li>
	 * </ul>
	 */
	public Teacher getTeacherById(String id)
	{
		for(User teacher:teacherList)
		{
			if(teacher.getId().equals(id))
			{
				return (Teacher) teacher;
			}
		}
		return null;
	}
	
	/**
	 * 新增主办方
	 * @param organizer 要新增的主办方
	 */
	public void addOrganizer(Organizer organizer)
	{
		organizerList.add(organizer);
	}
	
	/**
	 * 通过id删除主办方
	 * @param id 要删除主办方的id
	 */
	public void removeOrganizerById(String id)
	{
		for(User organizer:organizerList)
		{
			if(organizer.getId().equals(id))
			{
				organizerList.remove(organizer);
				return;
			}
		}
	}
	
	/**
	 * 通过id获取主办方
	 * @param id 要获取主办方的id
	 * @return <ul>
	 * <li>如果有指定的主办方=>返回对应id的主办方</li>
	 * <li>如果没有找到指定的主办方=>返回null</li>
	 * </ul>
	 */
	public Organizer getOrganizerById(String id)
	{
		for(User organizer:organizerList)
		{
			if(organizer.getId().equals(id))
			{
				return (Organizer) organizer;
			}
		}
		return null;
	}
	
	/**
	 * 将学生加入团队，过程如下
	 * <ol>
	 * 	<li>在已有的学生列表中查找creatorId</li>
	 * 	<li>找到creatorId后，在其{@link Student#getTeamList()}中查找teamId</li>
	 * 	<li>找到teamId对应的Team后，调用它的{@link Team#addStudent(Student)}添加学生</li>
	 * </ol>
	 * @see Team
	 * @param creatorId 团队创建者id
	 * @param studentId 要增加的学生的id
	 * @param teamId 要加入的团队的id
	 */
	public void addStudentToTeam(String creatorId,String studentId,String teamId)
	{
		Student creator=this.getStudentById(creatorId);
		List<Team> teamList=creator.getTeamList();
		for(Team team:teamList)
		{
			if(team.getTeamId().equals(teamId))
			{
				Student student=this.getStudentById(studentId);
				team.addStudent(student);
			}
		}
	}
	
	/**
	 * 将老师加入团队，过程如下
	 * <ol>
	 * 	<li>在已有的学生列表中查找creatorId</li>
	 * 	<li>找到creatorId后，在其{@link Student#getTeamList()}中查找teamId</li>
	 * 	<li>找到teamId对应的Team后，调用它的{@link Team#addTeacher(Teacher)}添加老师</li>
	 * </ol>
	 * @see Team
	 * @param creatorId 团队创建者id
	 * @param teacherId 要增加的老师的id
	 * @param teamId 要加入的团队的id
	 */
	public void addTeacherToTeam(String creatorId,String teacherId,String teamId)
	{
		Student creator=this.getStudentById(creatorId);
		List<Team> teamList=creator.getTeamList();
		for(Team team:teamList)
		{
			if(team.getTeamId().equals(teamId))
			{
				Teacher teacher=this.getTeacherById(teacherId);
				team.addTeacher(teacher);
			}
		}
	}
	
	/**
	 * 创建团队
	 * <p>通过使用{@link Team#Team(String, String, String, Student)}构造函数新建团队</p>
	 * @see Team
	 * @param creatorId 创建者id
	 * @param teamId 要创建的队伍id
	 * @param teamName 要创建的队伍名
	 * @param department 要创建的队伍隶属的部门
	 */
	public void createTeam(String creatorId,String teamId,String teamName,String department)
	{
		Student creator=this.getStudentById(creatorId);
		Team team=new Team(teamId,teamName,department,creator);
		creator.getTeamList().add(team);
	}
}
