package week4.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		System.out.println(text);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		alert.accept();
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("praveen");
		alert.accept();
		String text3 = driver.findElement(By.id("result1")).getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		
		
		
		
		
		

	}

}
