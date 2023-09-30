package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learn_Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Select UI automation tool dropdown
		WebElement UI_tool = driver.findElement(By.className("ui-selectonemenu"));
		Select UIdd = new Select(UI_tool);
		UIdd.selectByIndex(1);
		
		//Preferred country dropdown
		driver.findElement(By.xpath("(//span[contains (@class, 'ui-icon ui-icon')])[12]")).click();
		driver.findElement(By.xpath("(//li[text() = 'India'])")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	
	
	
	
	
	}

}
