package naukriLoop;

import java.util.*;
import java.lang.*;
import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NaukriFirstTry {
	static WebDriver driver;
	
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  while(true) {
	  driver = new ChromeDriver();
	  driver.get("https://www.naukri.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Login")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input [@placeholder = 'Enter your active Email ID / Username']")).sendKeys("siddhesh.chavan2009@gmail.com");
	  driver.findElement(By.xpath("//input[@placeholder = 'Enter your password']")).sendKeys("Sidboss@195803");
	  driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class = 'view-profile-wrapper']//a[contains(text(),'View')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class = 'widgetHead']//span[@class = 'edit icon']")).click();
	  driver.findElement(By.xpath("//textarea[@id = 'resumeHeadlineTxt']")).clear();
	  driver.findElement(By.xpath("//textarea[@id = 'resumeHeadlineTxt']")).sendKeys("Siddhesh Chavan | Test Engineer | Automation & Manual Testing | 2.4 Yrs EXP | Proficient in Selenium, Java, TestNG, Cucumber, Maven | Expertise in API Testing, Framework Design, ETL & SDLC | Pune-based");
	  driver.findElement(By.xpath("//button[@type = 'submit' and @class = 'btn-dark-ot']")).click();
	  driver.close();
	  }
  
  }
}
