package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllPages {
	
	public WebDriver driver;
	
  By covidcases=By.cssSelector("a[class='nav-link']");
  By countryname=By.xpath("//h4[normalize-space()='India']");
  By downloadc=By.xpath("//a[normalize-space()='Download Certificate']");
  By validate=By.xpath("//h5[normalize-space()='Download Certificate in Whatsapp']");
  By close= By.xpath("//button[normalize-space()='Cancel']");
  By about= By.xpath("//span[@class='navbar-text']");
  By validate2=By.xpath("//h5[normalize-space()='About']");
  By linkclick=By.xpath("//a[normalize-space()='CoWIN API Guidelines']");
  By child=By.xpath("//h1[normalize-space()='404 Page Not Found']");
  By cancel= By.cssSelector("button[class='btn btn-outline-secondary']");
  By homepage = By.xpath("//a[normalize-space()='Vaccine Finder']");
  By state= By.name("selectState");
  By city = By.name("selectedDistrict");
  By noslots= By.xpath("//span[@title='Total Available Slots']");
  By slotcount =By.cssSelector("span[title='Total Available Slots']");
  By reset=By.xpath("//button[@title='Reset Current Search']//*[name()='svg']");
  By reset1= By.xpath("//option[@value='17']");
  By reset2 = By.xpath("//option[@value='301']");
  By reset3 = By.xpath("//div[4]//div[1]//button[1]");
  By reset4 = By.xpath("//div[4]//div[1]//button[1]");
  By reset5 = By.xpath("//div[4]//div[1]//button[1]");
  By reset6 = By.xpath("//div[4]//div[1]//button[1]");
  
  
  
  
  
	public AllPages(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
}
	
	
	public WebElement getReset6()
	{
		return driver.findElement(reset6);
	}
	public WebElement getReset5()
	{
		return driver.findElement(reset5);
	}
	public WebElement getReset4()
	{
		return driver.findElement(reset4);
	}
	public WebElement getReset3()
	{
		return driver.findElement(reset3);
	}
	public WebElement getReset2()
	{
		return driver.findElement(reset2);
	}
	public WebElement getReset1()
	{
		return driver.findElement(reset1);
	}
	public WebElement getReset()
	{
		return driver.findElement(reset);
	}
	public WebElement getSlotCount()
	{
		return driver.findElement(slotcount);
	}
	public WebElement getNoSlots()
	{
		return driver.findElement(noslots);
	}
	public WebElement getCity()
	{
		return driver.findElement(city);
	}
	public WebElement getState()
	{
		return driver.findElement(state);
	}
	public WebElement getHP()
	{
		return driver.findElement(homepage);
	}
	public WebElement getCancel()
	{
		return driver.findElement(cancel);
	}
	public WebElement getChild()
	{
		return driver.findElement(child);
	}
	public WebElement getLinkClick()
	{
		return driver.findElement(linkclick);
	}
	public WebElement getValidate2()
	{
		return driver.findElement(validate2);
	}
	public WebElement getAbout()
	{
		return driver.findElement(about);
	}
	public WebElement getValidate()
	{
		return driver.findElement(validate);
	}
	public WebElement getClose()
	{
		return driver.findElement(close);
	}
	public WebElement getDownloadC()
	{
		return driver.findElement(downloadc);
	}
	public WebElement getCovidCases()
	{
		return driver.findElement(covidcases);
	}
	public WebElement getCountryName()
	{
		return driver.findElement(countryname);
	}
}
