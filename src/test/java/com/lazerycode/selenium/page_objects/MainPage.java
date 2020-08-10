package com.lazerycode.selenium.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[for='folder-toggle-56e79ffee707eb0a43f95f1a']")
    private WebElement whatWeDo;
    @FindBy(css= "[for='folder-toggle-5b2d744a8a922db667eb874d']")
    private WebElement company;
    @FindBy(xpath = "//nav[@id='sqmainNavigation']//a[contains(.,'Careers')]")
    private WebElement careers;
    @FindBy(css = "[for='folder-toggle-5b2d703103ce64d472f4e0bb']")
    private WebElement thoughtLeadership;
    @FindBy(xpath= "//nav[@id='sqmainNavigation']//a[contains(.,'Contact')]")
    private WebElement contact;


    public void openPage() {
    driver.get("https://www.tillster.com/");
    }

    public  WhatWeDoPage clickOnWhatWeDo(){
        waitUntilVisibility(whatWeDo).click();
        return new WhatWeDoPage(driver);
    }

    public void clickCompanyButton(){
        company.click();
    }

    public void clickCareerButton(){
        careers.click();
    }

    public void clickThoughtLeadershipButton(){
        thoughtLeadership.click();
    }

    public void clickContactButton(){
        contact.click();
    }



}
