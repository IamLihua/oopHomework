package activityManagementSystem;
import java.util.List;

/** 
* <p>西工大学生校园活动管理系统类</p>
* <a href="https://www.processon.com/view/link/633bec4ef346fb07dea52d90">UML类图参考</a>
* <p>初始化两个子系统</p>
* <p>包括<b>用户管理子系统</b>和<b>活动管理子系统</b></p>
* <p>功能包括以下：</p>
* <ul>
* 	<li>查看所有的用户（学生、教师、主办方）信息</li>
* 	<li>查看所有的活动信息</li>
* </ul>
* @see UserSubSystem
* @see ActivitySubSystem
* @version 2.0
* @author 李承骐-2021302959
* @since jdk 17
*/
public class ActivityManagementSystem {
	private UserSubSystem userSubSystem;
	private ActivitySubSystem activitySubSystem;
	/**
	 * 构造函数，直接为两个两个子系统，即用户管理子系统和活动管理子系统分配空间
	 */
	public ActivityManagementSystem() {
		super();
		userSubSystem=new UserSubSystem();
		activitySubSystem=new ActivitySubSystem();
	}
	/**
	 * 打印出用户管理子系统中所有用户的信息
	 * @see UserSubSystem
	 */
	public void displayUserSubSystem()
	{
		List<User> studentList=userSubSystem.getStudentList();
		List<User> teacherList=userSubSystem.getTeacherList();
		List<User> organizerList=userSubSystem.getOrganizerList();
		for(User student:studentList)
		{
			System.out.println(student);
		}
		for(User teacher:teacherList)
		{
			System.out.println(teacher);
		}
		for(User organizer:organizerList)
		{
			System.out.println(organizer);
		}
	}
	/**
	 * 打印出活动管理子系统中所有活动的信息
	 * @see ActivitySubSystem
	 */
	public void displayActivitySubSystem()
	{
		List<Activity> activityList=activitySubSystem.getActivityList();
		for(Activity activity:activityList)
		{
			System.out.println(activity);
		}
	}
	/**
	 * @return 返回用户管理子系统
	 */
	public UserSubSystem getUserSubSystem() {
		return userSubSystem;
	}
	/**
	 * @return 返回活动管理子系统
	 */
	public ActivitySubSystem getActivitySubSystem() {
		return activitySubSystem;
	}
	
}
