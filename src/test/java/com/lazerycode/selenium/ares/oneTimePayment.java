package com.lazerycode.selenium.ares;

public class oneTimePayment {


//  private PageElement panelBody = new PageElement("Element for the highest parent panelBody for the tab", FindBy.className("panel-body"));
//  private PageElement oneTimePaymentsTab = new PageElement("Element for the one time payements tab",FindBy.cssSelector("[data-qa='one_time_pmts_sub_tab']"));
//  private PageElement bankAccountsTab = new PageElement("Element for the bank accounts tab",FindBy.cssSelector("[data-qa='bnk_accs_sub_tab']"));
//  private PageElement paymentPromises = new PageElement("Element for the Payment Promises tab",FindBy.cssSelector("[data-qa='p2p_sub_tab']"));
//  private PageElement catchUpPlan = new PageElement("Element for the Catch Up Plan tab",FindBy.cssSelector("[data-qa='catch_up_plan_sub_tab']"));
//
//  //payment fields
//  private PageElement addNewPayment = new PageElement("Element  to ad new one time payment",FindBy.cssSelector("[data-qa='one_time_pmts_btn_add_new_pmt']"));
//  private PageElement selectExistingAcct = new PageElement("Element for the select existing account field",FindBy.cssSelector("[data-qa='pmt_select_bank_acc']"));
//  private PageElement otpRemoveBankAccountButton = new PageElement("Element for remove bank account button",FindBy.cssSelector("[data-qa='ach_removal_modal_btn_remove_bnk_acc']"));
//  private PageElement otpCancelButtonInAccountsPopUpWindow = new PageElement("Element for cancel any action in accounts pop up window",FindBy.cssSelector("[data-qa='ach_removal_modal_btn_cancel']"));
//  private PageElement otpAccountHolderName = new PageElement("Element for the account holder name field",FindBy.cssSelector("[data-qa='pmt_acc_holder_name']"));
//  private PageElement otpAccountType = new PageElement("Element for the account type field",FindBy.cssSelector("[data-qa='pmt_acc_type']"));
//  private PageElement otpRoutingNumber = new PageElement("Element for the routing number field",FindBy.cssSelector("[data-qa='pmt_routing_num']"));
//  private PageElement otpBankAcctNumber = new PageElement("Element for the bank acct number field",FindBy.cssSelector("[data-qa='pmt_bank_acc_num']"));
//  private PageElement saveAccountInfoCheckbox = new PageElement("Element for saving account info checkbox",FindBy.cssSelector("[data-qa='one_time_pmts_checkbox_save_for_future_pmts']"));
//  private PageElement otpNickname = new PageElement("Element for saving account nickname",FindBy.cssSelector("[data-qa='opmt_nickname']"));
//  private PageElement paymentType = new PageElement("Element for payment type field",FindBy.cssSelector("[data-qa='pmt_type']"));
//  private PageElement paymentAmount = new PageElement("Element for payment amount field",FindBy.cssSelector("[data-qa='pmt_amount']"));
//  private PageElement postDate = new PageElement("Element for post date field",FindBy.cssSelector("[data-qa='pmt_post_date']"));
//  private PageElement otpAgreementCheckbox = new PageElement("Element for the agreement checkbox",FindBy.cssSelector("[data-qa='one_time_pmts_checkbox_agreement']"));
//
//  //bank account fields
//  private PageElement addNewBankAccountButton = new PageElement("Element to add new bank account",FindBy.cssSelector("[data-qa='bnk_accs_btn_add_new_bnk_acc']"));
//  private PageElement bankAccountHolderName = new PageElement("Element for the account holder name field",FindBy.cssSelector("[data-qa='bank_acc_acc_holder_name']"));
//  private PageElement bankAccountType = new PageElement("Element for the account type field",FindBy.cssSelector("[data-qa='bank_acc_account_type']"));
//  private PageElement bankRoutingNumber = new PageElement("Element for the routing number field",FindBy.cssSelector("[data-qa='bank_acc_routing_num']"));
//  private PageElement bankBankAcctNumber = new PageElement("Element for the bank acct number field",FindBy.cssSelector("[data-qa='bank_acc_bank_acc_number']"));
//  private PageElement accountNickname = new PageElement("Element for the nickname field",FindBy.cssSelector("[data-qa='bank_acc_nickname']"));
//  private PageElement refundAcctCheckbox = new PageElement("Element for refund checkbox",FindBy.cssSelector("[data-qa='bank_acc_is_refund']"));
//  private PageElement saveAccountButton = new PageElement("Element for save account button", FindBy.cssSelector("[data-qa='bank_acc_submit_btn']"));
//  private PageElement authorizationCheckBox = new PageElement("Element for checkbox Borrower consented authorization of this bank account ", FindBy.cssSelector("[data-qa='']"));
//  private PageElement confirmAccountDisclosureButton = new PageElement("Element for confirm account disclosure button", FindBy.cssSelector("[data-qa='']"));
//  private PageElement editBankAccountButton = new PageElement("Element for editing bank account info", FindBy.cssSelector("[data-qa='bnk_accs_btn_edit_bnk_acc']"));
//  private PageElement removeBankAccountButton = new PageElement("Element to remove bank account info", FindBy.cssSelector("[data-qa='bnk_accs_btn_remove_bnk_acc']"));
//  private PageElement cancelBankAccountButton = new PageElement("Element to cancel adding or making any changes with  bank account info", FindBy.cssSelector("[data-qa='bnk_accs_btn_cancel_add_new_bnk_acc']"));
//  private PageElement errorMessageNoChanges = new PageElement("Element to show error message if there is no changes were done in case to save", FindBy.className("alert alert-top alert-danger ng-binding ng-scope"));
//
//
//  public OneTimePaymentsTab() {
//    UIThreadManager.getBrowser().waitFor(panelBody);
//  }
//
//  public void clickOneTimePaymentsTab() {
//    UIThreadManager.getBrowser().click(oneTimePaymentsTab);
//  }
//
//  public void clickBankAccountsTab() {
//    UIThreadManager.getBrowser().waitFor(bankAccountsTab);
//    UIThreadManager.getBrowser().click(bankAccountsTab);
//  }
//
//  public void clickAddNewOneTimePayment() {
//    UIThreadManager.getBrowser().click(addNewPayment);
//  }
//
//  public void clickOnAddNewBankAccount() {
//    UIThreadManager.getBrowser().click(addNewBankAccountButton);
//  }
//
//  //one time payment methods
//  public void selectExistingAccount(String option) {
//    UIThreadManager.getBrowser().waitFor(selectExistingAcct);
//    UIThreadManager.getBrowser().selectByOptionText(selectExistingAcct, option);
//  }
//
//  public void selectOneTimePaymentAccountType(String option) {
//    UIThreadManager.getBrowser().selectByOptionText(otpAccountType, option);
//  }
//
//  public void typeOneTimePaymentAccountHolderName(String value) {
//    UIThreadManager.getBrowser().type(otpAccountHolderName, value);
//  }
//
//  public void typeOneTimePaymentRoutingNumber(String value) {
//    UIThreadManager.getBrowser().type(otpRoutingNumber, value);
//  }
//
//  public void typeOneTimePaymentBankAccountNumber(String value) {
//    UIThreadManager.getBrowser().type(otpBankAcctNumber, value);
//  }
//
//  public void setSaveAccountInfoCheckbox(boolean checked) {
//    UIThreadManager.getBrowser().setCheckboxState(saveAccountInfoCheckbox, checked);
//  }
//
//  public void typeOtpNickname(String value) {
//    UIThreadManager.getBrowser().type(otpNickname, value);
//  }
//
//  public void selectPaymentType(String option) {
//    UIThreadManager.getBrowser().selectByOptionText(paymentType, option);
//  }
//
//  public void typeAmount(String value) {
//    UIThreadManager.getBrowser().type(paymentAmount, value);
//  }
//
//  public void typePostDate(String value) {
//    UIThreadManager.getBrowser().type(postDate, value);
//  }
//
//  public void setAgreementCheckbox(boolean checked) {
//    UIThreadManager.getBrowser().setCheckboxState(otpAgreementCheckbox, checked);
//  }
//
//  //bank accounts methods
//  public void selectBankAccountType(String option) {
//    UIThreadManager.getBrowser().selectByOptionText(bankAccountType, option);
//  }
//
//  public void typeBankAccountHolderName(String value) {
//    UIThreadManager.getBrowser().type(bankAccountHolderName, value);
//  }
//
//  public void typeBankAccountRoutingNumber(String value) {
//    UIThreadManager.getBrowser().type(bankRoutingNumber, value);
//  }
//
//  public void typeBankAccountNumber(String value) {
//    UIThreadManager.getBrowser().type(bankBankAcctNumber, value);
//  }
//
//  public void typeNickname(String value) {
//    UIThreadManager.getBrowser().type(accountNickname, value);
//  }
//
//  public void setRefundAccountCheckbox() {
//    UIThreadManager.getBrowser().click(refundAcctCheckbox);
//  }
//
//  public void clickOnSaveAccountButton() {
//    UIThreadManager.getBrowser().click(saveAccountButton);
//  }
//
//  public void clickOnAuthorizationCheckBox() {
//    UIThreadManager.getBrowser().click(authorizationCheckBox);
//  }
//
//  public void clickOnConfirmAccountDisclosureButton() {
//    UIThreadManager.getBrowser().click(confirmAccountDisclosureButton);
//  }
//
//  public void clickOnEditBankAccountButton() {
//    UIThreadManager.getBrowser().click(editBankAccountButton);
//  }
//
//  public void clickOnRemoveBankAccountButton() {
//    UIThreadManager.getBrowser().click(removeBankAccountButton);
//  }
//
//  public void clickOnCancelBankAccountButton() {
//    UIThreadManager.getBrowser().click(cancelBankAccountButton);
//  }
//
//  public boolean isErrorMessageNoChangesShown() {
//    return UIThreadManager.getBrowser().isVisible(errorMessageNoChanges);
//  }
//
//  public boolean isNicknameShown(String status) {
//    PageElement nickname = new PageElement("Nickname", FindBy.xpath("//span[contains(text(), '" + status + "')]"));
//    return UIThreadManager.getBrowser().isVisible(nickname, 25);
//  }
//
//  public boolean isErrorRoutingNumberInvalidShown(String message) {
//    PageElement errorMessageRouting = new PageElement("ErrorInvalidRouting", FindBy.xpath("//div[contains(text(), '" + message + "')]"));
//    return UIThreadManager.getBrowser().isVisible(errorMessageRouting, 25);
//  }
//
//  public boolean isErrorAccountAlreadySavedShown(String message) {
//    PageElement errorMessageAccountAlreadySaved = new PageElement("ErrorAccountAlreadySaved", FindBy.xpath("//div[contains(text(), '" + message + "')]"));
//    return UIThreadManager.getBrowser().isVisible(errorMessageAccountAlreadySaved, 25);
//  }
//
//  public boolean isErrorAnotherAccountWithThisNicknameAlreadyExistsShown(String message) {
//    PageElement errorMessageNicknameAlreadyExists = new PageElement("ErrorExistingNickname", FindBy.xpath("//div[contains(text(), '" + message + "')]"));
//    return UIThreadManager.getBrowser().isVisible(errorMessageNicknameAlreadyExists, 25);
//  }
//
//  public boolean isErrorNicknameCannotBeAutoPayShown(String message) {
//    PageElement errorMessageNicknameCannotBeAutoPay = new PageElement("ErrorInvalidRouting", FindBy.xpath("//div[contains(text(), '" + message + "')]"));
//    return UIThreadManager.getBrowser().isVisible(errorMessageNicknameCannotBeAutoPay, 25);
//  }
//
//  public void clickOnPaymentPromises() {
//    UIThreadManager.getBrowser().click(paymentPromises);
//  }
//
//  public void clickOnCatchUpPlan() {
//    UIThreadManager.getBrowser().click(catchUpPlan);
//  }
//
//  public void selectAccountToBeRemoved(String nicknameString) {
//    PageElement nicknameText = new PageElement("Element to select radio button based on nickname",FindBy.xpath("//td[contains(text(), '" + nicknameString + "')]"));
//    //UIThreadManager.getBrowser().waitFor(nicknameText);
//    PageElement siblingTdElem = new PageElement("sibling element", Relative.FollowedBySibling(nicknameText), "td");
//    PageElement radioToClick = new PageElement("radio to click", In.ParentElement(siblingTdElem), FindBy.tagName("input"));
//    UIThreadManager.getBrowser().click(radioToClick);
//  }
//
//  public void clickOnCancelButtonInAccountsWindowPopUp() {
//    UIThreadManager.getBrowser().click(otpCancelButtonInAccountsPopUpWindow);
//  }
//
//  public void clickRemoveBankAccountButtonOTP() {
//    UIThreadManager.getBrowser().waitFor(otpRemoveBankAccountButton);
//    UIThreadManager.getBrowser().click(otpRemoveBankAccountButton);
//  }
//
//  public void addNewBankAccountProcess(String type, String holder, String routing, String acNumber, String nickname) {
//    clickOnAddNewBankAccount();
//    selectBankAccountType(type);
//    typeBankAccountHolderName(holder);
//    typeBankAccountRoutingNumber(routing);
//    typeBankAccountNumber(acNumber);
//    typeNickname(nickname);
//    clickOnSaveAccountButton();
//  }
//  public void addNewBankAccountProcessWithRefundCheckbox(String type, String holder, String routing, String acNumber) {
//    clickOnAddNewBankAccount();
//    selectBankAccountType(type);
//    typeBankAccountHolderName(holder);
//    typeBankAccountRoutingNumber(routing);
//    typeBankAccountNumber(acNumber);
//  }
//
//  public boolean isThisRefundAccountCheckboxShown() {
//    return UIThreadManager.getBrowser().isVisible(refundAcctCheckbox, 25);
//  }
//
//  public void clearNickNameField(){
//    UIThreadManager.getBrowser().clear(accountNickname);
//  }
}