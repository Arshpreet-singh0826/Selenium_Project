package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_File_Upload_popUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='file")).sendKeys("/Users/arshpreetsingh/Downloads/4d18d375-a108-4dc2-82c8-82f8a4d7ef4d.jpg");
	}
	
}
