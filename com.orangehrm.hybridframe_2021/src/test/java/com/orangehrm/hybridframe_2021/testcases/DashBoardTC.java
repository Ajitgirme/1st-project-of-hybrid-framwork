package com.orangehrm.hybridframe_2021.testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.hybridframe_2021.page.object.DashBoardPage;
import com.orangehrm.hybridframe_2021.page.object.LoginPage;
import com.orangehrm.hybridframe_2021.testbase.TestBase;

public class DashBoardTC  extends TestBase{
	
	@Test
	 public void logoutOrangeHRMTestTC01() {
	   LoginPage lp = new LoginPage(driver);
		
       lp.setUsername("Admin");
       lp.setPassword("admin123");
        DashBoardPage hp = lp.loginbutton();
    
    //  driver.findElement(By.xpath("//a[@id='welcome']"));
      
      if (driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).isDisplayed()) {
		 Assert.assertTrue(true);
	
         hp.logoutOrangeHRM();
	  }
      
         else 
      {
		 Assert.assertTrue(false,"Dashborad page title not contains Orange text");
	  }  
      
	 }     


}
