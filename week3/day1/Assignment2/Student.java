package week3.day1.Assignment2;

public class Student extends Department{
	String name="ilakiya";
	int stuId=17;


	public void studentName()
	{
		System.out.println("Student name is: " + name);
	}
	public void studentDept()
	{
		System.out.println(name + " department name is: " + dept);

	}
	public void studentId()
	{
		System.out.println(name + " id is: " + stuId);

	}

	public static void main(String[] args)
	{
		Student stud=new Student();
		System.out.println("**** Super class College*****");

		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		
		System.out.println("**** Department extends College*****");
		stud.deptName();
		
		System.out.println("**** Student extends Department*****");

		stud.studentName();
		stud.studentDept();
		stud.studentId();
		
		
	}
}
