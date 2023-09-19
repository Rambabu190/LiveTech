package Gaian_Pi.Gaian_Pi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest
{

	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	// Object Repository
	
	//HomePage Repository
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div/div/button[1]/img")
	WebElement addButtonE;
	
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[1]/app-select/div/div/div[2]")
	WebElement allDataverseMainDropDown;
	
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[1]/app-select/div/div/div[1]/div[2]/div[4]/label")
	WebElement selectOptionfrmDrpDwn;
	
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[3]/app-dynamic-context-form/div/div/form/div[1]/app-search-select[1]/div/div/div[2]")
	WebElement selectUniverse;
	
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[3]/app-dynamic-context-form/div/div/form/div[1]/app-search-select[2]/div/div/div[2]")
	WebElement selectEntity;
	
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[3]/app-dynamic-context-form/div/div/form/div[1]/app-search-select[1]/div/div/div[1]/div[2]/div[3]")
	WebElement selectUniverseOption;
	
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[3]/app-dynamic-context-form/div/div/form/div[1]/app-search-select[2]/div/div/div[1]/div[2]/div[5]")
	WebElement selectEntityOption;
	
	@FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[3]/app-dynamic-context-form/div/div/form/div[1]/div/div[1]/div/input")
	WebElement contextName;
	
	 @FindBy(xpath="/html/body/app-root/div/app-landing/section/section[3]/app-aside/div/div[2]/div[2]/app-side-bar-popup/div/div[3]/app-dynamic-context-form/div/div/form/div[1]/div/div[2]/div/input")
	 WebElement contextDescription;
	public void addFunctionality() throws InterruptedException
	{
		
		addButtonE.click();
		
		Thread.sleep(3000);

	}
	
	public void fillingDetails()
	{
		allDataverseMainDropDown.click();
		
		selectOptionfrmDrpDwn.click();
		
		selectUniverse.click();
		
		selectUniverseOption.click();
		
		selectEntity.click();
		
		selectEntityOption.click();
		
		contextName.click();
		contextName.sendKeys("Gaian");
		
		contextDescription.click();
		contextDescription.sendKeys("GaianDescription");
		
	}
	

}
