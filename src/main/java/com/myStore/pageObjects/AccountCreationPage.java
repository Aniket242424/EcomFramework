package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class AccountCreationPage extends BaseClass{
	@FindBy(xpath = "//h3[text()='Create an account']")
	WebElement formTitle;

	public AccountCreationPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateAccountCreatePage() {
		return Action.isDisplayed(getDriver(), formTitle);
	}
}
