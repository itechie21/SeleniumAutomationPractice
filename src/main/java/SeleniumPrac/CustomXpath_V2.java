package SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath_V2 {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();//launch chrome
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	        driver.get("https://app.hubspot.com/login");//enter url
	        
	        driver.findElement(By.id("username")).sendKeys("itechie21@gmail.com"); // change it to personal id
	        driver.findElement(By.id("password")).sendKeys("Hubspot123"); // change the password as well
	        driver.findElement(By.id("loginBtn")).click();
	        
	        Thread.sleep(2000);
	        driver.navigate().to("https://app.hubspot.com/contacts/8237831/contacts/list/view/all/");
	        Thread.sleep(5000);

//	        driver
//	        .findElement(By.xpath("//span[text()='Brian Halligan (Sample Contact)']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/.."))
//	        .click();
	        
	        selectContact("Sagar LN");
	       // selectContact("Sagar LN");
	       // System.out.println(getContactEmailId("Sagar LN"));
	        System.out.println(getContactEmailId("Sagar LN	"));
	        
	        Thread.sleep(5000);
	        
	        driver.quit();
			
			//div[@class='private-form__input-wrapper']/input[@id='username']
			//single slash - / --> direct child elements
			//doublts slash - // --> direct + indirect child elements
			
			//body/div --> 5
			//body//div -- 30
			//backward traversing in xpath:
			//input[@id='username']/../../../../../../../../../..
			
			//div[@class='private-form__input-wrapper']//child::input[@id='username'] // move to child tag , downwards
			//input[@id='username']//parent::div // for parent tag
			//input[@id='username']//parent::div/../../../..   // to move upwards sequentially
			//input[@id='username']//ancestor::div // for the grandparent tag
			
			//span[text()='Sagar LN']//ancestor::td//preceding-sibling::td//input[@type='checkbox']
			
		}
		
		
		public static void selectContact(String name){
			driver
	        .findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/.."))
	        .click();
		}
		
		public static String getContactEmailId(String name){
			return driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//following-sibling::td/a")).getText();
			
		}
		

	}


