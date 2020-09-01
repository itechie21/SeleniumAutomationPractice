package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("The title is:"+ driver.getTitle());
		
//		By Industry=By.id("Form_submitForm_Industry");
//		By Country=By.id("Form_submitForm_Country");
		
		By country=By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By Industry=By.xpath("//select[@id='Form_submitForm_Country']/option");
		selectDropDownvalue(country,"India");
		selectDropDownvalue(Industry,"Aerospace");
		
		
		
//   List<WebElement> Industrylist = driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
//
//		for (WebElement ele : Industrylist )
//		{  String text = ele.getText();
//			System.out.println(text);
//			 
//			if(text.equalsIgnoreCase("India")) // no in case of select class
//			{
//				ele.click();
//				break;
//			}
//			
//		}
	}
	
	
	public static void selectDropDownvalue(By locator, String value) {
		
		List<WebElement> optionList = driver.findElements(locator);
		for (WebElement ele : optionList )
		{  String text = ele.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase(value)) 
			{
				ele.click();
				break;
			}
			
		}
		
		
	}

}
