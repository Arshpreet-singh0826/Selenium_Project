package selenium_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_PopUp {
	public static void main(String[] args) throws InterruptedException {

	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.manage().window().maximize();
	      driver.get("https://demo.actitime.com/login.do");
	      WebElement username_textField = driver.findElement(By.name("username"));
	      WebElement password_textfield = driver.findElement(By.name("pwd"));
	      username_textField.sendKeys("admin");
	      password_textfield.sendKeys("manager");
	      WebElement login_Button = driver.findElement(By.id("loginButton"));
	      login_Button.click();
	      driver.findElement(By.id("container_tasks")).click();
	      driver.findElement(By.className("img")).click();
	      driver.findElement(By.className("delete")).click();
	      Thread.sleep(2000);
	      String text = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
	      System.out.println(text);
	 
	  }
}
