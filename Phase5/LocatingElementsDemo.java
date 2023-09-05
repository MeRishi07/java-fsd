package com.ecommerce.test;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class LocatingElementsDemo {



public static void main(String[] args) throws InterruptedException {



WebDriver driver = new ChromeDriver(); // new FirefoxDriver();



//	Demo locating by id, name and class

//	googleAccCreation(driver);



//	Demo cssSelector facebookAccCreation(driver);



//	close the browser and quit.

//	driver.close();

}



static void facebookAccCreation(WebDriver driver) {

String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";



driver.get(baseUrl);
 
String cssDay = "#day";

WebElement cssDaySelect = driver.findElement(By.cssSelector(cssDay));



Select daySelect = new Select(cssDaySelect);

daySelect.selectByVisibleText("11");



//	PROBLEM : locate the gender element and try setting it F/M/C

//	String cssGender = "#u_0_4_nJ";

//	WebElement cssGenderRadio = driver.findElement(By.cssSelector(cssGender));

//	cssGenderRadio.click();



WebElement cssGenderRadio = driver.findElement(By.cssSelector("span > span >

input[type='radio'][value='2']"));

cssGenderRadio.click();



// Demo find by tag name

List<WebElement> titleTagElement = driver.findElements(By.tagName("title"));



JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("console.log(arguments[0].innerText)", titleTagElement);



System.out.println("WebPage Title is " + titleTagElement.get(0).getText());



}



}
