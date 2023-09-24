package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//launch url
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
		
		// Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		//Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subhalaxmi");
		
		//Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Panigrahi");
		
		//Select value as Employee in Source Using SelectbyVisible text
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd = new Select(source);
		sourcedd.selectByVisibleText("Employee");
		
		//Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		WebElement MarketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select MarketingCampaigndd = new Select(MarketingCampaign);
		MarketingCampaigndd.selectByValue("9001");
		
		//Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Ownershipdd = new Select(Ownership);
		Ownershipdd.selectByIndex(5);
		
		//Select value as India in Country Field Using SelectbyVisibletext
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select Countrydd = new Select(Country);
		Countrydd.selectByVisibleText("India");
	
		//Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of the resulting Page
		String title = driver.getTitle();
		System.out.println(title);
	
	
	}

}
