package SeleniumAutomation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class bbaseFunctionTest {

	public static void main(String[] args) throws InterruptedException {

		// Call driver from aBaseFunctionAutomation
		WebDriver driver = aBaseFunction.getDriver();

		// navigating to Goggle.com page
		// driver.get("http://google.com");
		// driver.manage().window().maximize();

		// Go to Automationpractice.com
		// driver.get("http://automationpractice.com");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// Implicit Wait --Implicit waits are used to provide a default waiting time
		// (say 30 seconds) between each
		// consecutive test step/command across the entire test script. Thus, subsequent
		// test step would only execute when the 30
		// seconds have elapsed after executing the previous test step/command.
		// Explicit Wait --Explicit waits are used to halt the execution till the time a
		// particular condition is met or the maximum
		// time has elapsed. Unlike Implicit waits, explicit waits are applied for a
		// particular instance only.
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().timeouts().explicitWait(20, TimeUnit.SECONDS);

		// click sign in button link
		// find sing in element
		WebElement element = driver.findElement(By.className("login")); // <<create variable with element and save it as
																		// element

		// click on found element
		element.click();

		// enter "test@timeandtraining.net" in email address text field.
		// find email text field where email id writing
		element = driver.findElement(By.id("email"));

		// type email id in to email value
		element.sendKeys("test@timeandtraining.net");

		// enter Password
		// find Password text field where Password can be write and send
		driver.findElement(By.id("passwd")).sendKeys("test123456"); // why not saying
																	// element=driver.findElement(By.id("passwd") as we
																	// did for above email field

		// click sign button
		driver.findElement(By.id("SubmitLogin")).click();

		WebElement page_header = driver.findElement(By.className("page-heading"));

		String header_text = page_header.getText(); // <<this save with variable and give us read text from page

		// now verifying the text as in the screen displayed to make sure test cases
		// passed or fail.
		// if (header_text.equals("MY ACCOUNT")) {

		if (header_text.equals("My accounts")) { // ((<<This is to test whether program
			// can failed the test cases or not as given wrong name: "My Accounts"

			System.out.println("Login test is passeed");

		} else {

			System.out.println("Login test is failed");

		}

		WebElement signout_button = driver.findElement(By.className("logout"));
		driver.findElement(By.className("logout")).click();
		String signout_button_text = signout_button.getText();// <this save with variable and give us read text from
																// page

		System.out.println(signout_button_text);
		System.out.println(header_text);

		// Browser closed
		driver.quit();
	}

}



