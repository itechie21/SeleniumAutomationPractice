package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropCon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0);
		
		
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions act = new Actions(driver);// not default construct
	
  //1.  act.dragAndDrop(source, target).perform();// perform actual user action
    
	  act.clickAndHold().moveToElement(target).release().build().perform();// build for more user action n build n perform
	   
    
	}

}
