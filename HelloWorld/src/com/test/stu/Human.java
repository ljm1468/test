package com.test.stu;

public class Human {

	private String name;
	private String birthday;
	private String skin;





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String rtnHuman() {

		String strRtn = "";
		System.out.println("name=" + this.name + " birthday=" + this.birthday + " skin=" + skin);
		return strRtn;
	}
}
