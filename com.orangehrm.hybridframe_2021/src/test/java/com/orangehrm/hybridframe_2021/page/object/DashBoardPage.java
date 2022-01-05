package com.orangehrm.hybridframe_2021.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	
	public DashBoardPage(WebDriver ldriver) {
		this. driver= ldriver;
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(id="welcome")
    @CacheLookup
     WebElement userId;
    
    
    @FindBy(xpath="//a[text()='Logout']")
    @CacheLookup
    WebElement logoutLink;
    
    public void logoutOrangeHRM()  {
        try {
        	userId.click();
            
            Thread.sleep(5000);
           logoutLink.click();
           Thread.sleep(5000);
          
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}  
        

}
    
    
}
