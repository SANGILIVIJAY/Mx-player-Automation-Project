package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mxplayer extends javascript_util {
public static String url="https://www.mxplayer.in/";
	
	WebDriver driver;
    ExtentHtmlReporter htmlReporter; 
    ExtentReports extent;
    ExtentTest test;
	
   
   
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();	
		driver.get(url);	
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

    @Test(enabled=true,priority = 0)
    public void tc1() throws InterruptedException
    {
    	test = extent.createTest("clicking and navigating to the new hot");
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='new & hot🔥']")).click();
        test.pass("user is able to click and navigate to the new hot");
        Thread.sleep(5000);
    }
	@Test(enabled=true,priority = 1)
	public void tc2() throws InterruptedException
	{	
	test = extent.createTest("clicking the more info");
	driver.findElement(By.xpath("//*[@class='bc-more-info-btn']")).click();
	test.pass("user is able to click the more info");
	Thread.sleep(5000);
	}
	@Test(enabled=true,priority = 2)
	public void tc3() throws InterruptedException
	{	
	test = extent.createTest("clicking the Add to list");
    driver.findElement(By.xpath("//div[text()='Add to My List']")).click();
    test.pass("user is able to click the Add to list");
	Thread.sleep(5000);
	}
	@Test(enabled=true,priority = 3)
	public void tc4() throws InterruptedException
	{
	test = extent.createTest("clicking the Play Movie");	
	driver.findElement(By.xpath("//span[text()='Play Movie']")).click();
	test.pass("user is able to click the Play Movie");
	Thread.sleep(25000);
	}
	@Test(enabled=true,priority = 4)
	public void tc5() throws InterruptedException
	{	
	test = extent.createTest("clicking the back button");
	driver.findElement(By.xpath("//*[@class='back-button']")).click();
	test.pass("user is able to click the back button");
	Thread.sleep(5000);
	}
	@Test(enabled=true,priority = 5)
	public void tc6() throws InterruptedException
	{
	test = extent.createTest("clicking the Others");
	driver.findElement(By.xpath("//span[text()='Others']")).click();
	test.pass("user is able to click the Others");
	Thread.sleep(3000);
	
	}
	@Test(enabled=true,priority = 6)
	public void tc7() throws InterruptedException
	{	
	test = extent.createTest("clicking and navigating to the mx vdesi");
	driver.findElement(By.xpath("//*[@data-value='mx-vdesi']")).click();
	test.pass("user is able to click and navigate to the mx vdesi");
	Thread.sleep(3000);
	}
	@Test(enabled=true,priority = 7)
	public void tc8() throws InterruptedException
	{	
	test = extent.createTest("clicking and navigating to the Asian specials in tamil");
	JavascriptExecutor js= ((JavascriptExecutor)driver);
	js.executeScript("window.scroll(0,1000)");
	Thread.sleep(5000);
	Actions act=new Actions(driver);
	WebElement ele= driver.findElement(By.xpath("(//div[@class='cs__sm-text'])[3]"));
	act.moveToElement(ele).build().perform();
	Thread.sleep(5000);
	ele.click();
	test.pass("user is able to click and navigate to the the Asian specials in tamil");
    Thread.sleep(5000);
	}
	@Test(enabled=true,priority = 8)
	public void tc9() throws InterruptedException
	{	
	test = extent.createTest("clicking and navigating to the Others/Mx vdesi");
    driver.findElement(By.xpath("//span[text()='Others']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@data-value='mx-vdesi']")).click();
	test.pass("user is able to click and navigate to the Others/Mx vdesi");
    Thread.sleep(3000);
	}
	@Test(enabled=true,priority = 9)
	public void tc10() throws InterruptedException
	{	
	test = extent.createTest("clicking and navigating to the Top10 Mx vdesi in tamil");
    JavascriptExecutor js1= ((JavascriptExecutor)driver);
	js1.executeScript("window.scroll(0,250)");
	Thread.sleep(8000);
	Actions act1=new Actions(driver);
	WebElement ele1= driver.findElement(By.xpath("(//div[@class='cs__sm-text'])[2]"));
	act1.moveToElement(ele1).build().perform();
	ele1.click();
	test.pass("user is able to click and navigate to the Top10 Mx vdesi in tamil");
    Thread.sleep(5000);
	}
	@AfterTest
    public void aftertest() throws InterruptedException
    {
   
     driver.close();
     extent.flush();
     Thread.sleep(2000);
    }
}
	

	
   
	
	


	
	

	
	
	
	
	







