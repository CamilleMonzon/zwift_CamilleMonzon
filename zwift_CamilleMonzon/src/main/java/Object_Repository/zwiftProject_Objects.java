package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class zwiftProject_Objects {
	
	WebDriver driver;
	
	public zwiftProject_Objects(WebDriver driver){
		this.driver=driver;
	}
	
	// HOME
	By zwiftHome_text_header = By.xpath("(//div/h1)[2]"); 	public By zwiftHome_text_header() {return zwiftHome_text_header;}
	By zwiftHome_text_subHead1 = By.xpath("(//div/p)[1]");	public By zwiftHome_text_subHead1() {return zwiftHome_text_subHead1;}
	By zwiftHome_text_subHead2 = By.xpath("(//div/p)[2]");	public By zwiftHome_text_subHead2() {return zwiftHome_text_subHead2;}
	By zwiftHome_button_exploreZwift = By.xpath("//div/a/button[@label='Explore Zwift']"); 	public By zwiftHome_button_exploreZwift() {return zwiftHome_button_exploreZwift;}
	By zwiftHome_button_createAccount = By.xpath("(//div/a/button[@label='Create Account'])[1]"); public By zwiftHome_button_createAccount() {return zwiftHome_button_createAccount;}
	By zwiftHome_button_arrowDown = By.xpath("//a/div[@class='hero-down-arrow']"); public By zwiftHome_button_arrowDown() {return zwiftHome_button_arrowDown;}
	By zwiftHome_button_menu = By.xpath("//div[@class='znv-auth-hide-js znv-link-black znv-ghost-link-white znv-d-block']"); public By zwiftHome_button_menu() {return zwiftHome_button_menu;}
	By zwiftHome_button_events = By.xpath("(//a[@href='/events'])[1]"); public By zwiftHome_button_events() {return zwiftHome_button_events;}
	By zwiftHome_button_consentAccept = By.xpath("//div/button[@id='truste-consent-button']"); public By zwiftHome_button_consentAccept() {return zwiftHome_button_consentAccept;}
	
	// EVENTS
	By zwiftEvents_dropDownMenu_allSports = By.xpath("(//div/select[@id='filter-location'])[1]"); public By zwiftEvents_dropDownMenu_allSports() {return zwiftEvents_dropDownMenu_allSports;}
	By zwiftEvents_dropDownMenu_allIntensities = By.xpath("(//div/select[@id='filter-location'])[2]"); public By zwiftEvents_dropDownMenu_allIntensities() {return zwiftEvents_dropDownMenu_allIntensities;}
	By zwiftEvents_dropDownMenu_allStartTimes = By.xpath("(//div/select[@id='filter-location'])[3]"); public By zwiftEvents_dropDownMenu_allStartTimes() {return zwiftEvents_dropDownMenu_allStartTimes;}
	By zwiftEvents_text_header = By.xpath("//div/header[@class='events-header']"); public By zwiftEvents_text_header() {return zwiftEvents_text_header;}
	By zwiftEvents_dropDown_running = By.xpath("//div/select/option[@value='RUNNING']"); public By zwiftEvents_dropDown_running() {return zwiftEvents_dropDown_running;}
	By zwiftEvents_dropDown_D = By.xpath("//div/select/option[@value='4']"); public By zwiftEvents_dropDown_D() {return zwiftEvents_dropDown_D;}
	By zwiftEvents_dropDown_evening = By.xpath("//div/select/option[@value='evening']"); public By zwiftEvents_dropDown_evening() {return zwiftEvents_dropDown_evening;}
	By zwiftEvents_dropDown_afternoon = By.xpath("//div/select/option[@value='afternoon']"); public By zwiftEvents_dropDown_afternoon() {return zwiftEvents_dropDown_afternoon;}
	By zwiftEvents_text_sports = By.xpath("//div/span[@class='map-sport']"); public By zwiftEvents_text_sports() {return zwiftEvents_text_sports;}
	By zwiftEvents_text_noEvents = By.xpath("//div[@class='header-title']"); public By zwiftEvents_text_noEvents() {return zwiftEvents_text_noEvents;}
	By zwiftEvents_text_eventListing = By.xpath("//div[@class='tab-listing']"); public By zwiftEvents_text_eventListing() {return zwiftEvents_text_eventListing;}
	
	
	
	
	
	
	
	
}