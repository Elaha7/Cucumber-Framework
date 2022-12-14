package step.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.ActitimeLoginPage;
import page.object.ActitimeTasksPage;
import page.object.ActitimeUsersPage;


public class ActitimeStepDef {
	
	
	ActitimeLoginPage acti = new ActitimeLoginPage();
	ActitimeTasksPage act = new ActitimeTasksPage();
	ActitimeUsersPage ac = new ActitimeUsersPage();
	
	
	  @Given("User should be able to open actiTIME web") public void
	  user_should_be_able_to_open_acti_time_web() {
	  
	  }
	  
	  @When("User enter username") public void user_enter_username() {
	  acti.enterUserName("admin"); }
	  
	  @And("User enter password") public void user_enter_password() {
	  acti.enterPassword("manager"); }
	  
	  @Then("User click on Login button") public void User_click_on_Login_button(){ 
	  acti.clickonLogin(); }
	  
	  
	  @When("User click on Tasks tab") public void user_click_on_tasks_tab() {
	  acti.clickonTasks(); }
	  
	  @Then("User click on Reports tab") public void user_click_on_reports_tab() {
	  acti.clickonReports(); }
	 
	  
	  
	  
	
	// Tasks Tab steps
	
	
	 
	  @Given("User should be able to navigate to Actitime URL")
	  public void user_should_be_able_to_navigate_to_actitime_url() {
	     
	  }
	  @When("User enters valid user")
	  public void user_enters_valid_user() {
	      act.enterUserName("admin");
	  }
	  @When("User enters valid password")
	  public void user_enters_valid_password() {
	     act.enterPassword("manager");
	  }
	  @Then("User clicks login button")
	  public void user_clicks_login_button() {
	     act.clickonLogin(); 
	  }
	  @Then("User see the home page for Actitime system")
	  public void user_see_the_home_page_for_actitime_system() {
	      act.getActitimeTitle();
	  }
	  @Then("User should click on “Tasks” tab")
	  public void user_should_click_on_tasks_tab() {
	      act.clickonTasks();
	  }
	  @Then("User must click on “+ Add Task” button")
	  public void user_must_click_on_add_task_button() {
		  act.clickOnFlightOperation();
	      act.clickonFirstAddTask();
	  }  
		 
	  
	  @Then("User enter Actitime System Testing on the “Enter Task Name” field")
	  public void user_enter_actitime_system_testing_on_the_enter_task_name_field() {
	      act.EnterTaskName();
	  }
	  @Then("User click on “+ Add Task” button")
	  public void user_click_on_add_task_button() {
	      act.clickonSecondAddTask();
            
	  }
	  @Then("User should see the newly added task on the “Fight operations” page")
	  public void user_should_see_the_newly_added_task_on_the_fight_operations_page() {
	     act.operationsPageScreenShot();
	  }

	  
	
	
	
	
	//Users Tab steps
	
	@Given("User should be able to login to Actitime URL.")
	public void user_should_be_able_to_login_to_actitime_url() {
	        
	}
	@When("User should enter valid user")
	public void user_should_enter_valid_user() {
	   ac.enterUserName("admin");
	}
	@When("User should enter valid password")
	public void user_should_enter_valid_password() {
	    ac.enterPassword("manager");
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
	    ac.clickonLogin();
	}
	@When("User click on Users tab")
	public void user_click_on_users_tab() {
	    ac.clickonUsersButton();
	}
	@When("User click on “PTO Settings” PTO details should be displayed.")
	public void user_click_on_pto_settings_pto_details_should_be_displayed() {
	    ac.clickonPTOtab();
	}
	@When("User click on “Sick Days Settings” sick days details should be displayed.")
	public void user_click_on_sick_days_settings_sick_days_details_should_be_displayed() {
	   ac.ClickonSickDays(); 
	}
	@When("User click on “Work Assignments” the “My Team \\(All Users)” details should be displayed.")
	public void user_click_on_work_assignments_the_my_team_all_users_details_should_be_displayed() {
	   ac.clickonWorkAssignment();
	}
	
	
	
	
	
	
	
	
}