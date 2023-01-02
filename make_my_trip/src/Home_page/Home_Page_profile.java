package Home_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_profile {
	public void LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
     
	@FindBy(xpath="//input[@id='search']") 
	private WebElement search;

	public WebElement getSearch() {

		return null;
	} 
	@FindBy(xpath="//button[@id='wzrk-cancel']")
	private WebElement popupbutton;

	public WebElement getPopupbutton() {
		return popupbutton;
	}
	

}
