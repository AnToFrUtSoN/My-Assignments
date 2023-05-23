package selweek4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton=driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
	    WebElement crmsfa=driver.findElement(By.linkText("CRM/SFA"));
	    crmsfa.click();
	    WebElement leadsTab=driver.findElement(By.linkText("Leads"));
	    leadsTab.click();
	    WebElement createLead=driver.findElement(By.linkText("Create Lead"));
	    createLead.click();
	    WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
	    companyName.sendKeys("Testlaesf");
	    WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
	    firstName.sendKeys("Anto");
	    WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Frutson");
		WebElement firstNameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("T");
		WebElement departmentName=driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("Civil");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Complete the Assignment");
		WebElement primaryEmail=driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("antobrutson2906@gmail.com");
		WebElement createLeadButton=driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
		driver.close();
	}

}
