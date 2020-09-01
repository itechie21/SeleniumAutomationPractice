package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Langlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		System.out.println("The title is:"+ driver.getTitle());
		
		
		List<WebElement> langlink = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(langlink.size());
		
		doClickLink(langlink, "বাংলা");
		
		
//		for(WebElement link : langlink )
//
//			
//		{   String text =link.getText();
//			System.out.println(text);
//
//			
//			if(text.equals("বাংলা)")){
//				
//				link.click();
//				break;
//
//			}
		}
		
		public static void doClickLink(List<WebElement> linkList,String value)
		{
         for(WebElement link : linkList )

			
		{   String text =link.getText();
			System.out.println(text);

			
			if(text.equals(value)){
				
				link.click();
				break;

			}
		}
		
	}
}
