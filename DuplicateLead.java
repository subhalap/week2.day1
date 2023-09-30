package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	
		
		//Enter FirstName Field Using id Locator
		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Subhalaxmi");
		
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Panigrahi");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Litil");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SDP");
		
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is to test selenium programs");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("subha95@gmail.com");
		
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
        //Get the Title of Resulting Page using driver.getTitle()
		String title = driver.getTitle();
		System.out.println(title);
		
		//Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
        //Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tesst2 Company");
		
        //Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tesst2");
		
		//Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
        //Get the Title of Resulting Page using driver.getTitle()
		String title_after_changing = driver.getTitle();
		System.out.println(title_after_changing);
		
	}

}
