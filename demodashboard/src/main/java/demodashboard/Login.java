package demodashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
@FindBy(how=How.XPATH, using="//*[@id='Email']")
private static WebElement txtEmail;
@FindBy(how=How.XPATH, using="//*[@id='Password']")
private static WebElement txtPasssword;
@FindBy(how=How.CSS, using=".btn.btn-primary")
private static WebElement btnLogin;

public Login() {
	PageFactory.initElements(driver, this);
}
public void enterEmail(String Email) {
	enterText(txtEmail,Email);
}
public void enterPassword(String password) {
	enterText(txtPasssword,password);
}
public HomePage clickLogin() {
	clickButton(btnLogin);
	return new HomePage();
}
}
