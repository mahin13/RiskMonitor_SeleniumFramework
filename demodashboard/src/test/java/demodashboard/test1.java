package demodashboard;

import java.util.Random;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 extends BaseClass{
	static Login login = new Login();
	static HomePage homePage = null;
	static Portfolio portfoliopage =null;
public test1() {
	super();
}


@BeforeTest
public static void openBrowser() {
	initApp();
	//navigateToURL("https://dashboard.stellasoftware.com/");
}

@Test
public static void loginToApplication() {
	String homepageText = null;
	login.enterEmail(getProperty("USERNAME"));
	login.enterPassword(getProperty("PASSWORD"));
	homePage = login.clickLogin();
	

}
@Test(dependsOnMethods = "loginToApplication")
public static void openPortfolio() {
	homePage.MenuClick();
	portfoliopage = homePage.MenuPortfolioClick();
	

}

@Test(dependsOnMethods = "openPortfolio")
public static void AAPortfolio() {
	portfoliopage.clickAdd();
	//portfoliopage.selectParentORG("Clarus Risk Limited");
	portfoliopage.drpParentORG();
	portfoliopage.selectParentORG();
	portfoliopage.drpType();
	portfoliopage.selectType();
	Random random = new Random();
	portfoliopage.enterMJHID("TestMJHID"+ random.nextInt());
	portfoliopage.enterName("Testname"+ random.nextInt());

	portfoliopage.drpCountry();
	portfoliopage.selectCountry();
	
	portfoliopage.drpISO();
	portfoliopage.selectISO();
	
	portfoliopage.drpVFrequency();
	portfoliopage.selectVFreq();
	
	portfoliopage.drpAnalyst();
	portfoliopage.selectAnalyst();

	portfoliopage.Add();
}
}
 