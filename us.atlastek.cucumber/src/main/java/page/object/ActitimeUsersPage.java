package page.object;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtil;

public class ActitimeUsersPage extends Base{
	WebDriverUtil ts = new WebDriverUtil();

	public ActitimeUsersPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement ValiduserName;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement Validpassword;

	@FindBy(xpath = "//td/a[@id='loginButton']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//div[@id='container_users']")
	private WebElement UsersButton;
	
	
	@FindBy(xpath = "(//div[@class='tabText'])[2]")
	private WebElement PTObutton;
	
	
	@FindBy(xpath = "(//div[@class='tabText'])[3]") 
	private WebElement SickDaysSettings;
	
	
	@FindBy(xpath = "(//div[@class='tabText'])[4]") 
	private WebElement WrokAssignments;
	
	
	
	
	
	
	public void enterUserName(String uName) {
		WebDriverUtil.enterValue(ValiduserName, uName);
		
	}
	
	public void enterPassword(String pass) {
		WebDriverUtil.enterValue(Validpassword, pass);
		
	}
	
	public void clickonLogin() {
		WebDriverUtil.clickOnElement(LoginButton);
	}
	
	
	public void clickonUsersButton() {
		WebDriverUtil.clickOnElement(UsersButton);
		
		}
	
	public void clickonPTOtab() {
		WebDriverUtil.clickOnElement(PTObutton);
		ts.takeScreenShot();
		}
	
	public void ClickonSickDays() {
		WebDriverUtil.clickOnElement(SickDaysSettings);
		ts.takeScreenShot();
		}

	public void clickonWorkAssignment() {
		WebDriverUtil.clickOnElement(WrokAssignments);
		ts.takeScreenShot();
	}

}
