/**
 * 
 */
package com.eureka.provider.eurekaprovider.dal.dataobject;

/**
 * @author Administrator
 *
 */
public class UserDO {
	private String userName;
	private String sex;
	private Integer age;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
