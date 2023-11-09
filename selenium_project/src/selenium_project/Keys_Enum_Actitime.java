package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Enum_Actitime {
	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	    //  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://demo.actitime.com/login.do");
	      
	      driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);
	  }
	}

