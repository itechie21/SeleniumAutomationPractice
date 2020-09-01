package SeleniumPrac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
	
       static WebDriver driver;
       
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("The title is:"+ driver.getTitle());
		
		By Industry=By.id("Form_submitForm_Industry");
		By Country=By.id("Form_submitForm_Country");
		
		System.out.println(getDropDownCount(Country));
		
		List<String> values = getDropDownValues(Industry);
		System.out.println(values);
 
		
//		WebElement countryEle = driver.findElement(country);
//		
//		Select select = new Select(countryEle);
//		List<WebElement> countryoptions = select.getOptions();
//		
//		System.out.println(countryoptions.size());
//		
//		for(WebElement ele : countryoptions)
//			System.out.println(ele.getText());
	}
	//countryoptions.stream().forEach(ele -> system.out.println(ele.getText()));
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static int getDropDownCount(By locator){
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
		return options.size();
	}
	
	public static List<String> getDropDownValues(By locator ){
		
		List<String> textlist = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
	//	options.stream().forEach(ele -> System.out.println(ele.getText()));
		
		for(WebElement ele : options) {
			String text= ele.getText();
			textlist.add(text);
			}
		return textlist;
		
	   }
		
	}
	

