package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		WebElement footer= driver.findElement(By.className("footer-main"));// finding footer by class name locator
		List<WebElement> LinkList = footer.findElements(By.tagName("a"));// finding all elements in footer by tag "a"
		
		
		System.out.println("No. of link:" + LinkList.size());		  
		  for (int i =0;i<LinkList.size();i++)
		  {
			 String text= LinkList.get(i).getText();
			 System.out.println(i+"-->"+text);
			  
		  }
	   }
    }
