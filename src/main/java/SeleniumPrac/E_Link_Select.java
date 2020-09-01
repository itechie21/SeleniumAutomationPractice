package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Link_Select {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		System.out.println("The title is:"+ driver.getTitle());
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println("Size of list is : "+ list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String text =  list.get(i).getText();
			
			
			if (! text.isEmpty())
			{
				System.out.println(i+"--->" +text);
				System.out.println(list.get(i).getAttribute("href"));
			}
			
		}
		
		
	
		
		
		

	}

}
