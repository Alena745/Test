package Alena;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testt extends Alena.pages.TestBase {

  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/?gws_rd=ssl");
    driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
    driver.findElement(By.name("btnK")).submit();
  }
  
    
  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
    
  }
  @Test
  public void testUntitled2() throws Exception {
 driver.findElement(By.linkText("Selenium - Web Browser Automation"));
 driver.findElement(By.linkText("Downloads - Selenium"));
 driver.findElement(By.linkText("Selenium — Википедия"));
}
}

