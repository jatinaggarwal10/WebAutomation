package test;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
 
//import org.testng.annotations.AfterMethod;
 
public class WebLogin {
 
	public WebDriver driver;
	 public String baseUrl ="http://phasorlab-web-dev.s3-website-us-east-1.amazonaws.com";
	 
	@BeforeClass
	public void init() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DOGETHER\\Desktop\\Website\\chromedriver.exe");
		  driver =new ChromeDriver();
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
  @Test
 
  public void Login_funct() {
  driver.findElement(By.xpath("//span[text()='Login']")).click();
	  WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	  email.sendKeys("abc12");                                                     //Giving invalid Email input//
	  System.out.println("abc12-Please enter valid email");
	  email.clear();
	  email.sendKeys("maulik@");
	  System.out.println("maulik@-Please enter valid email");
	  email.clear();
	  email.sendKeys(" maulik@ajackus.com");                                       //Giving correct email//
	  System.out.println("maulik@ajackus.com-Valid Email");
	  driver.findElement(By.xpath("//span[text()='Login']")).click(); 
	  System.out.println(" Email-maulik@ajackus.com-Valid");
	  
	  System.out.println("Password is mandatory");                                 //Password is required//
	  WebElement pass1=driver.findElement(By.xpath("//input[@type='password']"));
	  pass1.sendKeys("12");                                                        
	  System.out.println("Password is 12");
	  driver.findElement(By.xpath("//span[text()='Login']")).click();
	  System.out.println("Invalid crendentials");                                 //Invalid credentials//
	  driver.navigate().refresh();
  }
	
	  @Test(priority=1)
	  
	  public void SuccesfulLogin() {
		  
	  
	  WebElement email1=driver.findElement(By.xpath("//input[@type='email']"));
	  email1.sendKeys(" maulik@ajackus.com");                                       //Giving valid Email//
	  System.out.println(" Email-maulik@ajackus.com");
	  WebElement pass2=driver.findElement(By.xpath("//input[@type='password']"));
	  pass2.sendKeys("test123");                                                    //Give Password//
	  System.out.println(" pass-test123");
	  driver.findElement(By.xpath("//span[text()='Login']")).click();
	  System.out.println(" Logged In sucessfully");                                  //Successful Login//
	  
	  
  }
	  /*
  @AfterTest
 
  public void afterMethod() {
 
	  // Close the driver
 
      driver.quit();
 
  }*/
 
}
