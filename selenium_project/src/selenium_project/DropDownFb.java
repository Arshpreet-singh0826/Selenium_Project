package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFb {
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
	    Thread.sleep(2000);
	    WebElement dropdown = driver.findElement(By.id("day"));
	    Select s = new Select(dropdown);
	    s.selectByVisibleText("29");
	    Thread.sleep(2000);
	    WebElement dropdown1 = driver.findElement(By.id("month"));
	    Select s1 = new Select(dropdown1);
	     s1.selectByVisibleText("Jan");
	     
	    WebElement dropdown2 = driver.findElement(By.id("year"));
	    Select s2 = new Select(dropdown2);
	     s2.selectByVisibleText("2003");
	    

	}
}
