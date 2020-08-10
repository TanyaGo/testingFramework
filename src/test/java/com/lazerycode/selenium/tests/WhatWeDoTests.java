package com.lazerycode.selenium.tests;
import com.lazerycode.selenium.page_objects.MainPage;
import com.lazerycode.selenium.page_objects.WhatWeDoPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WhatWeDoTests extends BaseTest {

    @Test(description = "Verify that user is on the ordering page")
    public void userIsOnOrderingPage(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        WhatWeDoPage whatWeDoPage= mainPage.clickOnWhatWeDo();
        whatWeDoPage.clickOrderingTag();
        Assert.assertTrue(whatWeDoPage.isOrderingPageShown());
    }

    @Test(description = "Verify that WEBSITES & MOBILE APPS component is shown on the ordering page")
    public void websitesAndMobileAppsComponentIsShown(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        WhatWeDoPage whatWeDoPage= mainPage.clickOnWhatWeDo();
        whatWeDoPage.clickOrderingTag();
        Assert.assertTrue(whatWeDoPage.isWebsitesAndMobileSitesAppsShown());
    }

    @Test(description = "Verify that ORDERING NETWORK component is shown on the ordering page")
    public void orderingNetworkComponentIsShown(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        WhatWeDoPage whatWeDoPage= mainPage.clickOnWhatWeDo();
        whatWeDoPage.clickOrderingTag();
        Assert.assertTrue(whatWeDoPage.isOrderingNetworkShown());
    }

    @Test(description = "Verify that INSTANT UPSELLS & CROSS-SELLS component is shown on the ordering page")
    public void instantUpsellsAndCrossSellComponentIsShown(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        WhatWeDoPage whatWeDoPage= mainPage.clickOnWhatWeDo();
        whatWeDoPage.clickOrderingTag();
        Assert.assertTrue(whatWeDoPage.isInstantUpsellsAndCrossSellsShown());
    }

    @Test(description = "Verify that requested form submitted")
    public void requestedFormSubmitted(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        WhatWeDoPage whatWeDoPage= mainPage.clickOnWhatWeDo();
        whatWeDoPage.clickOrderingTag();
        whatWeDoPage.clickLearnMore();
        whatWeDoPage.submitForm("Ashton", "4569876789","ashton.a@gmail.com", "Apple");
        Assert.assertTrue(whatWeDoPage.isFormSubmitted());
    }

}
