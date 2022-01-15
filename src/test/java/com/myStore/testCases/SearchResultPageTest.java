package com.myStore.testCases;

import org.apache.poi.hssf.dev.ReSave;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.myStore.base.BaseClass;
import com.myStore.pageObjects.HomePage;
import com.myStore.pageObjects.IndexPage;
import com.myStore.pageObjects.LoginPage;
import com.myStore.pageObjects.SearchResultPage;

public class SearchResultPageTest extends BaseClass {
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	HomePage homePage;

	@Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchApp(browser);
	}

	@Test(groups = "Sanity")
	public void productAvailaibilityTest() throws Throwable {
		indexPage = new IndexPage();
		searchResultPage = indexPage.searchProduct("T-shirt");
		boolean result = searchResultPage.isProductAvailaible();
		Assert.assertTrue(false);

	}

	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void tearDown() {
		getDriver().quit();
	}
}
