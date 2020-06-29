package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class zwiftProject_Objects {
	
	WebDriver driver;
	
	public zwiftProject_Objects(WebDriver driver){
		this.driver=driver;
	}
	
	// HOME
	By zwiftHome_text_header = By.xpath("//h1[contains(text(),'TRAIN AT HOME')]"); 	public By zwiftHome_text_header() {return zwiftHome_text_header;}
	By zwiftHome_button_exploreZwift = By.xpath("//button[@label='Explore Zwift']"); 	public By zwiftHome_button_exploreZwift() {return zwiftHome_button_exploreZwift;}
	By zwiftHome_button_createAccount = By.xpath("(//button[@label='Create Account'])[1]"); public By zwiftHome_button_createAccount() {return zwiftHome_button_createAccount;}
	By zwiftHome_button_arrowDown = By.xpath("//div[@class='hero-down-arrow']"); public By zwiftHome_button_arrowDown() {return zwiftHome_button_arrowDown;}
	By zwiftHome_button_events = By.xpath("(//a[contains(text(),'Events')])[1]"); public By zwiftHome_button_events() {return zwiftHome_button_events;}
	By zwiftHome_button_consentAccept = By.xpath("//button[contains(text(),'Accept')]"); public By zwiftHome_button_consentAccept() {return zwiftHome_button_consentAccept;}
	
	// EVENTS
	By zwiftEvents_dropDownMenu_allSports = By.xpath("//option[contains(text(),'All Sports')]"); public By zwiftEvents_dropDownMenu_allSports() {return zwiftEvents_dropDownMenu_allSports;}
	By zwiftEvents_dropDownMenu_allIntensities = By.xpath("//option[contains(text(),'All Intensities')]"); public By zwiftEvents_dropDownMenu_allIntensities() {return zwiftEvents_dropDownMenu_allIntensities;}
	By zwiftEvents_dropDownMenu_allStartTimes = By.xpath("//option[contains(text(),'All Start Times')]"); public By zwiftEvents_dropDownMenu_allStartTimes() {return zwiftEvents_dropDownMenu_allStartTimes;}
	By zwiftEvents_text_header = By.xpath("//h1[contains(text(),'EVENTS')]"); public By zwiftEvents_text_header() {return zwiftEvents_text_header;}
	By zwiftEvents_dropDown_running = By.xpath("//option[contains(text(),'Running')]"); public By zwiftEvents_dropDown_running() {return zwiftEvents_dropDown_running;}
	By zwiftEvents_dropDown_D = By.xpath("//option[contains(text(),'D')]"); public By zwiftEvents_dropDown_D() {return zwiftEvents_dropDown_D;}
	By zwiftEvents_dropDown_evening = By.xpath("//option[@value='evening']"); public By zwiftEvents_dropDown_evening() {return zwiftEvents_dropDown_evening;}
	By zwiftEvents_dropDown_afternoon = By.xpath("//option[@value='afternoon']"); public By zwiftEvents_dropDown_afternoon() {return zwiftEvents_dropDown_afternoon;}
	By zwiftEvents_text_sports = By.xpath("//span[@class='map-sport']"); public By zwiftEvents_text_sports() {return zwiftEvents_text_sports;}
	By zwiftEvents_text_noEvents = By.xpath("//div[contains(text(),'Event series completed.')]"); public By zwiftEvents_text_noEvents() {return zwiftEvents_text_noEvents;}
	By zwiftEvents_text_eventListing = By.xpath("//div[@class='tab-listing']"); public By zwiftEvents_text_eventListing() {return zwiftEvents_text_eventListing;}
	
	
	
	
	
	
	
	
}
