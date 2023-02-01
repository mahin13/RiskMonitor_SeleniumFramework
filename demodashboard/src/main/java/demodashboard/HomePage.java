package demodashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	@FindBy(how=How.CSS,using=".fa.fa-th")
	private static WebElement mnuBtn;
	@FindBy(how=How.CSS,using="a[href='/Portfolios/']")
	private static WebElement portfolioBtn;

public HomePage() {
	System.out.println("Home page Loaded Successfully");
	PageFactory.initElements(driver, this);
	}
public void MenuClick() {
	clickLink(mnuBtn);
}
public Portfolio MenuPortfolioClick() {
	clickLink(portfolioBtn);
	return new Portfolio();
}


	
	
}
