package SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\SHRIOM\\Downloads\\Digestive_sys.pdf");
	  // dont use click() as selenium will be hanged so instead of clinck use send;
		
		// type = file is necessary
		// autoid is window based utility / 3rd party tool
		
		
	}

}
