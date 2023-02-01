package demodashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Portfolio extends BaseClass{
	@FindBy(how=How.CSS,using="a[href='/Portfolios/Create']")
	private static WebElement addportfolioBtn;
	@FindBy(how=How.CSS,using=".k-input-value-text.k-readonly")
	private static WebElement drpParentOrganisation;
	@FindBy(how=How.CSS,using="body > div:nth-child(43) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(1) > span:nth-child(2) > span:nth-child(1)")
	private static WebElement selectParentOrganisation;
	@FindBy(how=How.XPATH,using="(//span[contains(text(),'Select Portfolio Type')])[1]")
	private static WebElement drpType;
	@FindBy(how=How.XPATH,using="(//li[@role='option'])[193]")
	private static WebElement selectType;
	@FindBy(how=How.ID,using="ClarusAccountId")
	private static WebElement txtMJHID;
	@FindBy(how=How.ID,using="PortfolioName")
	private static WebElement txtName;
	@FindBy(how=How.XPATH,using="//span[@class='k-input-value-text'][normalize-space()='Please Select']")
	private static WebElement drpCountryClass;
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Belarus']")
	private static WebElement selectCountry;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Select AIFM Currency...')]")
	private static WebElement drpCurrencyISO;
	@FindBy(how=How.XPATH,using="//span[normalize-space()='AED']")
	private static WebElement selectISO;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Select Valuation Freq')]")
	private static WebElement drpfrq;
	@FindBy(how=How.XPATH,using="(//span[normalize-space()='Intraday'])[1]")
	private static WebElement selectfrq;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Select Analyst')]")
	private static WebElement drpanalyst;
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Muhammad Nabi']")
	private static WebElement selectanalyst;
	@FindBy(how=How.CSS,using="span[id='f9459623-d7b0-4111-a129-3f8298fc3a18'] span[class='k-input-value-text']")
	private static WebElement drpAnalyst;
	@FindBy(how=How.ID,using="submitBtn")
	private static WebElement Add;
	
	public Portfolio() {
		System.out.println("Portfolio page Loaded Successfully");
		PageFactory.initElements(driver, this);
	}
	public void clickAdd() {
		clickButton(addportfolioBtn);
	}
	
	
	public void drpParentORG() {
		clickButton(drpParentOrganisation);
	}
	public void selectParentORG() {
		clickButton(selectParentOrganisation);
	}
	public void drpType() {
		clickButton(drpType);
	}
	public void selectType() {
		clickButton(selectType);
	}
	
	
	public void enterMJHID(String mjhText) {
		enterText(txtMJHID,mjhText);
	}
	public void enterName(String nameText) {
		enterText(txtName,nameText);
	}
	
	public void drpCountry() {
		clickButton(drpCountryClass);
	}
	public void selectCountry() {
		clickButton(selectCountry);
	}
	
	public void drpISO() {
		clickButton(drpCurrencyISO);
	}
	public void selectISO() {
		clickButton(selectISO);
	}
	
	public void drpVFrequency() {
		clickButton(drpfrq);
	}
	public void selectVFreq() {
		clickButton(selectfrq);
	}
	
	public void drpAnalyst() {
		clickButton(drpanalyst);
	}
	public void selectAnalyst() {
		clickButton(selectanalyst);
	}
	
	
	public void Add() {
		clickButton(Add);
	}
}
