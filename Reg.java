package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Reg {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testReg() throws Exception {
    driver.get("https://app.yaware.com.ua/#register");
    driver.findElement(By.id("firstname")).click();
    driver.findElement(By.id("firstname")).clear();
    driver.findElement(By.id("firstname")).sendKeys("NazariiH");
    assertEquals("NazariiH", driver.findElement(By.id("firstname")).getText());
    driver.findElement(By.id("lastname")).click();
    driver.findElement(By.id("lastname")).clear();
    driver.findElement(By.id("lastname")).sendKeys("NTest");
    driver.findElement(By.id("registerEmail")).click();
    driver.findElement(By.id("registerEmail")).clear();
    driver.findElement(By.id("registerEmail")).sendKeys("s983843@mvrht.net");
    assertEquals("s983843@mvrht.net", driver.findElement(By.id("registerEmail")).getText());
    driver.findElement(By.id("pwd1")).click();
    driver.findElement(By.id("pwd1")).clear();
    driver.findElement(By.id("pwd1")).sendKeys("Test123456789");
    assertEquals("Test123456789", driver.findElement(By.id("pwd1")).getAttribute("value"));
    driver.findElement(By.id("phone")).click();
    driver.findElement(By.xpath("//div[@id='form-field-termsOfService']/label")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
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
}
