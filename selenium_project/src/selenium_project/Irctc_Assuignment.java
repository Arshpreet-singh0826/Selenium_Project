package selenium_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc_Assuignment {
	public static void main(String[] args) {
		
		
		ChromeOptions opt = new  ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		
		while(true)
		{
			String month = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-month')]")).getText();
			String year = driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-year')]")).getText();
			if(month.equals("December")&&year.equals("2023"))
			{
				driver.findElement(By.xpath("//a[text()='15']")).click();
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[contains(@class,'ui-datepicker-next-icon')]")).click();
			}
		}
		
	}

	
}
