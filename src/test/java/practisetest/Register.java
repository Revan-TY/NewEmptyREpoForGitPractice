package practisetest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register {
	@Test
    public void login() throws InterruptedException
    {
 	   WebDriver driver = new ChromeDriver();
 	   driver.manage().window().maximize();
 	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	   driver.get("https://eventhub.rahulshettyacademy.com/login");
 	   Thread.sleep(2000);
 	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	   WebElement register = driver.findElement(By.xpath("//a[.='Register']"));

 	   ((JavascriptExecutor) driver).executeScript(
 	       "arguments[0].click();", register);

 	   //driver.findElement(By.xpath("//a[.='Register']")).click();

 	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-email")));
 	  // driver.findElement(By.xpath("//a[.='Register']")).click();
 	   driver.findElement(By.id("register-email")).sendKeys("ibbani804@gmail.com");
 	   driver.findElement(By.id("register-password")).sendKeys("Ibbani@123");
 	   driver.findElement(By.xpath("//input[@placeholder='Repeat your password']")).sendKeys("Ibbani@123");
 	   driver.findElement(By.xpath("//button[.='Create Account']")).click();
 	   
 	   
 	   driver.findElement(By.id("book-now-btn")).click();
 	   Thread.sleep(2000);
 	   driver.quit();
}
}
