import com.test.stu.Student;
import com.test.stu.Teacher;

public class HelloWorldTest {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.doTask();

		Teacher teacher = new Teacher();
		teacher.doTask();
		teacher.doCourse();

	}

}

