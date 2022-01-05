package com.orangehrm.hybridframe_2021.testcases;



import org.testng.annotations.Test;


import com.orangehrm.hybridframe_2021.page.object.LoginPage;
import com.orangehrm.hybridframe_2021.testbase.TestBase;


public class LogintestTC01 extends TestBase {
	@Test
    public void loginToOrangeHrm() throws InterruptedException    {
	
	LoginPage lp = new LoginPage(driver);
	          lp.setUsername("Admin");
              lp.setPassword("admin123");
              lp.loginbutton();
    
        Thread.sleep(5000);
		String hp = driver.getTitle();
		Thread.sleep(5000);
		System.out.println(hp);
		
	}	

}
