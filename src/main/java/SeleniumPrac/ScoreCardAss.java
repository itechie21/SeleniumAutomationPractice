package SeleniumPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class ScoreCardAss {
	     static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {

				WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		        driver.get("https://www.espncricinfo.com/series/8674/scorecard/1187716/new-zealand-women-vs-south-africa-women-3rd-odi-icc-womens-championship-2017-18-2021");
		        Thread.sleep(5000);
				
				
				//System.out.println(getWicketTakerName("LR Down"));
				System.out.println(getWicketTakerName("LR Down")+" "+getScoreCard("LR Down"));
				System.out.println(getWicketTakerName("ML Green")+" "+getScoreCard("ML Green"));
				
				
				Thread.sleep(5000);
				driver.quit();
				
			}

			public static String getWicketTakerName(String playerName){
				return driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td/span")).getText();
				}
			
				 
		    public static List<String> getScoreCard(String playerName) {
					 
						List<String> scoreList = new ArrayList<String>();
						List<WebElement> scorecard = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td//following-sibling::td"));
			
						for (WebElement ele : scorecard) {
							String text = ele.getText();
							scoreList.add(text);
						}

						return scoreList;
					}
			}
			
			
			
			





	

	
