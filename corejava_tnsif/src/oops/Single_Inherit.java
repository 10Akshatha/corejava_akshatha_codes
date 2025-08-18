package oops;

class Course //parent
{
	String coursename="Python Programming";
	
	void showCourse()
	{
		System.out.println("Course :"+coursename);
	}
}
class Student extends Course //child
{
	String name="Usha";
	
	void showStudent()
	{
		System.out.println("Student:" + name);
	}
}
public class Single_Inherit {

	public static void main(String[] args) {
		Student s=new Student();
		s.showStudent();
		s.showCourse();

	}

}

