package week3.day1.homework1;

public class SubClass extends SuperClass{
	
	private void display3()
	{
		System.out.println("Display subclass private method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sub=new SubClass();
		sub.display1();
		// private method display2() cannot inherits in another class
		sub.display3();
	}

}
