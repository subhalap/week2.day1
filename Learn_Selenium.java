package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Selenium {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Browser
		driver.get("https://www.facebook.com/");
		//To maximize
		driver.manage().window().maximize();
		
		
		//Enter email
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		
		//Click login button
		driver.findElement(By.name("login")).click();
		
		
		//Find title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		//driver.close();
	}

}
