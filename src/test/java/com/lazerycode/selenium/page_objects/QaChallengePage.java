package com.lazerycode.selenium.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaChallengePage extends BasePage{

  public QaChallengePage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css="#Username")
  private WebElement userName;
  @FindBy(css="#Password")
  private WebElement password;
  @FindBy (css=".btn.btn-primary")
  private  WebElement loginButton;
  @FindBy (css="#add")
  private  WebElement addEmployee;
  @FindBy (css="#firstName")
  private  WebElement firstName;
  @FindBy (css="#lastName")
  private  WebElement lastName;
  @FindBy (css="#dependants")
  private  WebElement dependants;
  @FindBy (css="#addEmployee")
  private  WebElement addButton;

  public void openPage() {
    driver.get("https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com/Prod/Account/LogIn");
  }

  public void typeUserName(String uName){
    userName.sendKeys(uName);
  }

  public void typePassword(String uPassword){
    password.sendKeys(uPassword);
  }

  public void clickOnLoginButton(){
    loginButton.click();
  }

  public void clickOnAddEmployees(){
    addEmployee.click();
  }

  public void typeFirstName(String fName){
    firstName.sendKeys(fName);
  }

  public void typeLastName(String lName){
    lastName.sendKeys(lName);
  }

  public void typeDependants(String eDependants){
    dependants.sendKeys(eDependants);
  }

  public void clickOnAddButton(){
    addButton.click();
  }

  public boolean isUserAddedToTheTable(String lastName){

    return driver.findElement(By.xpath("//td[contains(text(), '" + lastName + "')]")).isDisplayed();

  }




}
