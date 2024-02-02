package com.simetrikUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SimetrikUIAutomation {
	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		
		//1. ID Locator and Name locator
		
		driver.get("https://www.google.com.co");
		WebElement googleSearchField = driver.findElement(By.id("APjFqb"));
		googleSearchField.sendKeys("Simetrik");
		
		Thread.sleep(2000);
		
		WebElement GoogleSearchButton = driver.findElement(By.name("btnK"));
		GoogleSearchButton.click();
		
		
		Thread.sleep(2000);
		
		
		 WebElement resultStats = driver.findElement(By.id("result-stats"));
	        String resultStatsText = resultStats.getText();

	        if (!resultStatsText.contains("0 results")) {
	            System.out.println("La prueba pasó. Se encontraron resultados.");
	        } else {
	            System.out.println("La prueba falló. No se encontraron resultados.");
	        }
		
	        Thread.sleep(3000);
	        
	        
	     
			}

}
