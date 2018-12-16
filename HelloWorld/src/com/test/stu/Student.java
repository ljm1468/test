package com.test.stu;

public class Student implements Workable {

	private String name;
	private int age;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void doTask()
    {
        System.out.println("学生的工作是学習");
    }

}
