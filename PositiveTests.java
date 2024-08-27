package com.testing.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {

		WebDriver driver = beforeTest();

		fromToDateSearch(driver);

		bookFlight(driver);

		basicDetailsStored(driver);

		checkboxMailBook(driver);

		basicDetails(driver);
		
		bestSelectedSeatFromSite(driver);
		
		grandTotal(driver);

		lastStep(driver);

	}

	public void lastStep(WebDriver driver) {
		driver.quit();

		System.out.println("Finished");
	}

	public void grandTotal(WebDriver driver) {
		String GrandTotal = driver.findElement(By.xpath("//*[@id=\"spnGrndTotal\"]")).getText();
		System.out.println("Grand Total = " + GrandTotal);
		
		sleep(2);
	}

	public void bestSelectedSeatFromSite(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"spnTransaction\"]")).click();
	}

	public void basicDetails(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"titleAdult0\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"titleAdult0\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"txtFNAdult0\"]")).sendKeys("Aayush");
		
		driver.findElement(By.xpath("//*[@id=\"txtLNAdult0\"]")).sendKeys("Sharma");
		
		driver.findElement(By.xpath("//*[@id=\"txtCPhone\"]")).sendKeys("9865321478");
		
		sleep(2);
	}

	public void checkboxMailBook(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"divInsuranceTab\"]/div[3]/div[1]/label/span")).click();

		sleep(2);

		driver.findElement(By.xpath("//*[@id=\"txtEmailId\"]")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"spnVerifyEmail\"]")).click();
	}

	public void basicDetailsStored(WebDriver driver) {
		String flightId = driver
				.findElement(By.xpath("//*[@id=\"divLoadFltDetails\"]/div/div/div/div[3]/div[3]/div/div[2]/span[2]"))
				.getText();
		System.out.println("flight id = " + flightId);

		String totalFare = driver.findElement(By.xpath("//*[@id=\"spnGrndTotal\"]")).getText();
		System.out.println("Total fare = " + totalFare);

		String departureTime = driver
				.findElement(
						By.xpath("//*[@id=\"divLoadFltDetails\"]/div/div/div/div[3]/div[4]/div[1]/div[1]/span/strong"))
				.getText();
		System.out.println("departure time = " + departureTime);

		String arrivalTime = driver
				.findElement(
						By.xpath("//*[@id=\"divLoadFltDetails\"]/div/div/div/div[3]/div[4]/div[1]/div[1]/span/strong"))
				.getText();
		System.out.println("arrival time = " + arrivalTime);

		sleep(2);
	}

	public void bookFlight(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"ResultDiv\"]/div/div/div[4]/div[2]/div[1]/div[2]/div[6]/button[1]"))
				.click();
		
		sleep(1);
	}

	public WebDriver beforeTest() {
		System.out.println("test started");

		// create driver
		WebDriver driver = new ChromeDriver();
		System.out.println("browser started");

		// open test page
		String url = "https://www.easemytrip.com/";
		driver.get(url);

		// maximize window
		driver.manage().window().maximize();

		System.out.println("page is opened");
		return driver;
	}

	public void fromToDateSearch(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"swap\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ddate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"fst_4_05/09/2024\"]")).click();
		
		sleep(1);

		driver.findElement(By.xpath("//*[@id=\"showOWRT\"]/div/div[8]/button")).click();
		
        sleep(1);
	}

	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
