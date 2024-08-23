package com.testing.mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {

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

		driver.findElement(By.xpath("//*[@id=\"swap\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"ddate\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"fst_4_05/09/2024\"]")).click();

		sleep(1);

		driver.findElement(By.xpath("//*[@id=\"showOWRT\"]/div/div[8]/button")).click();

		sleep(1);

		driver.findElement(By.xpath("//*[@id=\"ResultDiv\"]/div/div/div[4]/div[2]/div[1]/div[1]/div[6]/button[1]"))
				.click();

		sleep(1);

		String flightId = driver
				.findElement(By.xpath("//*[@id=\"divLoadFltDetails\"]/div/div/div/div[2]/div[3]/div/div[2]/span[2]"))
				.getText();
		System.out.println("flight id = " + flightId);

		String totalFare = driver.findElement(By.xpath("//*[@id=\"spnGrndTotal\"]")).getText();
		System.out.println("Total fare = " + totalFare);

		String departureTime = driver
				.findElement(
						By.xpath("//*[@id=\"divLoadFltDetails\"]/div/div/div/div[2]/div[4]/div[1]/div[1]/span/strong"))
				.getText();
		System.out.println("departure time = " + departureTime);

		String arrivalTime = driver
				.findElement(
						By.xpath("//*[@id=\"divLoadFltDetails\"]/div/div/div/div[2]/div[4]/div[3]/div[1]/span/strong"))
				.getText();
		System.out.println("arrival time = " + arrivalTime);

		sleep(2);

		driver.findElement(By.xpath("//*[@id=\"divContinueReview2\"]/span")).click();

		sleep(2);

		driver.findElement(By.xpath("//*[@id=\"divInsuranceTab\"]/div[3]/div[1]/label/span")).click();

		sleep(2);

		driver.findElement(By.xpath("//*[@id=\"txtEmailId\"]")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"spnVerifyEmail\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"titleAdult0\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"titleAdult0\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"txtFNAdult0\"]")).sendKeys("Aayush");
		
		driver.findElement(By.xpath("//*[@id=\"txtLNAdult0\"]")).sendKeys("Sharma");
		
		driver.findElement(By.xpath("//*[@id=\"txtCPhone\"]")).sendKeys("9865321478");
		
		sleep(2);
		
		driver.findElement(By.xpath("//*[@id=\"spnTransaction\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"seatPo_0\"]/div[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"DivContinueAncillary\"]/span")).click();
		
		String GrandTotal = driver.findElement(By.xpath("//*[@id=\"spnGrndTotal\"]")).getText();
		System.out.println("Grand Total = " + GrandTotal);
		
		sleep(2);

		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// close the window
		driver.quit();

		System.out.println("Finished");

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
