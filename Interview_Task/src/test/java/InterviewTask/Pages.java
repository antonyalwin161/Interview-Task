package InterviewTask;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.AllPages;
import resources.base;
import org.testng.annotations.BeforeTest;

public class Pages extends base{
	
	@BeforeTest
	public void beforeall() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	public void covidcasepage() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		AllPages ap=new AllPages(driver);
	//Testcase to click on Covid cases page after page is loaded.
		ap.getCovidCases().click();	
		Assert.assertEquals(ap.getCountryName().getText(), "India");// To verify header text is India
		Thread.sleep(3000);
	}	
	
	@Test (priority=2)
	public void downloadcertificate() throws IOException, InterruptedException
	{
	//Testcase to click on Download Certificate and validate the popup and close the popup.
		AllPages ap=new AllPages(driver);
		ap.getDownloadC().click();
		Thread.sleep(3000);
		Assert.assertEquals(ap.getValidate().getText(), "Download Certificate in Whatsapp");
		ap.getClose().click();
	}
	
	@Test (priority=3)
	public void about() throws IOException, InterruptedException
	{
	//Test Case to click on About and validate the popup and also clicking on the links and validate the new tab page and close the popup.
		AllPages ap=new AllPages(driver);
		ap.getAbout().click();
		Thread.sleep(3000);
		Assert.assertEquals(ap.getValidate2().getText(), "About");
		ap.getLinkClick().click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentID= it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Assert.assertEquals(ap.getChild().getText(), "404 Page Not Found");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentID);
		ap.getCancel().click();
		Thread.sleep(2000);
	}
	
	@Test (priority=4)
	
	public void selectclass() throws IOException, InterruptedException
	{
	//TeAllPages ap=new AllPages(driver);st case to select State and City from drop down menu and check slots available and print down the count if not message must be shown
		AllPages ap=new AllPages(driver);
		ap.getHP().click();
		Select drpState = new Select(ap.getState());
		drpState.selectByVisibleText("Maharashtra");
		Select drpCity = new Select(ap.getCity());
		drpCity.selectByVisibleText("Mumbai");
		
		String slots = ap.getNoSlots().getText();
		if (slots.equals(slots))
		{
			System.out.println(ap.getSlotCount().getText());
		}
		else
		{
			System.out.println("No Centers Found");
			
		}
		
	}
	
	@Test (priority=5)
	public void reset() throws IOException, InterruptedException
	{
	//Test case to check reset button is working or not
		AllPages ap=new AllPages(driver);
		ap.getReset().click();
		Assert.assertEquals(ap.getReset1().getText(), "Kerala");
		Assert.assertEquals(ap.getReset2().getText(), "Alappuzha");
		Assert.assertEquals(ap.getReset3().getText(), "All");
		Assert.assertEquals(ap.getReset4().getText(), "All");
		Assert.assertEquals(ap.getReset5().getText(), "All");
		Assert.assertEquals(ap.getReset6().getText(), "All");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}


