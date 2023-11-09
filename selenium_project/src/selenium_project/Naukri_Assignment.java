package selenium_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Assignment {
	public static void main (String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("name")).sendKeys("Arshpreet", Keys.TAB, "arshpreetgpsk@gmail.com",Keys.TAB,"Arsh@2002", Keys.TAB,"9501044484",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='textWrap'])[2]")).click();
		driver.findElement(By.id("currentCity")).sendKeys("Chandigarh", Keys.ENTER);
		driver.findElement(By.className("uploadResume")).click();
	}
}
