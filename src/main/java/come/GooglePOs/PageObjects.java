package come.GooglePOs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class PageObjects extends initializeBrowser{
	
	
	@FindBy(xpath="//input[@id='lst-ib']") WebElement textBox;
	@FindBy(xpath="//*[@id=\'gsr\']") WebElement searchButton;
	@FindBy(xpath="//input[@type='submit']") WebElement searchButton2;
	@FindBy(xpath="//input[@value='Google Search']") WebElement searchButton3;
	
	//constructor 
public PageObjects() {
	//it helps implement the webelements created
	//have another class if we used the @By annotation 
	PageFactory.initElements(driver, this);
}

public void searchtextBox() {
//	textBox.sendKeys("selenium automation testing jobs");
	textBox.sendKeys(properties.getProperty("search_topic"));
}

public void click() {
//	searchButton.click();
//	searchButton2.click();
	searchButton3.click();

}


}
