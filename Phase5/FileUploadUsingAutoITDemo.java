package com.ecommerce.test;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadUsingAutoITDemo {
public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
demoFileUpload(driver);
driver.close();
}
static void demoFileUpload(WebDriver driver) throws InterruptedException, IOException {
// String baseUrl =
// "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\afternoon\\hello-selenium\\src\\main\\resources\\test.html";
String baseUrl = "https://demoqa.com/automation-practice-form";
driver.get(baseUrl);
Thread.sleep(2000);
WebElement uploadFileElememt = driver.findElement(By.id("uploadPicture"));
System.out.println("uploadFileElememt details " + uploadFileElememt);
Thread.sleep(2000);
Runtime.getRuntime().exec("C:\\Users\\Saptarshi\\OneDrive\\Desktop\\phase5test.exe");
}
}
