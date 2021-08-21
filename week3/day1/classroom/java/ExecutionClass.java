package week3.day1.classroom.java;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle vehObj=new Vehicle();
vehObj.driveVehicle();
vehObj.applyBrake();
vehObj.accelarateVehicle();
vehObj.reverseGear();
vehObj.soundHorn();
System.out.println("************Car Extends Vehicle************");
Car carObj=new Car();
carObj.driveVehicle();
carObj.accelarateVehicle();
carObj.applyBrake();
carObj.pushOnAirBag();
carObj.reverseGear();
carObj.soundHorn();
int numOfWheels1=carObj.numofWheels;
System.out.println("Number of wheels: " +numOfWheels1);
System.out.println("************Auto Extends Vehicle************");

Auto autoObj=new Auto();
autoObj.driveVehicle();
int numOfWheels2=autoObj.numofWheels;
System.out.println("Number of wheels: " +numOfWheels2);


	}

}
