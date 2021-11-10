package runnerinfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basseclass.baseclass;

public class runnerinfo extends baseclass{
	public static WebDriver driver;
	public static void main(String[] args) {
		
	 driver = webDriverLaunch("chrome");
		
		getUrl("http://automationpractice.com/index.php");
		maximize();
		
		
		
		WebElement singin = driver.findElement(By.xpath("(//a[@class='login'])"));
		clickOnElement(singin);
		
		WebElement emailid = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]"));
		inputValueElement(emailid,"automate11@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[3]"));
		inputValueElement(password,"1234567890");
		
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickOnElement(login);
		
		WebElement order = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=history'])[1]"));
		clickOnElement(order);
		
		WebElement reorder = driver.findElement(By.xpath("(//a[@class='link-button'])[2]"));
		clickOnElement(reorder);
		
		WebElement proceedtocheckout1 = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order&step=1'])"));
		clickOnElement(proceedtocheckout1);
		
		WebElement proceedtocheckout2 = driver.findElement(By.name("processAddress"));
		clickOnElement(proceedtocheckout2);
		
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])"));
		clickOnElement(checkbox);
		
		WebElement proceedtocheckout3 = driver.findElement(By.name("processCarrier"));
		clickOnElement(proceedtocheckout3);
		
		WebElement bankwire = driver.findElement(By.xpath("(//a[@class='bankwire'])"));
		clickOnElement (bankwire);
		
		WebElement orderconfirmation = driver.findElement(By.xpath("(//button[@class='button btn btn-default button-medium'])"));
		clickOnElement(orderconfirmation);
		
	}
		
		
	}


	
		 
		 
		
	
