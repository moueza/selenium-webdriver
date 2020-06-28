package com.mycompany.app;

//Import the necessary modules for development
//import time
//import unit test
//from selenium import web driver
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

/**
 * Hello world!
 *
 KO path of webdriver*/
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		/**
		 * https://www.lambdatest.com/blog/selenium-webdriver-tutorial-for-cross-browser-testing/
		 */
// Invoke a new Chrome Instance
//ff_driver = webdriver.Chrome()

// Blocking wait of 30 seconds in order to locate the element
//ff_driver.implicitly_wait(30)
//TODO
		// ff_driver.maximize_window()

// Open the required page
//ff_driver.get("http://www.lambdatest.com")

// Sleep for 10 seconds in order to see the results
//time.sleep(10)

// Close the Browser instance
//ff_driver.close()

		/** https://www.selenium.dev/documentation/en/ */
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, 1);

		try {
			driver.get("https://google.com/ncr");
			driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
			WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
			System.out.println(firstResult.getAttribute("textContent"));
		} finally {
			driver.quit();
		}
	}
}
