package com.ecommerce.test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class Screenshots {
public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
demoTakingScreenshot(driver);
driver.close();
}
static void demoTakingScreenshot(WebDriver driver) throws InterruptedException, IOException {
String baseUrl = "File:///C:\\Users\\Saptarshi\\eclipse-workspace\\hello-selenium\\src\\main\\test.html";
driver.get(baseUrl);
TakesScreenshot scrShot = ((TakesScreenshot) driver);
File imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);
File destinationPath = new File("C:/screenshots/screenshot.jpg");
Files.copy(imgTmpFile, destinationPath);
}
}
