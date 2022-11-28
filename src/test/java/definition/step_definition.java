package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition {
	public static String url="https://www.mxplayer.in/";
	WebDriver driver;
	@Given("I should go to the home page")
	public void i_should_go_to_the_home_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);	
		driver.manage().window().maximize();	
		Thread.sleep(3000);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);

	   
	}
	@When("Click on the Others tab")
	public void click_on_the_others_tab() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Others']")).click();
	}
	    
	
	@And("Click on the Music tab")
	public void click_on_the_music_tab() throws InterruptedException {
		Thread.sleep(5000);
		Actions act1=new Actions(driver);
	    act1.moveToElement( driver.findElement(By.xpath("//*[@data-value='music']"))).click().build().perform();
		
		
		
	}
	    
	@And("Click on the Hindi tab")
	public void click_on_the_hindi_tab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@href='/music-videos/hindi-songs']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Hindi')]")).click();
	   
	}
	@And("Click on the Tamil tab")
	public void click_on_the_tamil_tab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Others']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@data-value='music']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@href='/music-videos/tamil-songs']")).click();
	    Thread.sleep(3000);
	
	    
	}
	@And("Click on the Punjabi tab")
	public void click_on_the_punjabi_tab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Others']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-value='music']")).click();
		driver.findElement(By.xpath("//*[@href='/music-videos/punjabi-songs']")).click();
	
	   
	}
	@And("Click on the English tab")
	public void click_on_the_english_tab() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[text()='Others']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@data-value='music']")).click();
		driver.findElement(By.xpath("//*[@href='/music-videos/english-songs']")).click();
	}
	@And("Click on the Telugu tab")
	public void click_on_the_telugu_tab() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Others']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@data-value='music']")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@href='/music-videos/telugu-songs']")).click();
	   
	}
	
	@Then("I should see title as {string}")
	public void i_should_see_title_as(String string) throws InterruptedException {
		Assert.assertEquals(string, driver.getTitle());
	    driver.close();
	}

	
}
	



