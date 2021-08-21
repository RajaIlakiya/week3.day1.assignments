package week3.day1.homework3;

public class Display implements Printable,Showable{
	public void print()
	{System.out.println("Hello");
	}  
	public void show()
	{
		System.out.println("Welcome");
		}  
	
	public static void main(String args[]){  
		Display obj = new Display();  
		obj.print();  
		obj.show();  
		 }  
}
