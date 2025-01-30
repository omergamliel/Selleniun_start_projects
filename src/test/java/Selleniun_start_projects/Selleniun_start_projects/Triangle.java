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
* STUDENT 1 | Avivit Lifshin (207626896)
* STUDENT 2 | Omer Gamliel (209052786)
* STUDENT 3 | Heli Cohen (206719171)
**/
public class Triangle {
	static WebDriver  browser;
	
	
	//--------------------------------[הפונקציה שרצה בתחילת הבדיקה]--------------------------------
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Geckodriver\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
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
	      String expected = "Error: Not a Triangle";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("5");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("1");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("1");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests2() {
	      // התוצאה הצפויה
	      String expected = "Error: Not a Triangle";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("3");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("8");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("1");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests3() {
	      // התוצאה הצפויה
	      String expected = "Error: Not a Triangle";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("5");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("5");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("10");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests4() {
	      // התוצאה הצפויה
	      String expected = "Equilateral";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("5");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("5");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("5");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests5() {
	      // התוצאה הצפויה
	      String expected = "Isosceles";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("7");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("7");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("8");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------
	  
	//--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests6() {
	      // התוצאה הצפויה
	      String expected = "Isosceles";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("6");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("5");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("6");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests7() {
	      // התוצאה הצפויה
	      String expected = "Isosceles";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("5");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("4");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("4");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

	  //--------------------------------[תחילת בדיקה]--------------------------------
	  @Test
	  public void Tests8() {
	      // התוצאה הצפויה
	      String expected = "Scalene";

	      // שדה ראשון
	      WebElement sideBox = browser.findElement(By.id("side1"));
	      sideBox.sendKeys("3");

	      // שדה שני
	      sideBox = browser.findElement(By.id("side2"));
	      sideBox.sendKeys("4");

	      // שדה שלישי
	      sideBox = browser.findElement(By.id("side3"));
	      sideBox.sendKeys("5");

	      // ללחוץ על הכפתור
	      browser.findElement(By.id("identify-triangle-action")).click();

	      // שמירת הפלט של הנתונים
	      String result = browser.findElement(By.id("triangle-type")).getText();

	      // השוואה בין התוצאה הצפויה לתוצאה בפועל
	      assertEquals(expected, result);
	  }
	  //--------------------------------[סיום בדיקה]--------------------------------

}
