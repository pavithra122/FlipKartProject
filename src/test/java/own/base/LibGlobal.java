package own.base;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void implicitWait(int secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void loadUrl(String data) {
		driver.get(data);
		maximize();
		implicitWait();

	}

	public boolean isDisplayed(WebElement element) {

		return element.isDisplayed();

	}

	public boolean isEnabled(WebElement element) {

		return element.isEnabled();

	}

	public void type(WebElement element, String data) {
		if (isDisplayed(element) && isEnabled(element))
			element.sendKeys(data);

	}

	public void click(WebElement element) {
		if (isDisplayed(element) && isEnabled(element))
			element.click();

	}
	public void clear(WebElement element) {
		element.clear();
	}


	public void closeWindow() {
		driver.close();
	}

	public void closeAllWindows() {
		driver.quit();
	}

	public String getText(WebElement element) {
		return element.getText();

	}

	public String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}

	public String getAttribute(WebElement element, String attributeName) {
		return element.getAttribute(attributeName);
	}

	public void selectOptionByText(WebElement element, String data) {

		new Select(element).selectByVisibleText(data);

	}

	public void selectOptionByIndex(WebElement element, int index) {

		new Select(element).selectByIndex(index);

	}

	public String getPrtWinId() {
		String windowHandle = driver.getWindowHandle();

		return windowHandle;

	}

	public Set<String> getAllWinId() {
		Set<String> windowHandles = driver.getWindowHandles();

		return windowHandles;

	}
}
