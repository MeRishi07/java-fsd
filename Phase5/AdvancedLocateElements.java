package com.ecommerce.test;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLocateElements {

public static void main(String[] args) throws InterruptedException {

//	register the chrome driver

//	create an obj to the driver -obj to the browser

//	initiate the driver

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

// Using CSS Selector

WebElement emailInput = driver.findElement(By.cssSelector("input#email")); highlight(driver, emailInput);

WebElement passwordInput = driver.findElement(By.cssSelector("input[name='pass']")); highlight(driver, passwordInput);

Thread.sleep(2000);

// Using XPath

WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']")); highlight(driver, loginButton);

WebElement forgottenPasswordLink = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));

highlight(driver, forgottenPasswordLink);

Thread.sleep(2000);
 
}

public static void highlight(WebDriver driver, WebElement element) {

JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;

background:yellow')",

element);

}

}
