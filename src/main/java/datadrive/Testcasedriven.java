package datadrive;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcasedriven {
	WebDriver dr;

	@BeforeMethod
	public void setup() {
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("C:\\Users\\Lenovo\\Desktop\\Appiumworkspace\\Tst_Jenkins\\EnquiryForm.html");

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData") 
	public void mainBody(String txt1, String txt2, String txt3, String txt4, String txt5, String txt6) {

		dr.findElement(By.id("firstname")).clear();
		dr.findElement(By.id("firstname")).sendKeys(txt1);

		dr.findElement(By.id("lastname")).clear();
		dr.findElement(By.id("lastname")).sendKeys(txt2);

		dr.findElement(By.id("alternatename")).clear();
		dr.findElement(By.id("alternatename")).sendKeys(txt3);

		dr.findElement(By.id("addressname")).clear();
		dr.findElement(By.id("addressname")).sendKeys(txt4);

		dr.findElement(By.id("addressname2")).clear();
		dr.findElement(By.id("addressname2")).sendKeys(txt5);

		dr.findElement(By.id("addressname3")).clear();
		dr.findElement(By.id("addressname3")).sendKeys(txt6);

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		dr.close();
	}

}
