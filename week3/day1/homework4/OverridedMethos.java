package week3.day1.homework4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OverridedMethos {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");

//		Go to home page method1
		driver.findElement(By.xpath("//a[contains(text(),'Go to Home Page')]")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		
//	    Go to Home Page (Interact with same link name)
//		driver.navigate().to("http://leafground.com/home.html");
		String title2 = driver.getTitle();
		
//		Verify Interact with same link name or not
		
		if (title1.equals(title2)) {
			System.out.println("Interact with same link");
		} else {
			System.out.println("Interact with same link");
		}

	}

	}
