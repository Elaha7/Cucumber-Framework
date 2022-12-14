package page.object;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtil;

public class ActitimeTasksPage extends Base{

	public ActitimeTasksPage() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement UserName;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement Password;

	@FindBy(xpath = "//td/a[@id='loginButton']")
	private WebElement Loginbutton;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement TasksButton;
	
	
	@FindBy(xpath = "(//div[text()='Flight operations'])[1]")
	private WebElement FlightOperation;
	
	
	@FindBy(xpath = "(//div[text()='Add Task'])[1]")
	private WebElement AddFirstTaskButton;
	
	
	@FindBy(xpath = "(//input[@placeholder='Enter Task Name'])[2]")    //Actitime System Testing
	private WebElement EnterTaskName;
	
	
	@FindBy(xpath = "(//div[text()='Add Task'])[3]")
	private WebElement AddSecondTaskButton;
	
	
	
	
	
	
	
	
	public void enterUserName(String uName) {
		WebDriverUtil.enterValue(UserName, uName);
		
	}
	
	public void enterPassword(String pass) {
		WebDriverUtil.enterValue(Password, pass);
		
	}
	
	public void clickonLogin() {
		WebDriverUtil.clickOnElement(Loginbutton);
	}
	
	public void getActitimeTitle () {
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		WebDriverUtil.takeScreenShot();
		
		}
	
	public void clickonTasks() {
		WebDriverUtil.clickOnElement(TasksButton);
		}
	
		
	 public void clickOnFlightOperation() {
		  WebDriverUtil.clickOnElement(FlightOperation); 
	 } 
		
		  public void clickonFirstAddTask() {
		  WebDriverUtil.clickOnElement(AddFirstTaskButton); 
		  WebDriverUtil.takeScreenShot(); }
		  
		  
		  public void EnterTaskName() {
		  EnterTaskName.sendKeys("Actitime System Testing"); 
		  WebDriverUtil.takeScreenShot(); 
		  }
		  
		  public void clickonSecondAddTask() {
		  WebDriverUtil.clickOnElement(AddSecondTaskButton); 
		  WebDriverUtil.takeScreenShot(); }
		 
		 

	      public void operationsPageScreenShot() {
	      WebDriverUtil.takeScreenShot();
		
	}

		


}