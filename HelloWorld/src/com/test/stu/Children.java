package com.test.stu;

public class Children extends Human{

	private String eyeColor;

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String rtnHuman() {

		super.rtnHuman();

		String strRtn = "";
		System.out.println("name=" + super.getName() + " birthday=" + super.getBirthday() + " skin=" + super.getSkin() + "eyeColor =" + this.eyeColor);
		return strRtn;
	}
}
