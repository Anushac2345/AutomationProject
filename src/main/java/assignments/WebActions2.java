package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//1. Launch browser window
		 driver= new ChromeDriver();
		 
		//2. Maximize the browser window
		driver.manage().window().maximize();
		
		//3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
		//4. Enter URL and Launch the application(https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
		
		//5. Wait for Pageload
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='practice-form-wrapper']"), 0));
		
		//6. Enter Firstname and Lastname
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Anusha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chinni");
		
		//7. Enter Email
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("anusharam1523@gamil.com");
		
		//8. Select Gender 'Male'
		selectGender("Male");
		//9. Enter mobile number
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("6124260135");
		
		//10.Select DOB (14-Feb-1991)
		selectDOB("6", "September", "1993");
		
		//11.Search and Select Computer Science
		selectSubject("Computer Science");
		
		//12.Select Hobbies as Sports and Reading
		String[] hobbies= {"Sports", "Reading"};
		selectHobbies(hobbies);
		
		//13.Upload any photo
		WebElement uploadPhoto= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadPhoto.sendKeys(System.getProperty("user.dir")+"\\Files\\Acer_Wallpaper_02_3840x2400.jpg");
		
		//14.Submit Details
		WebElement submitButton= driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitButton);
		
		//15.Wait for successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='Thanks for submitting the form']"), 0));
		
		//16. Close browser window
		driver.quit();
	}
	//common method to select Gender
      public static void selectGender(String gender) {
    	  WebElement genderRadio= driver.findElement(By.xpath("//label[text()='"+gender+"']"));
    	  genderRadio.click();
      }
      
      //common method to create date of birth selector
      public static void selectDOB(String date, String month, String year) {
    	  
    	  //Common method to select Date of Birth
		  WebElement dobInput= driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		  dobInput.click();
		  //Wait for date picker to be visible
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));
		  
			//select month
			WebElement monthDropdown= driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		 Select monthSelect= new Select(monthDropdown);
		 monthSelect.selectByVisibleText(month);
		 
		 //select year
		 WebElement yearDropdown= driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		 Select yearSelect= new Select(yearDropdown);
		 yearSelect.selectByVisibleText(year);
		 
		 //select date
		 WebElement datePicker= driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+date+"']"));
		 datePicker.click();
		 
      }
		 //Common method for select Computer Science
		 public static void selectSubject(String subject) {
			 WebElement subjectInput= driver.findElement(By.xpath("//input[@id='subjectsInput']"));
			 //Enter subject
			 Actions actions= new Actions(driver);
			 actions.sendKeys(subjectInput, subject).perform();
			//wait for the auto-suggestion to appear
			 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"), 0));
			 //Select the subject from auto-suggestion using click
			 WebElement subjectOption = driver.findElement(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"));
			 JavascriptExecutor js= (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();", subjectOption);
      
	  }
		 //common method to select Hobbies
			public static void selectHobbies(String[] hobbies) {
				for (String hobby : hobbies) {
					WebElement hobbyCheckbox = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
					if (!hobbyCheckbox.isSelected()) {
						hobbyCheckbox.click();
					}

				}
			}  
	  

}
