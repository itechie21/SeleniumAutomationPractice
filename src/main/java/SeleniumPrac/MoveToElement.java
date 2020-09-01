package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(5000);
		
		WebElement parentcontent = driver.findElement(By.className("menulink"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(parentcontent).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("COURSES")).click();// in dom small letters are used but we have to use as displayed
		Thread.sleep(2000);
		driver.quit();
	}

}


//getMenuListTwoLevels(WebElement element, By locator, String value) throws InterruptedException {
//	
//	Actions action = new Actions(driver);
//	action.moveToElement(element).perform();
//	List<WebElement> addonList = driver.findElements(locator);
//	System.out.println(addonList.size());
//	for (WebElement ele : addonList) {
//			if(! ele.getText().isEmpty()) {
//			String addonText = ele.getText();
//			System.out.println(addonText);
//				if(addonText.equals(value)) {
//					ele.click();
//					break;
//				}
//		}
//	}
//	
//}