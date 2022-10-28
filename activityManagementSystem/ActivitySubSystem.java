package activityManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 活动管理子系统
 * <p>用于管理活动类{@link Activity}</p>
 * <p>功能：</p>
 * <ol>
 * 	<li>根据时间筛选活动（查看某一时间有哪些活动正在举行）</li>
 * 	<li>检查某个团队是否参加了多项活动，返回其参加的活动数目</li>
 * </ol>
 * @see Activity
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class ActivitySubSystem {
	private List<Activity> activityList;
	
	/**
	 * 构造函数 为activityList分配对象
	 */
	public ActivitySubSystem() {
		super();
		activityList=new ArrayList<>();
	}

	/**
	 * @param activity 添加的活动
	 */
	public void addActivity(Activity activity)
	{
		activityList.add(activity);
	}
	
	/**
	 * @param id 活动id
	 */
	public void removeActivityById(String id)
	{
		for(Activity activity:activityList)
		{
			if(activity.getId().equals(id))
			{
				activityList.remove(activity);
				return;
			}
		}
	}
	
	/**
	 * 通过id查找活动
	 * @param id
	 * @return id指定的活动
	 */
	public Activity getActivityById(String id)
	{
		for(Activity activity:activityList)
		{
			if(activity.getId().equals(id))
			{
				return activity;
			}
		}
		return null;
	}
	
	/**
	 * @return 返回活动列表
	 */
	public List<Activity> getActivityList() {
		return activityList;
	}
	
	/**
	 * 指定一个日期，然后在{@code List<Activity> activityList}中查找满足以下要求的活动
	 * <ol>
	 * 	<li>已经注册的有效活动</li>
	 * 	<li>开始时间在指定日期之前</li>
	 * 	<li>结束日期在指定日期之后</li>
	 * </ol>
	 * @param date 指定日期
	 * @return 满足要求的列表
	 */
	public ArrayList<Activity> getActivitiesByDate(Date date)
	{
		ArrayList<Activity> l_Activities=new ArrayList<>();      
		for(Activity activity:activityList)
		{
			if(activity.getStartTime().before(date)&&activity.getEndTime().after(date))
			{
				l_Activities.add(activity);
			}
		}
		return l_Activities;
	}
	
	/**
	 * 检查某个团队是否参加了多项活动，返回其参加的活动数目
	 * @param teamId
	 * @return 团队参加的活动数量
	 */
	public int checkActivityNumOfTeam(String teamId)
	{
		int cnt=0;
		for(Activity activity:this.getActivityList())
		{
			for(Team team:activity.getTeams())
			{
				if(team.getTeamId().equals(teamId))
				{
					cnt++;
				}
			}
		}
		return cnt;
	}
}
