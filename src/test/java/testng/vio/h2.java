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
public class h2 {
	 static WebDriver dr;

	@BeforeClass
	public void Bclas() {
		System.out.println("befor class ");
		h2.dr = new FirefoxDriver();
		dr.get("file:///C:/Users/Lenovo/Desktop/EnquiryForm.html");
	}
	@Test
	public void m1() throws InterruptedException {
		Thread.sleep(2000);
		h2.dr.findElement(By.xpath("html/body/form/fieldset/input[3]")).click();
		System.out.println("inside test2");
	}

	@Test
	public void m2() {
		h2.dr.findElement(By.xpath("html/body/form/fieldset/input[6]")).click();
		System.out.println("inside test3");
	}
	

	@AfterClass
	public void Aftrclass() throws InterruptedException {
		Thread.sleep(2000);
		h2.dr.close();
		System.out.println("After Class ");

	}
}
