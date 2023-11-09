package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Facebook {
	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	    //  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
	      Thread.sleep(2000);
	       driver.findElement(By.name("firstname")).sendKeys("Arshpreet", Keys.TAB, "Singh",Keys.TAB, "998489498448",Keys.TAB,"Arsh@hotmail.com");
	      WebElement dropdown = driver.findElement(By.id("day"));
	      Select s = new Select(dropdown);
	      s.selectByVisibleText("21");
	      WebElement dropdown1 = driver.findElement(By.id("month"));
	      Select s1 = new Select(dropdown1);
	       s1.selectByVisibleText("Sep");
	       
	      WebElement dropdown2 = driver.findElement(By.id("year"));
	      Select s2 = new Select(dropdown2);
	       s2.selectByVisibleText("2002");
	        driver.findElement(By.className("_58mt")).click();
	       driver.findElement(By.name("websubmit")).click();
	      
	  }
}
