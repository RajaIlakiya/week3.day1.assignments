package week3.day1.classroom.java;

public class MethodOverloading {
	public void studentDetails()
	{
		int studenId=102;
		String studentName="Ilakiya";
		System.out.println("Studen id of method1: " +studenId);
		System.out.println("Studen name of method1: " +studentName);

	}
	public void studentDetails(String name)
	{
		System.out.println("Studen name of method2: " +name);

	}
	public void studentDetails(int id)
	{
		System.out.println("Studen name of method3: " +id);

	}
	public void studentDetails(int id,String name)
	{
		System.out.println("Studen id of method4: " +id);
		System.out.println("Studen name of method4: " +name);
	}
	public void studentDetails(String name,int id)
	{
		System.out.println("Studen name of method5: " +name);

		System.out.println("Studen id of method5: " +id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.studentDetails();
		obj.studentDetails("babu");
		obj.studentDetails(103);
		obj.studentDetails(104, "Aara");
		obj.studentDetails("Anu",105);

	}

}
