package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		WebElement findElement = driver.findElement(By.xpath("//div[@class='card mb-3']/iframe"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.tagName("input")).sendKeys("selenium");
		WebElement findElement2 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(findElement2);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		WebElement findElement3 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(findElement3);
		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='animals']"));
		Select obj=new Select(findElement4);
		obj.selectByVisibleText("Big Baby Cat");
		
		
		
		

	}

}
