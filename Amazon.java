package week4.day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	    System.out.println(" price of the first product " +text);
	    String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
	    System.out.println("the number of customer ratings for the first displayed product" +text2);
	    driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]")).click();
	    String text3 = driver.findElement(By.xpath("(//span[@class='a-size-base'])[2]/a")).getText();
	    System.out.println("percentage of ratings for the 5 star. "+text3);
	    driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String>mobile=new LinkedList<String>(windowHandles);
	    driver.switchTo().window(mobile.get(1));
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	  
	    String cart = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
	    System.out.println("cart subtotal:"+cart);

	    
	    
	    if (text.equals(cart)) {
	    	
	    	System.out.println("is correct");
			
		}
	    else {
	    	System.out.println("is mismatch");
			
		}
	    
	    
		
		
		
		

	}

}
