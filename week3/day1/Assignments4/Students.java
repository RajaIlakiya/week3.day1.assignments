package week3.day1.Assignments4;

public class Students {
	
	
public void getStudentInfo()
{
	int studId=101;

	System.out.println("Method1 Student id is: " + studId);
}

public void getStudentInfo(int studId,String name)
{
	System.out.println("Method2 Student id is: " + studId);
	System.out.println("Method2 Student name is: " + name);

}
public void getStudentInfo(long phoneNum,String emailID)
{
	System.out.println("Method3 Student phonenumber is: " + phoneNum);
	System.out.println("Method3 Student email is: " + emailID);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud1=new Students();
		stud1.getStudentInfo();
		stud1.getStudentInfo(102, "ilakiya");
stud1.getStudentInfo(7358653065L, "ilakiyababu2821@gmail.com");
	}

}
