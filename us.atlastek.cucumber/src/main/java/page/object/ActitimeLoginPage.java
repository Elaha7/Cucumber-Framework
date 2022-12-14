package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.WebDriverUtil;

public class ActitimeLoginPage extends Base{
	
	public ActitimeLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy(xpath = "//td/a[@id='loginButton']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement TasksButton;
	
	@FindBy(xpath = "//div[@id='container_reports']")
	private WebElement ReportsButton;
	
	
	
	public void enterUserName(String uName) {
		WebDriverUtil.enterValue(userName, uName);
	}
	
	public void enterPassword(String pass) {
		WebDriverUtil.enterValue(password, pass);
	}
	
	public void clickonLogin() {
		WebDriverUtil.clickOnElement(loginButton);
		}
	
	public void clickonTasks() {
		WebDriverUtil.clickOnElement(TasksButton);
		}
	
	public void clickonReports() {
		WebDriverUtil.clickOnElement(ReportsButton);
		}

}