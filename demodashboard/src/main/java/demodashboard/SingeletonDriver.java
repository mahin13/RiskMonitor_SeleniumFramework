package demodashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingeletonDriver {
private static WebDriver driver;
private SingeletonDriver() {}
public static WebDriver getSingletonInstatnce() {
	if(null==driver) {
		System.setProperty("webdriver.chrome.driver",".//src//main//resources/chromedriver.exe");
		driver = new ChromeDriver();
	}
	return driver;
}
}
