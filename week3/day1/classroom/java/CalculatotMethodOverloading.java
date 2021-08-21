package week3.day1.classroom.java;

public class CalculatotMethodOverloading {
	
	public void add(int num1, int num2,int num3) {
		int sum = num1 + num2 + num3;
		System.out.println(sum); 
	}

	public void sub(int num1, int num2) {
		int subtraction = num1 - num2;
		System.out.println(subtraction); 
	}

	public void add(double num1, double num2) {
		double product = num1 * num2;
		System.out.println(product); 
	}

	public void add(float num1, float num2) {
		float division = num1 / num2;
		System.out.println(division); 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatotMethodOverloading calc=new CalculatotMethodOverloading();
		calc.add(20, 20, 20);
		calc.sub(20, 20);
        calc.add(20.0, 10.0);
        calc.add(10.5F, 10.0F);
	}

}
