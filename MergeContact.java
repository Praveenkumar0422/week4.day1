package week4.day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.xpath("//div[@id='label']/a")).click();
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
      
        driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>window=new LinkedList<String>(windowHandles);
        driver.switchTo().window(window.get(1));
        String title = driver.getTitle();
        System.out.println(title);
       
        
        List<WebElement>lst= driver.findElements(By.xpath("//a[contains(@class,'linktext')]"));
        int size = lst.size();
        System.out.println(size);
        lst.get(0).click();
        driver.switchTo().window(window.get(0));
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String>windows=new LinkedList<String>(windowHandles1);
        
        driver.switchTo().window(windows.get(1));
        
     
        driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[8]")).click();
        driver.switchTo().window(window.get(0));
        
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        String title2 = driver.getTitle();
        System.out.println(title2);
        
        
			
		
        
        
        
        
      
        
        
       
      
       
      
		
        
      
        
        
        
        
        
			
		
  	 
        
       
        
        			 
        	
        	 
        	
			
		
       
        
	}}

