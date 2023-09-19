package Gaian_Pi.Gaian_Pi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest
{
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	// Object Repository
	
	@FindBy(xpath="/html/body/app-root/div/app-login-component/section/div/div/div/div/div/div[1]/div[2]/div[1]/input")
	WebElement loginUserNameE;
	
	@FindBy(id="exampleFormControlInput1")
	WebElement loginPasswordE;
	
	@FindBy(xpath="//*[@value='Login']")
	WebElement loginButtonE;
	
	
	//Buisiness Logics
	
	public void login(String psername,String password)
	{
		loginUserNameE.sendKeys(psername);
		
		loginPasswordE.sendKeys(password);
		
		loginButtonE.click();
	}
	
	

}
