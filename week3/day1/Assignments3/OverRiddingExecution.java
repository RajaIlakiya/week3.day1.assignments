package week3.day1.Assignments3;

public class OverRiddingExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo bank = new BankInfo();
		bank.deposit();
		bank.fixed();
		bank.deposit();

		System.out.println("**********Method overriding on deposit method***********");
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}

}
