package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		System.out.println("The title is:"+ driver.getTitle());
		
		//driver.findElements(By.tagName("img"));
		
	List<WebElement> imglist = driver.findElements(By.tagName("img"));
	System.out.println(imglist.size());
	
//	  for(int i=0;i<imglist.size();i++)
//	  {
//		  System.out.println(imglist.get(i).getAttribute("src"));
//	  }
	  
  for(WebElement img :imglist)
  {
	  System.out.println(img.getAttribute("src"));
  }
		
		
	//imglist.stream().forEach(img -> System.out.println(img.getAttribute("src")));
	
	}

}
