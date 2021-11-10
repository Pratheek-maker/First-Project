package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	public static WebDriver driver;
	
	@FindBy(className="login")
	public WebElement login1;
	
	@FindBy(xpath="(//input[@class='is_required validate account_input form-control'])[2]")
	public WebElement enteremail;
	
	@FindBy(xpath="(//input[@class='is_required validate account_input form-control'])[3]")
	public WebElement enterpass;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	public WebElement signin;
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=history'])[1]")
	public WebElement clickhistory;
	
	@FindBy(xpath="(//a[@class='link-button'])[2]")
	public WebElement clickreorder;
	
	@FindBy(xpath="(//a[@class='button btn btn-default standard-checkout button-medium'])")
	public WebElement clickproceedtocheckout1;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement clickproceedtocheckout2;
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkbox;
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement proceedtocheckout3;
	
	
	@FindBy(className="cheque")
	public WebElement chequebutton;
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement confirmorder;
	
	
	public homepage(WebDriver driver_2)
	{
		this.driver = driver_2;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	

}
