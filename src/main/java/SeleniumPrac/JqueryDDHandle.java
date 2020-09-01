package SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDDHandle {
	
	 public static WebDriver driver;
	 static final String all = "all";

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		
	    By choice= By.xpath("//span[@class='comboTreeItemTitle']");

		//  https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
	   //	List<WebElement> choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		        for(int i=0;i<choicelist.size();i++ )
//		{
//			System.out.println(choicelist.get(i).getText()); 
//			 String text = choicelist.get(i).getText();
//			
//			if(text.equalsIgnoreCase("choice 2"))
//			{
//				choicelist.get(i).click();
//				break;
//			}
//		}
	    
	  // multiple
	  selectChoiceValue(choice,"choice 2","choice 6 2 1");
	  
	  // all key -- all value
	  //selectChoiceValue(choice,"all");	  
	  selectChoiceValue(choice,JqueryDDHandle.all);
		Thread.sleep(5000);
		driver.quit();
	}

	
	
	public static void selectChoiceValue(By Loactor,String... Value)// string of arr
	{
       List<WebElement> choicelist = driver.findElements(Loactor);
	
		if(!Value[0].equalsIgnoreCase(JqueryDDHandle.all)){
		   for(int i=0;i<choicelist.size();i++)
		    {
			 //System.out.println(choicelist.get(i).getText()); 
			 String text = choicelist.get(i).getText();
			 System.out.println(text);
			 
			 for(int j=0;j<Value.length;j++) // for iterating array (value) 
			  {
				 if(text.equals(Value[j]))
					{
						choicelist.get(i).click();
						break;
					}
			  }
		 }
	  }
		
		else
		{
		  try{
		       for(int all=0;all<choicelist.size();all++)
			    {
				   choicelist.get(all).click();
			    }
		    }
		  catch(Exception e)
			{
			}
			
//			if(text.equalsIgnoreCase(Value))
//			{
//				choicelist.get(i).click();
//				break;
//			}
	
  }
 }
}
