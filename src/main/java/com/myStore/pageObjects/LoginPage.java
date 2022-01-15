package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(id = "email")
	WebElement userName;

	@FindBy(id = "passwd")
	WebElement passwordElement;

	@FindBy(name = "SubmitLogin")
	WebElement signInButton;
	
	@FindBy(id = "email_create")
	WebElement emailInputForNewAccount;
	
	@FindBy(id = "SubmitCreate")
	WebElement createNewAccountBtn;
	

	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public HomePage login(String uName,String password) {
		Action.type(userName, uName);
		Action.type(passwordElement, password);
		Action.click(getDriver(), signInButton);
		return new HomePage();
		
	}
	
	public AccountCreationPage createNewAccount(String email) {
		Action.type(emailInputForNewAccount, email);
		Action.click(getDriver(),createNewAccountBtn);
		return new AccountCreationPage();
	}
	
	public AddressPage login1(String uName,String password) {
		Action.type(userName, uName);
		Action.type(passwordElement, password);
		Action.click(getDriver(), signInButton);
		return new AddressPage();
		
	}
	
}
