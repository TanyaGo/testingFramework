package com.lazerycode.selenium.ares;

public class LoanModificationTab {

//  private PageElement loanModeTab = new PageElement("Element to click on Loan Mode tab", FindBy.className("#loanmod"));
//  private PageElement loanDiv = new PageElement("Element for the loan div for the tab", FindBy.xpath("//div[@name='loan']"));
//  private PageElement checkLoanModeEligibilityButton = new PageElement("Button to verify loan Mod elegibility", FindBy.cssSelector("[data-ng-disabled='vm.disableCheckBtn']"));
//  private PageElement extendNotEligibleArrow = new PageElement("Extend the list of Not Eligible Mods", FindBy.cssSelector("span[class='glyphicon pull-right glyphicon-chevron-down']"));
//  private PageElement rollUpNotEligibleArrow = new PageElement("Roll aup the list of Not Eligible Mods", FindBy.cssSelector("span[class='glyphicon pull-right glyphicon-chevron-up']"));
//  private PageElement requestedLoanModificationsButton = new PageElement("Button to see requested loan mods", FindBy.cssSelector("#existing-requests"));
//  private PageElement reviewButton = new PageElement("Button to review loan mode request", FindBy.cssSelector("[data-ng-click='vm.showReviewLoanModDialog(loanModRequest)']"));
//
//  //IO
//  public InterestOnlyTab clickInterestOnlyApply() {
//
//    //Apply IO for the loan that is Eligible
//    PageElement applyInterestOnlyEligibleLoan = new PageElement("Button To apply Int Only for eligible loan",  FindBy.cssSelector("[data-qa='loan_mod_result_apply_btn_INT_ONLY']"));
//    //Apply IO for the loan that is not Eligible
//    PageElement applyInterestOnlyNotEligibleLoan = new PageElement("Button To apply Int Only for not eligible loan",  FindBy.cssSelector("[data-qa='loan_mod_result_apply_anyway_btn_INT_ONLY']"));
//    UIThreadManager.getBrowser().waitFor(extendNotEligibleArrow, 15);
//    if (UIThreadManager.getBrowser().exists(applyInterestOnlyEligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyInterestOnlyEligibleLoan);
//    } else if (UIThreadManager.getBrowser().exists(extendNotEligibleArrow)) {
//      UIThreadManager.getBrowser().click(extendNotEligibleArrow);
//      UIThreadManager.getBrowser().waitForVisible(applyInterestOnlyNotEligibleLoan, 15);
//      UIThreadManager.getBrowser().click(applyInterestOnlyNotEligibleLoan);
//    } else {
//      return null;
//    }
//    return new InterestOnlyTab();
//  }
//
//  //ND
//  public NaturalDisasterTab clickNaturalDisasterApply() {
//    //Apply ND for the loan that is Eligible
//    PageElement applyNaturalDisasterEligibleLoan = new PageElement("Apply Natural Disaster to eligible loan", FindBy.cssSelector("[data-qa='loan_mod_result_apply_btn_NAT_DSTR']"));
//    //Apply ND for the loan that is Not Eligible
//    PageElement applyNaturalDisasterNotElligibleLoan = new PageElement("Apply Natural Disaster to not eligible loan",  FindBy.cssSelector("[data-qa='loan_mod_result_apply_anyway_btn_NAT_DSTR']"));
//    UIThreadManager.getBrowser().waitForVisible(applyNaturalDisasterEligibleLoan, 15);
//    if (UIThreadManager.getBrowser().exists(applyNaturalDisasterNotElligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyNaturalDisasterNotElligibleLoan);
//    } else if (UIThreadManager.getBrowser().exists(applyNaturalDisasterEligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyNaturalDisasterEligibleLoan);
//    } else {
//      return null;
//    }
//    return new NaturalDisasterTab();
//  }
//
//  //Admin
//  public AdminTab clickAdminApply() {
//    //Apply Admin for the loan that is Eligible
//    PageElement applyAdministrativeElligibleLoan = new PageElement("Apply Admin to eligible loan", FindBy.cssSelector("[data-qa='loan_mod_result_apply_btn_ADMIN']"));
//    //Apply Admin for the loan that is Not Eligible
//    PageElement applyAdministrativeNotElligibleLoan = new PageElement("Apply Admin to not eligible loan", FindBy.cssSelector("[data-qa='loan_mod_result_apply_anyway_btn_ADMIN']"));
//    UIThreadManager.getBrowser().waitFor(applyAdministrativeElligibleLoan, 15);
//    if (UIThreadManager.getBrowser().exists(applyAdministrativeElligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyAdministrativeElligibleLoan);
//    } else if (UIThreadManager.getBrowser().exists(applyAdministrativeNotElligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyAdministrativeNotElligibleLoan);
//    } else {
//      return null;
//    }
//    return new AdminTab();
//  }
//
//  //Military
//  public MilitaryTab clickMilitaryApply() {
//    //Apply Military for the loan that is Eligible
//    PageElement applyMilitaryEligibleLoan = new PageElement("Apply Military to eligible loan", By.cssSelector("[data-qa='loan_mod_result_apply_btn_MILITARY']"));
//    //Apply Military for the loan that is Not Eligible
//    PageElement applyMilitaryNotEligibleLoan = new PageElement("Apply Military to not eligible loan",By.cssSelector("[data-qa='loan_mod_result_apply_anyway_btn_MILITARY']"));
//    UIThreadManager.getBrowser().waitFor(extendNotEligibleArrow, 15);
//    if (UIThreadManager.getBrowser().exists(applyMilitaryEligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyMilitaryEligibleLoan);
//    } else if (UIThreadManager.getBrowser().exists(extendNotEligibleArrow)) {
//      UIThreadManager.getBrowser().click(extendNotEligibleArrow);
//      UIThreadManager.getBrowser().waitForVisible(applyMilitaryNotEligibleLoan, 15);
//      UIThreadManager.getBrowser().click(applyMilitaryNotEligibleLoan);
//    } else {
//      return null;
//    }
//    return new MilitaryTab();
//  }
//
//  //One Payment Extension
//  public OnePaymentExtensionTab clickOnePaymentApply() {
//    //Apply One Payment Extension for the loan that is Eligible
//    PageElement applyOnePaymentExtensionEligibleLoan = new PageElement("Apply Payment Extension to eligible loan", By.cssSelector("[data-qa='loan_mod_result_apply_btn_1_PAY_EXT']"));
//    //Apply One Payment Extension for the loan that is Not Eligible
//    PageElement applyOnePaymentExtensionNotEligibleLoan = new PageElement("Apply Payment Extension to not eligible loan", By.cssSelector("[data-qa='loan_mod_result_apply_anyway_btn_1_PAY_EXT']"));
//    UIThreadManager.getBrowser().waitFor(extendNotEligibleArrow, 15);
//    if (UIThreadManager.getBrowser().exists(applyOnePaymentExtensionEligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyOnePaymentExtensionEligibleLoan);
//    } else if (UIThreadManager.getBrowser().exists(extendNotEligibleArrow)) {
//      UIThreadManager.getBrowser().click(extendNotEligibleArrow);
//      UIThreadManager.getBrowser().waitForVisible(applyOnePaymentExtensionNotEligibleLoan, 15);
//      UIThreadManager.getBrowser().click(applyOnePaymentExtensionNotEligibleLoan);
//    } else {
//      return null;
//    }
//    return new OnePaymentExtensionTab();
//  }
//
//  //Hardship
//  public HardshipTab clickHardshipApply() {
//    //Apply Hardship for the loan that is Eligible
//    PageElement applyHardshipEligibleLoan = new PageElement("Apply Hardship to eligible loan ",  By.cssSelector("[data-qa='loan_mod_result_apply_btn_UNEMPLOYMENT']"));
//    //Apply Hardship for the loan that is Not Eligible
//    PageElement applyHardshipNotEligibleLoan = new PageElement("Apply Hardship to not to eligible loan", By.cssSelector("[data-qa='loan_mod_result_apply_anyway_btn_UNEMPLOYMENT']"));
//    UIThreadManager.getBrowser().waitFor(extendNotEligibleArrow, 15);
//    if (UIThreadManager.getBrowser().exists(applyHardshipEligibleLoan)) {
//      UIThreadManager.getBrowser().click(applyHardshipEligibleLoan);
//    } else if (UIThreadManager.getBrowser().exists(extendNotEligibleArrow)) {
//      UIThreadManager.getBrowser().click(extendNotEligibleArrow);
//      UIThreadManager.getBrowser().waitForVisible(applyHardshipNotEligibleLoan, 15);
//      UIThreadManager.getBrowser().click(applyHardshipNotEligibleLoan);
//    } else {
//      return null;
//    }
//    return new HardshipTab();
//  }
//
//  //Loan Modification
//  public LoanModificationTab clickLoanModificationApply() {
//    //Apply Loan Mode for the loan that is Eligible
//    PageElement applyLoanModeElligibleLoan = new PageElement("Apply Loan Mode to eligible loan",  FindBy.xpath("//button[contains(text(),'Apply')]"));
//    //Apply Loan Mode for the loan that is Not Eligible
//    PageElement applyLoanModeNotElligibleLoan = new PageElement("Apply Loan Mode to not eligible loan", FindBy.xpath("//button[contains(text(),'Apply Anyway')]"));
//    if (UIThreadManager.getBrowser().exists(applyLoanModeElligibleLoan)){
//      UIThreadManager.getBrowser().click(applyLoanModeElligibleLoan);
//    }
//    else if (UIThreadManager.getBrowser().exists(extendNotEligibleArrow)){
//      UIThreadManager.getBrowser().click(extendNotEligibleArrow);
//      UIThreadManager.getBrowser().click (applyLoanModeNotElligibleLoan);
//    }
//    else {
//      return null;
//    }
//    return new LoanModificationTab();
//  }
//
//  public void clickLoanModeTab() {
//    UIThreadManager.getBrowser().click(loanModeTab);
//  }
//
//  public void clickCheckEligibilityForLoanModifications() {
//    UIThreadManager.getBrowser().click(checkLoanModeEligibilityButton);
//  }
//
//  public void clickRequestedLoanModifications() {
//    UIThreadManager.getBrowser().click(requestedLoanModificationsButton);
//  }
//
//  public void clickOnReviewButton() { UIThreadManager.getBrowser().click(reviewButton);}
}

