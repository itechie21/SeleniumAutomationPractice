package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle {
	
	 static WebDriver driver;

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("The title is:"+ driver.getTitle());
		By Industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");

		SelectDropDownValuebyVisibleText(country,"India");
		SelectDropDownValuebyIndex(Industry,5);
		
		
		
		
	}
		
//		WebElement findIndustry = driver.findElement(By.id("Form_submitForm_Industry"));
//		WebElement findycountr = driver.findElement(By.id("Form_submitForm_Country"));
//		//findIndustry.sendKeys("Aerospace");
		
		
		//Select html tag: for dropdown--- use select class
		
//          Select select = new Select(findIndustry);
////		//select.selectByVisibleText("Computer / Technology - Reseller (inc VAR)"); // by visible text , is same in this case 
////		select.selectByIndex(2); // by index
//        select.selectByValue("Computer/Technology-Reseller");
////		
//	}
		public static WebElement getElement(By locator)
		{
			return driver.findElement(locator);
		}
		
		
		public static void SelectDropDownValuebyVisibleText(By locator , String value){
			Select select = new Select(getElement(locator));
			select.selectByVisibleText(value);
		}
		
		public static void SelectDropDownValuebyIndex(By locator , int Index){
			Select select = new Select(getElement(locator));
			select.selectByIndex(Index);
		} 
			
			public static void SelectDropDownValuebyValue(By locator , String value){
				Select select = new Select(getElement(locator));
				select.selectByValue(value);
			
		}

}
