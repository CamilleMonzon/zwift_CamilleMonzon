package TestCases;

import org.testng.annotations.Test;
import Object_Repository.zwiftProject_Objects;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class zwiftProject {
	public static WebDriver driver;
	public WebDriverWait wait;
	zwiftProject_Objects zap = new zwiftProject_Objects(driver);



  @BeforeMethod
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\camon\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  wait = new WebDriverWait(driver,10);
	  
  }

  @Test(priority=1)
  public void zwift_homePage_load() throws InterruptedException {
	  driver.get("https://www.zwift.com");
	  
	  if (ExpectedConditions.visibilityOfElementLocated(zap.zwiftHome_button_consentAccept()) != null){
		  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftHome_button_consentAccept())).click();  
	  } else {};
	  wait.until(ExpectedConditions.visibilityOfElementLocated(zap.zwiftHome_text_header()));
	  
	  String header = wait.until(ExpectedConditions.visibilityOfElementLocated(zap.zwiftHome_text_header())).getText();
	  Assert.assertEquals(header, "TRAIN AT HOME");
	  
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftHome_button_exploreZwift()));
	  
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftHome_button_createAccount()));
	  
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftHome_button_arrowDown())).click();
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.zwift.com/" );
  }
  @Test(priority=2)
  public void zwift_eventsPage_load() throws InterruptedException {
	  driver.get("https://www.zwift.com");
	  
	  if (ExpectedConditions.visibilityOfElementLocated(zap.zwiftHome_button_consentAccept()) != null){
		  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftHome_button_consentAccept())).click();  
	  } else {};
	  
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftHome_button_events())).click();
	  
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "https://www.zwift.com/events" );
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(zap.zwiftEvents_text_header()));
	  
	  String eventsHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(zap.zwiftEvents_text_header())).getText();
	  Assert.assertEquals(eventsHeader, "EVENTS");
	  
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftEvents_dropDownMenu_allSports())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftEvents_dropDown_running())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftEvents_dropDownMenu_allIntensities())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftEvents_dropDown_D())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftEvents_dropDownMenu_allStartTimes())).click();
	  wait.until(ExpectedConditions.elementToBeClickable(zap.zwiftEvents_dropDown_evening())).click();

	  Thread.sleep(1000);

      if (wait.until(ExpectedConditions.visibilityOfElementLocated(zap.zwiftEvents_text_sports())).getText().equals("Sport:")) {
		  String eventText1 = wait.until(ExpectedConditions.visibilityOfElementLocated(zap.zwiftEvents_text_sports())).getText();
		  Assert.assertEquals(eventText1, "Sport:");
		  
	  } else {
		  String eventText1 = wait.until(ExpectedConditions.visibilityOfElementLocated(zap.zwiftEvents_text_noEvents())).getText();
		  Assert.assertEquals(eventText1, "Event series completed.");
	  }
  }
  
  

  @AfterMethod
  public void tearDown() {
		driver.quit();
  }

}




