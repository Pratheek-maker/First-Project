package basseclass;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	public static WebDriver driver;
	public static WebDriver webDriverLaunch(String driverName){
		
     
		if(driverName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\SeleniumAlerts\\\\SeleniumAler\\\\SelJav\\\\chromedriver.exe");
			driver = new ChromeDriver();
			}
         else if(driverName.equalsIgnoreCase("firefox"))
         {
        	 System.setProperty("webdriver.gecko.driver",System.getProperty(("user.dir"))+"\\Driver\\chromedriver.exe");
        	 driver = new FirefoxDriver();
         }
         return driver;
	}
         
        
         public static void getUrl(String URL)
         {
        	 driver.get(URL);
        	   }
         public static void maximize() {
         driver.manage().window().maximize();
         }
         
         public static void clickOnElement(WebElement element) {
        	 element.click();
         }
         public static void inputValueElement(WebElement element,String value){
        	 element.sendKeys(value);
         }
         public static void inputValueElement1(WebElement element,String value) {
        	 element.sendKeys(value);
         }
         public static void clickOnElement1(WebElement element) {
        	 element.click();
		}
         public static void clickOnElement2(WebElement element) {
        	 element.click();
        	 }
         public static void clickOnElement3(WebElement element) {
        	 element.click();
        	 }
         public static void clickOnElement4(WebElement element) { 
        	 element.click();
          }
         public static void clickOnElement5(WebElement element) { 
        	 element.click();
        	 }
         public static void clickOnElement6(WebElement element) {
        	 element.click();
        	 }
         public static void clickOnElement7(WebElement element) {
        	 element.click();
         }
         public static void clickOnElement8(WebElement element) {
        	 element.click();}
        	 
        public static void end() {
        	driver.quit();
        }
         }
     
         
         
         
         

		
	


