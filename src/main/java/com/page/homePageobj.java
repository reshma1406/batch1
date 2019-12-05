package com.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class homePageobj extends baseclass {

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirts;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women1;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dresses1;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirts1;
	
    @FindBy(xpath="//*[@id=\"category\"]")
    private WebElement small1;
    
    @FindBy(xpath="")
	private WebElement medium1;
    
    @FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a/span")
    private WebElement large1;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement txtheader;
    
    @FindBys(@FindBy(xpath="//*[@id=\"center_column\"]/ul/li" ))
    private List<WebElement>lstproducts;
    
	public homePageobj() {
		PageFactory.initElements( driver,this);
	}
	
	public  WebElement getwomentab() {
	return women;
	}
	
	public WebElement getdresses() {
		return dresses;
	}
    public WebElement gettshirts() {
	return tshirts;
}
    public WebElement getwomen1() {
    return women1;
    }
    public WebElement getdresses1() {
    	return dresses1;
    }
    public WebElement gettishirts1() {
    	return tshirts1;
    }
public WebElement getsmall() {
	return small1;
	}
public WebElement getmedium() {
	return medium1;
}
public WebElement getlarge() {
	return large1;
}
public int getproductnumberfromheader() {
	 String txt=txtheader.getText();
	 String[] arr=txt.split(" ");
	 String value=arr[2];
	 int number=Integer.parseInt(value);
	 return number;
 }
public int getProductCount() {
	return lstproducts.size();
}
}

