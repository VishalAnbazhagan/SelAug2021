package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	/*	
		// locate the web element
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select drpDwn = new Select(drop1);
		// three ways to select the drop down elements
	//	drpDwn.selectByIndex(1);  // Selenium
	//	drpDwn.selectByValue("1");
		drpDwn.selectByVisibleText("Selenium");
	*/
		
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select drpDwn = new Select(drop1);	
		drpDwn.selectByIndex(1);  // Selenium
		
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select drpDwn2 = new Select(drop2);
		drpDwn2.selectByVisibleText("UFT/QTP");
		
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select drpDwn3 = new Select(drop3);
		drpDwn3.selectByValue("4");
		
		// Get the size of the dropdown ( Number of drop down elements)
		int sizeDrpDwn3 = drpDwn3.getOptions().size();
		System.out.println(" Size of third drop down:" + sizeDrpDwn3);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
