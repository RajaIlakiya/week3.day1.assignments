package week3.day1.classroom.java;

public class ExecutionClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile objMob=new Mobile();
		objMob.saveContact();
		objMob.sendMsg();
		objMob.makeCall();
		
		System.out.println("***********AndriodPhone extends Mobile***********");
		AndroidPhone objAndroid=new AndroidPhone();
		objAndroid.takeVideo();
		objAndroid.makeCall();
		objAndroid.sendMsg();
		objAndroid.saveContact();
		
		System.out.println("************SmartPhone extends AndriodPhone***********");

		SmartPhone objSmartPh=new SmartPhone();
		objSmartPh.takeVideo();
		objSmartPh.connectWhatsApp();
		objSmartPh.makeCall();
		objSmartPh.sendMsg();
		objSmartPh.saveContact();
		

	}

}
