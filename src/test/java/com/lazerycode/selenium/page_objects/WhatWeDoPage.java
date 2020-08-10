package com.lazerycode.selenium.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatWeDoPage extends BasePage {
    public WhatWeDoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="nav#sqmainNavigation [href='/digital-ordering-solutions']")
    private WebElement orderingTab;
    @FindBy(css="nav#sqmainNavigation [href='/coupons-loyalty-email-programs']")
    private WebElement marketingTab;
    @FindBy(css="nav#sqmainNavigation [href='/data-science']")
    private WebElement dataScienceTab;
    @FindBy(css="nav#sqmainNavigation [href='/technology']")
    private WebElement technologyTab;
    @FindBy(xpath = "//h3[.='ONLINE & MOBILE ORDERING']")
    private WebElement onlineAndMobileOrderingText;
    @FindBy(css = "div[data-type='page'] div:nth-of-type(5) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) h3:nth-of-type(1)")
    private WebElement websitesAndMobileSitesApps;
    @FindBy(css = "div[data-type='page'] div:nth-of-type(1) > div:nth-of-type(5) > div:nth-of-type(1) div:nth-of-type(2) h3:nth-of-type(1)")
    private WebElement orderingNetwork;
    @FindBy (css= "div[data-type='page'] div:nth-of-type(5) > div:nth-of-type(1) div:nth-of-type(3) h3:nth-of-type(1)")
    private WebElement instantUpsellsAndCrossSells;
    @FindBy (css= "a[href='//www.tillster.com/online-ordering-solutions']")
    private WebElement learnMore;
    @FindBy (css = "div.field-list > div:nth-of-type(1) > .field-element")
    private WebElement nameField;
    @FindBy (css = "[spellcheck='false'][type='text']")
    private WebElement phoneField;
    @FindBy (css = "[name='email']")
    private WebElement emailField;
    @FindBy (css = "div.field-list > div:nth-of-type(4) > .field-element")
    private WebElement companyName;
    @FindBy (css = ".button")
    private WebElement submit;
    @FindBy (css = "[src='http://www.tillster.com/assets/images/thankyou.jpg']")
    private WebElement thankYouImmage;



    public void clickOrderingTag(){
        waitUntilVisibility(orderingTab).click();
    }

    public void clickMarketingTag(){
        marketingTab.click();
    }

    public void clickDataScienceTag(){
        dataScienceTab.click();
    }

    public void clickTechnologyTab(){
        technologyTab.click();
    }

    public boolean isOrderingPageShown(){
        return onlineAndMobileOrderingText.isDisplayed();
    }

    public boolean isWebsitesAndMobileSitesAppsShown(){
        return websitesAndMobileSitesApps.isDisplayed();
    }

    public boolean isOrderingNetworkShown(){
        return orderingNetwork.isDisplayed();
    }

    public boolean isInstantUpsellsAndCrossSellsShown(){
        return instantUpsellsAndCrossSells.isDisplayed();
    }

    public void clickLearnMore(){
        learnMore.click();
    }

    public void typeName(String name){
        nameField.sendKeys(name);
    }

    public void typePhone(String phone){
        phoneField.sendKeys(phone);
    }

    public void typeEmail(String email){
        emailField.sendKeys(email);
    }

    public void typeCompanyName(String companyN){
        companyName.sendKeys(companyN);
    }

    public void clickSubmit(){
        submit.click();
    }

    public boolean isFormSubmitted(){
        return thankYouImmage.isDisplayed();
    }

    public void submitForm(String name, String phone, String email, String companyName){
        typeName(name);
        typePhone(phone);
        typeEmail(email);
        typeCompanyName(companyName);
        clickSubmit();
    }

}
