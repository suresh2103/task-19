package task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviRegister {

	public static void main(String[] args) {

		// Implement the WebDriver to open the chromeBrowser

		WebDriver driver = new ChromeDriver();

		// Maximize the window

		driver.manage().window().maximize();

		// Navigate to URL

		driver.get("https://www.guvi.in/register");

		// Locating name Text box Element

		WebElement firstName = driver.findElement(By.id("name"));

		firstName.sendKeys("Test");

		// Locating the EmailId Field

		WebElement emailId = driver.findElement(By.cssSelector("#email"));

		emailId.sendKeys("sureshkarthik21@gmail.com");

		// Locating the password Field

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		password.sendKeys("Karthik@123456");

		// Locating the Mobile Number Field

		WebElement mobileNo = driver.findElement(By.id("mobileNumber"));

		mobileNo.sendKeys("9597100650");

		// Locating & printing the Head Text

		WebElement heading = driver.findElement(By.className("mainHeading"));

		System.out.println(heading.getText());

		// Locating and printing the Sub heading

		WebElement subHeading = driver.findElement(By.xpath("(//span[text()='FREE with GUVI!'])[1]"));

		System.out.println(subHeading.getText());

		// Locating and printing the sub text

		WebElement subHead = driver.findElement(By.className("sub-head"));

		System.out.println(subHead.getText());

		// Locating the SignUp Text

		WebElement SignUpText = driver.findElement(By.tagName("h2"));

		System.out.println(SignUpText.getText());

		// Locating the Login link and clicking as we already have account

		WebElement login = driver.findElement(By.linkText("Login"));

		login.click();

		// Locating the emailId and sending keys

		WebElement emailId1 = driver.findElement(By.id("email"));

		emailId1.sendKeys("sureshkarthik21@gmail.com");

		// Locating the password and entering

		WebElement password1 = driver.findElement(By.xpath("//input[@type='password']"));

		password1.sendKeys("Karthik@123456");

		// Selecting the option keep signed in

		WebElement keepSignin = driver.findElement(By.name("logged-in"));

		keepSignin.click();

		// Login

		WebElement signin = driver.findElement(By.id("login-btn"));

		signin.click();

		// Close the browser

		driver.quit();

	}

}
