package Gaian_Pi.Gaian_Pi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ApplicationLounchingBasic 
{
	
	WebDriver driver;
	
	String applicationUrlAddress="https://pi.gaiansolutions.com/dashboard";
	
	@Test(priority=2)
	public void applicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./ExicutableFiles/chromedriver.exe");
		 
		driver = new ChromeDriver();
		
		driver.get(applicationUrlAddress);
	

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=2)
	public void applicationLaunching() throws InterruptedException
	{
		//Thread.sleep(3000);
	WebElement	userName=driver.findElement(By.xpath("/html/body/app-root/div/app-login-component/section/div/div/div/div/div/div[1]/div[2]/div[1]/input"));
	
	Thread.sleep(2000);
	userName.sendKeys("ram");
		
		WebElement password=driver.findElement(By.id("exampleFormControlInput1"));
		password.sendKeys("babu");
	/*	@FindBy(className="form-control right-border ng-pristine ng-valid ng-touched")
		WebElement loginUserNameE;
		
		@FindBy(id="exampleFormControlInput1")
		WebElement loginPasswordE;
		
		@FindBy(xpath="//*[@value='Login']")
		WebElement loginButtonE;  */
	}
	

}
