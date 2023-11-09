package selenium_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://demo.actitime.com/login.do");
	    
	    WebElement username_textField = driver.findElement(By.name("username"));
	    WebElement password_textfield = driver.findElement(By.name("pwd"));
	    username_textField.sendKeys("admin");
	    password_textfield.sendKeys("manager");
	    WebElement login_Button = driver.findElement(By.id("loginButton"));
	    login_Button.click();
//	    Thread.sleep(2000);
	    driver.findElement(By.id("container_tasks")).click();
//	    Thread.sleep(2000);
	    driver.findElement(By.className("plusIcon")).click();
//	    Thread.sleep(2000);
	    driver.findElement(By.className("createNewCustomer")).click();
//	    Thread.sleep(2000);
	    //driver.findElement(By.className("customerInfoDev")).click();
	    WebElement New_Customer = driver.findElement(By.className("newNameField"));
	    New_Customer.sendKeys("admin");
//	    Thread.sleep(2000);
	    driver.findElement(By.className("commitButtonPlaceHolder")).click();
	    
	      
	      
	    
	    
	   
	   }

	}
