/**
 * 
 */
package testng.vio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class h1 {
	 static WebDriver dr;

	@BeforeClass
	public void Bclas() {
		System.out.println("befor class ");
		h1.dr = new FirefoxDriver();
		dr.get("file:///C:/Users/Lenovo/Desktop/EnquiryForm.html");
	}
	@Test
	public void m1() {
		h1.dr.findElement(By.xpath(".//*[@id='firstname']")).sendKeys("Ajax");
		System.out.println("inside test1");
	}

	@Test
	public void m2() {
		h1.dr.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("Jquery");
		System.out.println("inside test2");
	}
	

	@AfterClass
	public void Aftrclass() {
		h1.dr.close();
		System.out.println("After Class ");

	}
}
