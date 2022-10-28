package activityManagementSystem;

import java.util.Objects;

/**
 * 用户类，是{@link Student} {@link Teacher} {@link Organizer}的父类
 * @author 李承骐-2021302959
 * @version 2.0
 */
public class User {
	private String id;
	private String name;
	private String phoneNo;
	private String email;
	
	/**
	 * 构造函数初始化基本信息
	 * @param id
	 * @param name
	 * @param phoneNo
	 * @param email
	 */
	public User(String id, String name, String phoneNo, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	/**
	 * 获取用户id
	 * @return 用户id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * 获取用户名字
	 * @return 用户名字
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 设置用户名字
	 * @param name 要设置的用户名字
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 返回用户电话
	 * @return 用户电话
	 */
	public String getPhoneNo() {
		return phoneNo;
	}
	
	/**
	 * 设置用户电话
	 * @param phoneNo 要设置的用户电话
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	/**
	 * 获取用户Email
	 * @return 用户Email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * 设置用户Email
	 * @param email 用户Email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	

	/**
	 * 通过id来判定两个User是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	/**
	 * 打印它自己的所有信息，用下划线分割
	 */
	@Override
	public String toString() {
		return id + "_" + name + "_" + phoneNo + "_" + email;
	}
}
