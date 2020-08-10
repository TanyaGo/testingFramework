package com.lazerycode.selenium.tests;
import com.lazerycode.selenium.page_objects.QaChallengePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QaChallengeTest extends BaseTest {

  @Test(description = "Verify that user is on the ordering page")
  public void userIsOnOrderingPage(){
    QaChallengePage qaChallengePage = new QaChallengePage(driver);
    qaChallengePage.openPage();
    qaChallengePage.typeUserName("TestUser27");
    qaChallengePage.typePassword("KYSWe(RG#>7A");
    qaChallengePage.clickOnLoginButton();
    qaChallengePage.clickOnAddEmployees();
    qaChallengePage.typeFirstName("Olivia");
    qaChallengePage.typeLastName("Vallenso");
    qaChallengePage.typeDependants("1");
    qaChallengePage.clickOnAddButton();
    Assert.assertTrue(qaChallengePage.isUserAddedToTheTable("Vallenso"));
  }
}
