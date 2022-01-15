/**
 * 
 */
package com.myStore.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.actionDriver.Action;
import com.myStore.base.BaseClass;

/**
 * @author admin
 *
 */
public class OrderSummary extends BaseClass{
	Action action = new Action();

	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	private WebElement confirmOrderBtn;

	public OrderSummary() {
		PageFactory.initElements(getDriver(), this);
	}

	public OrderConfirmationPage clickOnconfirmOrderBtn() throws Throwable {
		action.click(getDriver(), confirmOrderBtn);
		return new OrderConfirmationPage();
	}
}
