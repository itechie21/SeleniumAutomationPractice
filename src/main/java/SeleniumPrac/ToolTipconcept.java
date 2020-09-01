package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipconcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("age")).sendKeys("30");
		
		Actions actions =  new Actions(driver);
		WebElement ele = driver.findElement(By.id("age"));
		actions.moveToElement(ele).perform(); // move over
		
		String tooltip =driver.findElement(By.className("ui-tooltip-content")).getText();
		
		System.out.println(tooltip);// tooltip text
		
		
		
	}

}
