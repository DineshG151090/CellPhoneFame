package org.cellphone.fame.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) {
		//Set property
		System.setProperty("webdriver.chrome.driver", "E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\driver\\chromedriver.exe");
		
		//Browser Launch
		WebDriver driver = new ChromeDriver();
		
		//Load url
		driver.get("https://www.cellphonefame.com/");
		
		//To maximize
		driver.manage().window().maximize();
		
		//To get the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//To get the current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//To click the login button
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		
		//To check the Register button
		driver.findElement(By.xpath("//a[text()='Register Now']")).click();
		
		//To check the Submit button before enter the details
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		//To enter the First Name
		WebElement firstName = driver.findElement(By.id("socialogin.firstname"));
		firstName.sendKeys("Dinesh");
		
		//To enter the Last Name
		WebElement lastName = driver.findElement(By.id("socialogin.lastname"));
		lastName.sendKeys("Ganesan");
		
		//To enter the Eamil id
		WebElement email = driver.findElement(By.id("socialogin.email"));
		email.sendKeys("dineshg1510@gmail.com");
		
		//To enter the New Password
		WebElement newPass = driver.findElement(By.xpath("//input[@id='socialogin.pass']"));
		newPass.sendKeys("123456789");
				
		//To enter the Confirm Password
		//WebElement confirmPass = driver.findElement(By.xpath("//input[@id='socialogin.pass.confirm']"));
		//confirmPass.sendKeys("123456789");
		
		//To check the Submit button after enter the details
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		
		//Back to Form Login
		driver.findElement(By.xpath("(//a[text()='Back to Form Login'])[2]")).click();

	}

}
