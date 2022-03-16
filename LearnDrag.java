package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement findElement = driver.findElement(By.id("draggable"));
	 WebElement findElement2 = driver.findElement(By.id("droppable"));
		Actions obj=new Actions(driver);
		obj.dragAndDrop(findElement, findElement2).perform();
		
		
		

	}

}
