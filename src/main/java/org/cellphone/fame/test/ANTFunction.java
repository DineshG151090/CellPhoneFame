package org.cellphone.fame.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ANTFunction extends ExcelIntegration {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
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
				
				TakesScreenshot t = (TakesScreenshot) driver;
				File s = t.getScreenshotAs(OutputType.FILE);
				File d = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\Homepage.png");
				
				FileUtils.copyFile(s, d);
				
				//To click the login button
				driver.findElement(By.xpath("//a[text()='Log In']")).click();
				
				//To check the Register button
				driver.findElement(By.xpath("//a[text()='Register Now']")).click();
				
				File s8 = t.getScreenshotAs(OutputType.FILE);
				File d8 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\Regiester.png");
				
				FileUtils.copyFile(s8, d8);
				
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
				
				driver.navigate().to("https://www.cellphonefame.com/");
		
		//Action mhover
		Actions a = new Actions(driver);

		WebElement mobileDevices = driver.findElement(By.xpath("(//a[text()='Mobile devices'])[1]"));
		a.moveToElement(mobileDevices).perform();

		WebElement apple = driver.findElement(By.xpath("(//span[text()='Apple '])[1]"));
		a.moveToElement(apple).perform();
		apple.click();
		
		File s1 = t.getScreenshotAs(OutputType.FILE);
		File d1 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\Search.png");
		
		FileUtils.copyFile(s1, d1);
		
		//To search the product
		WebElement searchContent = driver.findElement(By.xpath("//input[@id='search']"));
		searchContent.sendKeys(getData(1, 0));
		
		File s2 = t.getScreenshotAs(OutputType.FILE);
		File d2 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\SendValue.png");
		
		FileUtils.copyFile(s2, d2);
		
		WebElement searchBtn = driver.findElement(By.xpath("(//i[@class='icon-search'])[2]"));
		searchBtn.click();
		
		File s3 = t.getScreenshotAs(OutputType.FILE);
		File d3 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\SeItems.png");
		
		FileUtils.copyFile(s3, d3);
		
		//Navigate to
		driver.navigate().to("https://www.cellphonefame.com/mobile-devices/apple.html");
		
		File s4 = t.getScreenshotAs(OutputType.FILE);
		File d4 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\navigate.png");
		
		FileUtils.copyFile(s4, d4);
		
		//To add to cart
		WebElement addToCart = driver.findElement(By.xpath("//a[@class='addtocart']"));
		addToCart.click();
		
		File s5 = t.getScreenshotAs(OutputType.FILE);
		File d5 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\addtocart.png");
		
		FileUtils.copyFile(s5, d5);
		
		//Go to the cart page
		//WebElement goToCartPage = driver.findElement(By.xpath("//span[text()=' Go to cart page ']"));
		//WebElement goToCartPage = driver.findElement(By.className("button btn-cart"));
		//goToCartPage.click();
		
		//To Navigate cart page
		driver.navigate().to("https://www.cellphonefame.com/checkout/cart/");
		
		File s6 = t.getScreenshotAs(OutputType.FILE);
		File d6 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\AddtoSave.png");
		
		FileUtils.copyFile(s6, d6);
			
		
		//To locate price
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("(//span[text()='$255.99'])[3]"));
		
		File s7 = t.getScreenshotAs(OutputType.FILE);
		File d7 = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\Screenshots\\price.png");
		
		FileUtils.copyFile(s7, d7);
		
		//To print the price amount
		String getPrice = price.getText();
		System.out.println(getPrice);
		
		File loc = new File("E:\\JavaSelenium\\DineshGanesan\\CellPhoneFame\\TestData\\Phoneprice.xlsx");
		FileOutputStream stream = new FileOutputStream(loc);
		Workbook w = new XSSFWorkbook();
		Sheet ss = w.createSheet("Sheet1");
		Row r = ss.createRow(2);
		Cell c = r.createCell(1);
		c.setCellValue(getPrice);
		//c.setCellValue("Dinesh");
		w.write(stream);
		System.out.println("Wrote Successfully");

	}

}
