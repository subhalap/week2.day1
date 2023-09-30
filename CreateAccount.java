package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		   
		 //Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		   
		 //Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		   
		 //Click on Accounts Button
		driver.findElement(By.linkText("Accounts")).click();
		   
		 //Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		    
		 //Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElement(By.xpath("//input[@id = 'accountName']")).sendKeys("Debit Limited Account");
		   
		 //Enter Descriptiion as "Selenium Automation Tester"
		driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		   
		 //Enter LocalName Field Using Xpath Locator
		   driver.findElement(By.xpath("//input[@id = 'groupNameLocal']")).sendKeys("Subha");
		   
		  //Enter SiteName Field Using Xpath Locator
		   driver.findElement(By.xpath("//input[@id = 'officeSiteName']")).sendKeys("Base site");
		  
		   //Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		   driver.findElement(By.xpath("//input[@id = 'annualRevenue']")).sendKeys("25000");
		   
		   //Select Industry as ComputerSoftware
		   WebElement industry = driver.findElement(By.name("industryEnumId"));
		   Select industrydd = new Select(industry);
		   industrydd.selectByIndex(3);
		   
		   //Select OwnerShip as S-Corporation using SelectByVisibletext
		   WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		   Select ownerdd = new Select(ownership);
		   ownerdd.selectByVisibleText("S-Corporation");
		   
		   
		   //Select Source as Employee using SelectByValue
		   WebElement source = driver.findElement(By.id("dataSourceId"));
		   Select sourcedd = new Select(source);
		   sourcedd.selectByValue("LEAD_EMPLOYEE");
		   
		   //Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		   WebElement marketing_campaign = driver.findElement(By.id("marketingCampaignId"));
		  Select Markdd = new Select(marketing_campaign);
		  Markdd.selectByIndex(6);
		   
		   //Select State/Province as Texas using SelectByValue 
		  WebElement state = driver.findElement(By.id("generalStateProvinceGeoId")); 
		  Select statedd = new Select(state);
		  statedd.selectByValue("IN");
		  
		   //Click on Create Account using Xpath Locator
		  driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
	}

}
