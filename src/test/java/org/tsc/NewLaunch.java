package org.tsc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLaunch {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.id("username")).sendKeys("Arulprakasam");
	driver.findElement(By.id("password")).sendKeys("12345678");
	driver.findElement(By.id("login")).click();
    Thread.sleep(2000);
    WebElement findElement = driver.findElement(By.id("location"));
    Select select = new Select(findElement);
    select.selectByIndex(2);
    
    
   Select select1 = new Select(driver.findElement(By.id("hotels")));
   select1.selectByIndex(2);
   
   Select select2 = new Select(driver.findElement(By.id("room_type")));
   select2.selectByIndex(2);
   
   Select select3 = new Select(driver.findElement(By.id("room_nos")));
   select3.selectByIndex(2);
   
   driver.findElement(By.id("datepick_in")).sendKeys("06/10/2021");
   driver.findElement(By.id("datepick_out")).sendKeys("07/10/2021");
   
   
   Select select4= new Select(driver.findElement(By.id("adult_room")));
   select4.selectByIndex(2);
   Select select5 = new Select(driver.findElement(By.id("child_room")));
   select5.selectByIndex(2);
   
   driver.findElement(By.id("Submit")).click();
   Thread.sleep(2000);
   driver.findElement(By.id("radiobutton_0")).click();

   driver.findElement(By.id("continue")).click();
   
   driver.findElement(By.id("first_name")).sendKeys("Jai");
   driver.findElement(By.id("last_name")).sendKeys("rameswar");
   driver.findElement(By.id("address")).sendKeys("25,sungu street,anna nagar,chennai");
   driver.findElement(By.id("cc_num")).sendKeys("123456789009876545");
   
   Select select6  = new Select(driver.findElement(By.id("cc_type")));
   select6.selectByIndex(2);
   Select select7 = new Select(driver.findElement(By.id("cc_exp_month")));
   select7.selectByIndex(4);
   Select select8 = new Select(driver.findElement(By.id("cc_exp_year")));
   select8.selectByIndex(10);
   driver.findElement(By.id("cc_cvv")).sendKeys("911");
   driver.findElement(By.id("book_now")).click();
   Thread.sleep(6000);
   WebElement findElement2 = driver.findElement(By.id("order_no"));
    String text = findElement2.getText();
   System.out.println(text);
   Thread.sleep(3000);
   
   
   
   
   
   
   
   
   
   
	
	
	
}
}
