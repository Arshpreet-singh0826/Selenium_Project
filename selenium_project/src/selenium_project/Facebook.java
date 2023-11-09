package selenium_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws FileNotFoundException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("u_0_0_h2")).click();
	    FileInputStream fis = new FileInputStream("/Users/arshpreetsingh/Documents/java workspace/Facebook.xlsx");
	    
	    
	}
}
