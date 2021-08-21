package week3.day1.Assignments;

public class MyExecution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********Computer**********");

		Computer comp=new Computer();
		comp.computerModel();
		
		System.out.println("*********Desktop extends Computer**********");
		Desktop desk =new Desktop();
		desk.desktopSize();
		desk.computerModel();
		}

}
