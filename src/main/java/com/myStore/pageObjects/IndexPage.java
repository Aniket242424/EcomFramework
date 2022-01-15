package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class IndexPage extends BaseClass{
	@FindBy(css = ".login")
	WebElement signInButton;

	@FindBy(css = ".logo.img-responsive")
	WebElement myStoreLogo;

	@FindBy(id = "search_query_top")
	WebElement searchBox;
	
	@FindBy(name = "submit_search")
	WebElement searchButton;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public LoginPage clickOnSignIn() {
		Action.fluentWait(getDriver(),signInButton,10);
		Action.click(getDriver(),signInButton);
		return new LoginPage();
	}
	
	public boolean validateLogo() {
		return Action.isDisplayed(getDriver(),myStoreLogo);
	}
	
	public String getMyStoreTitle() {
		return getDriver().getTitle();
	}
	
	public SearchResultPage searchProduct(String productName) {
		Action.type(searchBox,productName);
		Action.click(getDriver(), searchButton);
		return new SearchResultPage(); 
	}
	
	
}
