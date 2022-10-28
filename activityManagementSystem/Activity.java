package activityManagementSystem;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;

/**
 * 活动类
 * <p>存在3个子类 文艺活动{@link ArtisticActivity}、讲座活动{@link LectureActivity}、党日活动{@link PartyActivity}</p>
 * <p>功能：</p>
 *  <ol>
 * 	<li>将团队添加到某项活动中（报名）、从某项活动中删除团队（撤销报名）</li>
 * 	<li>将教师添加到某项活动中、从某项活动中删除教师</li>
 * 	<li>将主办方添加到某项活动中、从某项活动中删除主办方</li>
 * </ol>
 * @see ArtisticActivity
 * @see LectureActivity
 * @see PartyActivity
 * @author 李承骐-202132959
 * @version 2.0
 *
 */
public class Activity {
	private String id;
	private String name;
	private Date startTime;
	private Date endTime;
	private String description;
	private String site;
	private ArrayList<Team> teams;
	private ArrayList<Teacher> teachers;
	private ArrayList<Organizer> organizers;
	
	/**
	 * 构造函数初始化基本信息，并为成员中的部分{@link ArrayList}分配空间
	 * @param id 活动id
	 * @param name 活动名
	 * @param startTime 活动开始时间
	 * @param endTime 活动结束时间
	 * @param description 活动信息描述
	 * @param site 活动举办地点
	 */
	public Activity(String id, String name, Date startTime, Date endTime, String description, String site) {
		super();
		this.id = id;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.description = description;
		this.site = site;
		teams=new ArrayList<Team>();
		teachers=new ArrayList<Teacher>();
		organizers=new ArrayList<Organizer>();
		
	}
	
	/**
	 * 获取队伍列表
	 * @see Team
	 * @return 返回队伍列表
	 */
	public ArrayList<Team> getTeams() {
		return teams;
	}

	/**
	 * 获取描述
	 * @return 描述
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 设置描述
	 * @param description 要设置的描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 获取id
	 * @return 活动id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 获取活动名字
	 * @return 活动名字
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 获取活动开始时间
	 * @return 活动开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}
	
	/**
	 * 获取活动结束时间
	 * @return 活动结束时间
	 */
	public Date getEndTime() {
		return endTime;
	}
	
	/**
	 * 获取活动举办地
	 * @return 活动举办地
	 */
	public String getSite() {
		return site;
	}
	
	/**
	 * 将队伍添加进活动
	 * @param team 要添加的活动
	 */
	public void addTeamToActivity(Team team)
	{
		teams.add(team);
	}
	
	/**
	 * 根据id删除活动
	 * @param id 要删除活动的id
	 */
	public void removeTeamFromActivity(String id)
	{
		for(Team team:teams)
		{
			if(team.getTeamId().equals(id))
			{
				teams.remove(team);
				return;
			}
		}
	}
	
	/**
	 * 将指导老师添加进活动
	 * @param teacher 要添加的老师
	 */
	public void addTeacherToActivity(Teacher teacher)
	{
		teachers.add(teacher);
	}
	
	/**
	 * 根据id将老师从活动中删除
	 * @param id 要删除老师的id
	 */
	public void removeTeacherFromActivity(String id)
	{
		for(Teacher teacher:teachers)
		{
			if(teacher.getId().equals(id))
			{
				teachers.remove(teacher);
				return;
			}
		}
	}
	
	/**
	 * 为活动添加主办方
	 * @param organizer 要添加的主办方
	 */
	public void addOrganizerToActivity(Organizer organizer)
	{
		organizers.add(organizer);
	}
	
	/**
	 * 根据id将主办方从活动中删除
	 * @param id 要删除主办方的id
	 */
	public void removeOrganizerFromActivity(String id)
	{
		for(Organizer organizer:organizers)
		{
			if(organizer.getId().equals(id))
			{
				organizers.remove(organizer);
				return;
			}
		}
	}
	
	/**
	 * 打印它自己的所有信息，用下划线分割
	 */
	@Override
	public String toString() {
		return id + "_" + name + "_" + startTime + "_" + endTime+ "_" + description + "_" + site;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Activity)) {
			return false;
		}
		Activity other = (Activity) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
