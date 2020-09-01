package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Google.com");
		System.out.println(driver.getTitle()); 	 	
		
		
		driver.findElement(By.name("q")).sendKeys("testing");

		
		Thread.sleep(3000);
		
		
		List<WebElement> Suggestionlist = driver.findElements(By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']/span"));
		System.out.println(Suggestionlist.size());
		
		
		for(WebElement ele : Suggestionlist )
		{
			String text = ele.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("testing tools"));
			ele.click();
			break;
			
		}
		
		//ul[@classname=' erkvQe']/li//span
	}

}
