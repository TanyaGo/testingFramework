package com.lazerycode.selenium.ares;

public class TransactionTab {


//    private PageElement panelBody = new PageElement("Element for the panelBody for the tab", FindBy.xpath("//div[contains(@class, 'panel-body')]"));
//    private PageElement tableBody = new PageElement("Element for the tableBody for the tab",In.ParentElement(panelBody),FindBy.tagName("tbody"));
//    private PageElement panelFooter = new PageElement("Element for the panelFooter for the tab",FindBy.className("panel-footer"));
//    private PageElement formData = new PageElement("Element for the form data", FindBy.xpath("//div[contains(@class, 'panel-body')]//form"));
//    private PageElement effectiveDate = new PageElement("Element for effective date field",In.ParentElement(formData),FindBy.id("date"),1);
//    private PageElement addTransaction = new PageElement("Element for adding a transaction", In.ParentElement(panelFooter),FindBy.tagName("a"));
//    private PageElement showReversedCheckbox = new PageElement("Element for showing reversed",In.ParentElement(panelBody),FindBy.cssSelector("input[type=checkbox]"));
//    private PageElement transactionType = new PageElement("Element for the transaction type field",In.ParentElement(formData),FindBy.id("type"));
//    private PageElement amount = new PageElement("Element for the amount field",In.ParentElement(formData),FindBy.id("amount"));
//    private PageElement checkNumber = new PageElement("Element for the check field",In.ParentElement(formData),FindBy.id("checkNumber"));
//    private PageElement postDate = new PageElement("Element for the post date field",In.ParentElement(formData),FindBy.id("date"),0);
//    private PageElement saveButton = new PageElement("Element for the save button",In.ParentElement(formData),FindBy.cssSelector("input[type=submit]"));
//
//    //TODO: add a function for figuring out how to delete an audit field
//
//    public TransactionsTab() {
//      UIThreadManager.getBrowser().waitFor(panelBody);
//    }
//
//    private void addTransaction(){
//      UIThreadManager.getBrowser().click(addTransaction);
//      UIThreadManager.getBrowser().waitFor(formData);
//    }
//
//    private void typeEffectiveDate(String value){
//      UIThreadManager.getBrowser().type(effectiveDate, value);
//    }
//
//    private void selectTransactionType(String option){
//      UIThreadManager.getBrowser().selectByOptionText(transactionType, option);
//    }
//
//    private void typeTransactionAmount(String value){
//      UIThreadManager.getBrowser().type(amount, value);
//    }
//
//    private void typeCheckNumber(String value){
//      UIThreadManager.getBrowser().type(checkNumber, value);
//    }
//
//    private void clickSaveButton(){
//      UIThreadManager.getBrowser().click(saveButton);
//      UIThreadManager.getBrowser().waitForDoesNotExist(formData);
//    }
//
//    public void setShowReversedCheckbox(boolean checked){
//      UIThreadManager.getBrowser().setCheckboxState(showReversedCheckbox, checked);
//    }
//
//    public String getPostDate(){
//      return UIThreadManager.getBrowser().getAttribute(postDate, "value");
//    }
//
//    public void addTransactionToUser(String transType, String amount, String checkNum){
//      addTransaction();
//      selectTransactionType(transType);
//      typeTransactionAmount(amount);
//      typeCheckNumber(checkNum);
//      clickSaveButton();
//    }


  }
