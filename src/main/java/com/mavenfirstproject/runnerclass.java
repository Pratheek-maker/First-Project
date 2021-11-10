package com.mavenfirstproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class runnerclass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\\\SeleniumAlerts\\\\SeleniumAler\\\\SelJav\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		Robot   r = new Robot();
		
		Thread.sleep(3000);
		
		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		a.moveToElement(women).build().perform();
		
		WebElement casualdress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		casualdress.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		WebElement itembox = driver.findElement(By.xpath("(//div[@class='right-block'])[1]"));
		a.moveToElement(itembox).build().perform();
		
		
		WebElement addtocart1 = driver.findElement(By.xpath("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[1]"));
		addtocart1.click();
		
		Thread.sleep(3000);	
	
	    WebElement proceedtocheckout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])"));
		proceedtocheckout.click();
		
		js.executeScript("window.scrollBy(0,300)", "");
		
		WebElement quantity = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		quantity.clear();
		quantity.sendKeys("5");
		
		driver.findElement(By.xpath("(//a[@class='button btn btn-default standard-checkout button-medium'])")).click();
		
	
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]")).sendKeys("automate11@gmail.com");
		driver.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[3]")).sendKeys("1234567890");
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("(//button[@class='button btn btn-default button-medium'])")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
		
		driver.findElement(By.xpath("(//button[@name='processCarrier'])")).click();
		
		js.executeScript("window.scrollBy(0,300)", "");
		
		driver.findElement(By.xpath("(//a[@class='bankwire'])")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		

}
}
