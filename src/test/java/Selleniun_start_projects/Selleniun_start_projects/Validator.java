package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
* STUDENT 1- | Avivit Lifshin (207626896)
* STUDENT 2- | Omer Gamliel (209052786)
* STUDENT 3- | Heli Cohen (206719171)
**/
public class Validator {
	static WebDriver  browser;
	
	
	//--------------------------------[הפונקציה שרצה בתחילת הבדיקה]--------------------------------
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Geckodriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
	 
	//--------------------------------[הפונקציה שרצה בסיום הבדיקה]--------------------------------
	 //המטרה של הפונקציה זה בכל פעם שמסתיימת בדיקה- החלון בדפדפן יסגר
	 @After
	    public void tearDown() {
	        browser.quit();
	    }
	  
	//--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests1() {
	      // התוצאה הצפויה
	      String expected = "Valid Value";

	      // שדה טקסט הכנסת הסיסמא
	      WebElement sideBox = browser.findElement(By.name("characters"));
	      sideBox.sendKeys("emeky1*");

	      // ללחוץ על הכפתור
	      browser.findElement(By.name("validate")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.name("validation_message")).getAttribute("value");

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests2() {
	      // התוצאה הצפויה
	      String expected = "Invalid Value";

	      // שדה טקסט הכנסת הסיסמא
	      WebElement sideBox = browser.findElement(By.name("characters"));
	      sideBox.sendKeys("yvc123!");

	      // ללחוץ על הכפתור
	      browser.findElement(By.name("validate")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.name("validation_message")).getAttribute("value");

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------
	  
	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests3() {
	      // התוצאה הצפויה
	      String expected = "Invalid Value";

	      // שדה טקסט הכנסת הסיסמא
	      WebElement sideBox = browser.findElement(By.name("characters"));
	      sideBox.sendKeys("12345678");

	      // ללחוץ על הכפתור
	      browser.findElement(By.name("validate")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.name("validation_message")).getAttribute("value");

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------
}
