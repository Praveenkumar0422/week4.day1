package week4.day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>lst=new LinkedList<String>(windowHandles);
		driver.switchTo().window(lst.get(1));
		
		driver.findElement(By.xpath("//button[text()='Later']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[3]"));
		String attribute = findElement.getAttribute("href");
		System.out.println(attribute);
		
		driver.switchTo().window(lst.get(0));
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(lst.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		

		
		
		
	
	
		
		 

	}

}
