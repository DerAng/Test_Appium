package tests;



import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestA extends BaseClass{
	
	
	@Test
	public void testOne() {
		
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Automation");
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		
		
		System.out.println("Completed Test One...");
		
	}
	
	
	
	
	@Test
	public void testTwo() {
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Cucumber");
	    driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		
		
		System.out.println("Completed Test Two...");
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		    
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    
	        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	       
	        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	       
	        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(Keys.ENTER);
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.findElement(By.xpath("//*[@id='welcome']")).click();
		    
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit(); // Cierra el navegador una vez completa la prueba
	}
	

}
