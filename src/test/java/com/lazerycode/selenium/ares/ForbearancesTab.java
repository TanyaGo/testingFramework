package com.lazerycode.selenium.ares;

public class ForbearancesTab {


//    private PageElement panelBody = new PageElement("Element for the panelBody for the tab", FindBy.className("panel-body"),1);
//    private PageElement panelFooter = new PageElement("Element for the panelFooter for the tab",FindBy.className("panel-footer"));
//    private PageElement addForbearance = new PageElement("Element for the add forbearance link",In.ParentElement(panelFooter),FindBy.tagName("a"));
//    private PageElement formData = new PageElement("Element for the form parent element",In.ParentElement(panelBody),FindBy.tagName("form"));
//    private PageElement forbearanceType = new PageElement("Element for the type of forbearance field",In.ParentElement(formData),FindBy.id("forbType"));
//    private PageElement receivedDate = new PageElement("Element for the receivedDate field",In.ParentElement(formData),FindBy.id("receivedDate"));
//    private PageElement decisionDate = new PageElement("Element for the decision date field",In.ParentElement(formData),FindBy.id("decisionDate"));
//    private PageElement endDate = new PageElement("Element for the end date field",In.ParentElement(formData),FindBy.id("endDate"));
//
//    private PageElement saveButton = new PageElement("Element for the save button",In.ParentElement(panelBody),FindBy.id("forbSubmit"));
//    private PageElement agreementCheckbox = new PageElement("Element for the agreement checkbox",In.ParentElement(formData),FindBy.cssSelector("input[name=agreement]"));
//
//    //elements for if a forbearance exists
//    private PageElement table = new PageElement("Element for the table list", In.ParentElement(panelBody),FindBy.tagName("table"),1);
//    private PageElement tableBody = new PageElement("Element for the table body", In.ParentElement(table),FindBy.tagName("tbody"));
//    private PageElement auditStartDate = new PageElement("Element for the start date",In.ParentElement(tableBody),FindBy.tagName("td"),3);
//    private PageElement auditEndDate = new PageElement ("Element for the end date",In.ParentElement(tableBody),FindBy.tagName("td"),4);
//
//    //elements for overriding forbearance dates
//    private PageElement editButton = new PageElement("edit button element",In.ParentElement(tableBody),FindBy.className("icon-pencil"));
//    private PageElement modalContent = new PageElement("modal content element",FindBy.className("modal-content"));
//    private PageElement modalFormData = new PageElement("modal form data",In.ParentElement(modalContent),FindBy.tagName("form"));
//    private PageElement overrideEndDate = new PageElement("override end date element",In.ParentElement(modalFormData),FindBy.cssSelector("[name=overrideEndDate]"));
//    private PageElement overrideReason = new PageElement("override reason element",In.ParentElement(modalFormData),FindBy.cssSelector("[name=overrideReason]"));
//    private PageElement submitButton = new PageElement("submit button element",In.ParentElement(modalFormData),FindBy.tagName("button"));
//
//    public ForbearancesTab() {
//      UIThreadManager.getBrowser().waitFor(panelBody);
//    }
//
//    public void clickAddForbearance(){
//      UIThreadManager.getBrowser().click(addForbearance);
//    }
//
//    public void clickSaveButton(){
//      UIThreadManager.getBrowser().click(saveButton);
//    }
//
//    public void selectForbearanceType(String option){
//      UIThreadManager.getBrowser().selectByOptionText(forbearanceType, option);
//    }
//
//    public void typeReceivedDate(String value) {
//      WebDriver driver;
//      driver = UIThreadManager.getBrowser().getDriver();
//      receivedDate.getElement(driver,5).sendKeys(value);
//    }
//
//    public void typeDecisionDate(String value) {
//      WebDriver driver;
//      driver = UIThreadManager.getBrowser().getDriver();
//      decisionDate.getElement(driver,5).sendKeys(value);
//    }
//
//    public void setAgreementCheckbox(boolean checked){
//      UIThreadManager.getBrowser().setCheckboxState(agreementCheckbox, checked);
//    }
//
//    public void addForbearanceToUser(String date, String forbType) throws Exception {
//      clickAddForbearance();
//      UIThreadManager.getBrowser().waitFor(endDate);
//      selectForbearanceType(forbType);
//      typeReceivedDate(date);
//      typeDecisionDate(date);
//      setAgreementCheckbox(true);
//      clickSaveButton();
//    }
//
//    public void extendForbearanceToUser(String date) {
//      clickAddForbearance();
//      UIThreadManager.getBrowser().waitFor(endDate);
//      typeReceivedDate(date);
//      typeDecisionDate(date);
//      setAgreementCheckbox(true);
//      clickSaveButton();
//    }
//
//    public String getAuditStartDate() {
//      UIThreadManager.getBrowser().waitFor(tableBody);
//      return UIThreadManager.getBrowser().getText(auditStartDate);
//    }
//
//    public String getAuditEndDate() {
//      UIThreadManager.getBrowser().waitFor(tableBody);
//      return UIThreadManager.getBrowser().getText(auditEndDate);
//    }
//
//    public String getAuditEndDateByRow(int rowIndex) {
//      UIThreadManager.getBrowser().waitFor(tableBody);
//      PageElement row = new PageElement("forbearance row element",In.ParentElement(tableBody),FindBy.tagName("tr"),rowIndex);
//      PageElement auditEndDateByRow = new PageElement("particular row element value",In.ParentElement(row),FindBy.tagName("td"),4);
//      return UIThreadManager.getBrowser().getText(auditEndDateByRow);
//    }
//
//    public String getAuditStartDateByRow(int rowIndex) {
//      UIThreadManager.getBrowser().waitFor(tableBody);
//      PageElement row = new PageElement("forbearance row element",In.ParentElement(tableBody),FindBy.tagName("tr"),rowIndex);
//      PageElement auditStartDateByRow = new PageElement("particular row element value",In.ParentElement(row),FindBy.tagName("td"),3);
//      return UIThreadManager.getBrowser().getText(auditStartDateByRow);
//    }
//
//    //override date methods
//    private void clickEditButton() {
//      UIThreadManager.getBrowser().click(editButton);
//    }
//
//    private void typeOverrideDate(String date){
//      overrideEndDate.getElement(UIThreadManager.getBrowser().getDriver(),5).sendKeys(date);
//    }
//
//    private void typeOverrideReason(String reason) {
//      UIThreadManager.getBrowser().type(overrideReason, reason);
//    }
//
//    private void clickSubmitButton() {
//      UIThreadManager.getBrowser().click(submitButton);
//    }
//
//    public void addOverrideDate(String date, String reason) {
//      clickEditButton();
//      UIThreadManager.getBrowser().waitFor(modalContent);
//      typeOverrideDate(date);
//      typeOverrideReason(reason);
//      clickSubmitButton();
//      UIThreadManager.getBrowser().waitForDoesNotExist(modalContent);
//    }


  }
