package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}

/*

This class serves as a base for other page objects that can inherit it and benefit from its functionality.
 The main role of this class is to initialize the elements of a page using PageFactory.initElements(driver, this)
  and to hold the WebDriver instance for interaction with the web page.


Understanding the Flow

Constructor Call:
When an instance of BasePage (or any class that extends BasePage) is created, the BasePage(WebDriver driver) constructor is called.
For example, in LoginPage loginPage = new LoginPage(driver);, the driver (which is a WebDriver object) is passed to the constructor.
Assign WebDriver to Instance Field:

Inside the constructor, this.driver = driver; assigns the passed driver to the driver instance variable of the BasePage object.
Now, the BasePage object (and any subclass) has access to the WebDriver instance via this.driver.
Initialize WebElements with PageFactory.initElements():

PageFactory.initElements(driver, this); is then called, where:
driver: The WebDriver instance passed to the constructor is used to locate elements on the page.
this: Refers to the current object (i.e., LoginPage or BasePage) whose fields will be initialized by PageFactory.

PageFactory.initElements(driver, this) does the following:
Scans the fields of the current object (this), looking for fields annotated with @FindBy (like usernameField, passwordField, etc.).
For each annotated field, it creates a By locator (e.g., By.id("username")) and uses the driver to find the corresponding element on the page.
If the element is found, it assigns it to the corresponding field of the current object (this).

*/