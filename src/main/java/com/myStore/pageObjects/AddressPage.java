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
 * @author Aniket
 *
 */
public class AddressPage extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement proceedToCheckOut;

	public AddressPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public ShippingPage clickOnCheckOut() throws Throwable {
		action.click(getDriver(), proceedToCheckOut);
		return new ShippingPage();
	}
}
