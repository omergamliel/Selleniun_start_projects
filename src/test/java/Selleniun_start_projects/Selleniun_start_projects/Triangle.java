package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Triangle {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Geckodriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	  }
		
	@Test
	public void Tests1() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }
	
	@Test
	public void Tests2() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }
	
	@Test
	public void Tests3() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }
	
	@Test
	public void Tests4() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }
	
	@Test
	public void Tests5() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }
	
	@Test
	public void Tests6() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }
	
	@Test
	public void Tests7() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }
	
	@Test
	public void Tests8() {
		
		//התוצאה הצפויה
		String expected= "2";
		
		//שדה ראשון
		WebElement side1_textBox = browser.findElement(By.id("side1"));
		side1_textBox.sendKeys("5");
		
		//שדה שני
		WebElement side2_textBox = browser.findElement(By.id("side2"));
		side2_textBox.sendKeys("8");
		
		//שדה שלישי
		WebElement side3_textBox = browser.findElement(By.id("side3"));
		side3_textBox.sendKeys("10");
		
		//ללחוץ על הכפתור
		browser.findElement(By.id("identify-triangle-action")).click();
		
		//שמירת הפלט של הנתונים
		 String result= browser.findElements(By.id("triangle-type")).toString();
		 
		 //השוואה בין התוצאה הצפויה לתוצאה בפועל
		assertEquals(expected,result);
   }

}
