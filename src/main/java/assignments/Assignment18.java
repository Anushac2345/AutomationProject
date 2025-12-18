package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment18  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		//locator for logo using class name
		driver.findElement(By.className("logo"));
		
		//locator for welcome text using css selector
		driver.findElement(By.cssSelector("p[class='caption']"));
		
		//locator for header panel using css selector
		driver.findElement(By.cssSelector("div#headerPanel"));
		
		//locator for left menu using xpath
		driver.findElement(By.xpath("//ul[@class='leftmenu']"));
		
		//lacator for Customer Login text using xpath
		driver.findElement(By.xpath("//h2[text()='Customer Login']"));
		
		//locator for username input field using xpath
		driver.findElement(By.xpath("//input[@name='username']"));
		
		//locator for password input field using xpath
		driver.findElement(By.xpath("//input[@name='password']"));
		
		//locator for login button using xpath
		driver.findElement(By.xpath("//input[@value='Log In']"));
		
		//locator for register link using linktext
		driver.findElement(By.linkText("Forgot login info?"));
		
		//locator for register link using linktext
		driver.findElement(By.linkText("Register"));
		
		//locator for span.services image using xpath
		driver.findElement(By.xpath("//span[@class='services']"));
		
		//locator for Atm services dropdown using xpath
		driver.findElement(By.xpath("//ul[@class='services']"));
		
		//locator for online services dropdown using xpath
		driver.findElement(By.xpath("//ul[@class='servicestwo']"));
		
		//locator for Latest News header using xpath
		driver.findElement(By.xpath("//h4[text()='Latest News']"));
		
		//locator for date using xpath
		driver.findElement(By.xpath("//li[@class='captionthree']"));
		
		//locator for ParaBank is now re-opened link using linktext
		driver.findElement(By.linkText("ParaBank Is Now Re-Opened"));
		
		//locator for New! Online Bill Pay link using linktext
		driver.findElement(By.linkText("New! Online Bill Pay"));
		
		//locator for New! Online Account Transfers link using linktext
		driver.findElement(By.linkText("New! Online Account Transfers"));
		
		//locator for footer panel using css selector	
		driver.findElement(By.cssSelector("div#footerPanel"));
		
		//locator for copyright text using xpath
		driver.findElement(By.xpath("//p[@class='copyright']"));
		
		//locator for www.parasoft.com link using linktext
		driver.findElement(By.linkText("www.parasoft.com"));
		

		
		
		Thread.sleep(3000);
		driver.quit();
	}
	}
