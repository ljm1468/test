package com.test.stu;

public class Teacher implements Workable,ShowCourse{

    public void doTask()
    {
        System.out.println("先生的工作是教書");
    }

    public void doCourse()
    {
        System.out.println("先生的課程是教国語");
    }
}
