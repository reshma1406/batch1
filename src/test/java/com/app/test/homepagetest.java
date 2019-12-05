package com.app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.baseclass;
import com.page.homePageobj;

public class homepagetest {


	homePageobj homePage;
	baseclass bp;

	public homepagetest() {
		homePage = new homePageobj();
		bp = new baseclass();
	}

	@Test
	public void verifywomen() {
		Assert.assertTrue(homePage.getwomentab().isDisplayed());
		homePage.getwomentab().click();
	}
	@Test
    public void verifydresses() {
	Assert.assertTrue(homePage.getdresses().isDisplayed());
	homePage.getdresses().click();
}
	@Test
    public void verifytishirts() {
	Assert.assertTrue(homePage.gettshirts().isDisplayed());
	homePage.gettshirts().click();
	
	}
	@Test
	public void verifywomenopen() {
		Assert.assertTrue(bp.elementFound(homePage.getwomen1()));
		
	}
	@Test
	public void verifysmall() {
		Assert.assertTrue(bp.elementFound(homePage.getsmall()));
	}
	@Test
	public void veifymedium() {
		Assert.assertTrue(bp.elementFound(homePage.getmedium()));
	}
	@Test
	public void verifylarge() {
		Assert.assertTrue(bp.elementFound(homePage.getlarge()));
		
	}
	@Test
	public void verifyproductheadercount() {
    homePage.getdresses1().click();
    Assert.assertTrue(homePage.getproductnumberfromheader()==homePage.getProductCount(),"Failed:count mismatch");
	} 
} 
    
   



