package runnernew;

import org.openqa.selenium.WebDriver;

import base.homepage;
import basseclass.baseclass;

public class Runner extends baseclass{
	public static WebDriver driver = baseclass.webDriverLaunch("chrome");
	
	public static homepage login = new homepage(driver);
	
	public static void main(String args[]) {
		getUrl("http://automationpractice.com/index.php");
		
		maximize();
		
		clickOnElement(login.login1);
		
		inputValueElement(login.enteremail,"automate11@gmail.com");
		
		inputValueElement1(login.enterpass,"1234567890");
		
		clickOnElement1(login.signin);
		
		clickOnElement1(login.clickhistory);
		
		clickOnElement2(login.clickreorder);
		
		clickOnElement3(login.clickproceedtocheckout1);
		
		clickOnElement4(login.clickproceedtocheckout2);
		
		clickOnElement5(login.checkbox);
		
		clickOnElement6(login.proceedtocheckout3);
		
		clickOnElement7(login.chequebutton);
		
		clickOnElement8(login.confirmorder);
		
		end();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
	}


