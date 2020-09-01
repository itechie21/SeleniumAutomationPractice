package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	System.out.println(driver.getTitle());
	
	//driver.switchTo().frame(2); 
	//driver.switchTo().frame("main");
	WebElement FrameEle = driver.findElement(By.name("main"));
	driver.switchTo().frame(FrameEle);
	
	
	WebElement Header = driver.findElement(By.tagName("h2"));
	
	System.out.println(Header.getText());
	driver.switchTo().defaultContent(); 
	
	
	}

}
