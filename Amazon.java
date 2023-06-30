package testautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		WebElement text= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div"));
		System.out.println(text.getText());
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div"));
		System.out.println(result.getText());

	}

}
