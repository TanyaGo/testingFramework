package com.lazerycode.selenium.ares;

public class LoanTabPanel {


//    //tab elements
//    private PageElement informationTab = new PageElement("Element for the information tab",FindBy.id("basic"));
//    private PageElement autoPayTab = new PageElement("Element for the autoPay tab",FindBy.id("dpa"));
//    private PageElement commentsTab = new PageElement("Element for the comments tab", FindBy.id("comment"));
//    private PageElement documentsTab = new PageElement("Element for the documents tab", FindBy.id("documents"));
//    private PageElement forbearancesTab = new PageElement("Element for the forbearances tab", FindBy.id("forbearance"));
//    private PageElement loanModificationsTab = new PageElement("Element for the loan modifications tab",FindBy.id("loanmod"));
//    private PageElement termExtensionsTab = new PageElement("Element for the term extensions tab",FindBy.id("termext"));
//    private PageElement oneTimePaymentsTab = new PageElement("Element for the payments tab", FindBy.id("payment"));
//    private PageElement scheduleTab = new PageElement("Element for the schedule tab", FindBy.id("schedule"));
//    private PageElement statementsTab = new PageElement("Element for the statements tab",FindBy.id("statement"));
//    private PageElement communicationTab = new PageElement("Element for the communication tab",FindBy.id("communication"));
//    private PageElement transactionsTab = new PageElement("Element for the transactions tab",FindBy.id("transaction"));
//    private PageElement chargeOffTab = new PageElement("Element for the charge off tab",FindBy.id("chargeoff"));
//
//
//
//    private PageElement panelBody = new PageElement("Element for the panelBody info at the top that has loan info",FindBy.className("panel-body"),1);
//    private PageElement remainingPrincipal = new PageElement("Element for the remaining Principal", (FindBy.xpath("//p[contains(text(),'Remaining Principal')]/preceding-sibling::span")));
//    private PageElement interestRate = new PageElement("Element for the current interest rate", FindBy.xpath("//p[contains(text(),'Current Interest Rate')]/preceding-sibling::span"));
//    private PageElement amountDue = new PageElement("Element for the current amount due",FindBy.xpath("//p[contains(text(),'Next Due Amount')]/preceding-sibling::span"));
//    private PageElement dueDate = new PageElement("Element for the current due date", FindBy.xpath("//p[contains(text(),'Next Due Date')]/preceding-sibling::span"));
//    private PageElement amountDeliquent = new PageElement("Element for the amount delinquent", FindBy.xpath("//p[contains(text(),'Delinquency Amount')]/preceding-sibling::span"));
//    private PageElement remainingPrincipalPaidInFull = new PageElement("paid in full remaining balance element",FindBy.xpath("//p[contains(text(),'Remaining Principal')]/preceding-sibling::span"));
//
//
//    private PageElement customerSummaryLink = new PageElement("Link to take back to customer summary page",FindBy.hrefContains("#/customer/"));
//    private PageElement alerts = new PageElement("Element for alerts on the page",FindBy.cssSelector(".ng-binding.ng-scope.alert-danger"));
//
//    public ServicingCustomerSummaryPage clickCustomerSummaryLink(){
//      UIThreadManager.getBrowser().click(customerSummaryLink);
//      return new ServicingCustomerSummaryPage();
//    }
//
//    public String getAlertText(){
//      UIThreadManager.getBrowser().waitFor(alerts);
//      return UIThreadManager.getBrowser().getText(alerts);
//    }
//
//    public InformationTab clickInformationTab(){
//      UIThreadManager.getBrowser().click(informationTab);
//      return new InformationTab();
//    }
//
//    public AutoPayTab clickAutoPayTab(){
//      UIThreadManager.getBrowser().click(autoPayTab);
//      return new AutoPayTab();
//    }
//
//    public CommentsTab clickCommentsTab(){
//      UIThreadManager.getBrowser().click(commentsTab);
//      return new CommentsTab();
//    }
//
//    public DocumentsTab clickDocumentsTab(){
//      UIThreadManager.getBrowser().click(documentsTab);
//      return new DocumentsTab();
//    }
//
//    public ForbearancesTab clickForbearancesTab(){
//      UIThreadManager.getBrowser().click(forbearancesTab);
//      return new ForbearancesTab();
//    }
//
//    public LoanModificationsTab clickLoanModificationsTab(){
//      UIThreadManager.getBrowser().waitFor(loanModificationsTab);
//      UIThreadManager.getBrowser().click(loanModificationsTab);
//      return new LoanModificationsTab();
//    }
//
//    public TermExtensionsTab clickTermExtensionsTab(){
//      UIThreadManager.getBrowser().click(termExtensionsTab);
//      return new TermExtensionsTab();
//    }
//
//    public OneTimePaymentsTab clickOneTimePaymentsTab(){
//      UIThreadManager.getBrowser().waitFor(oneTimePaymentsTab);
//      UIThreadManager.getBrowser().click(oneTimePaymentsTab);
//      return new OneTimePaymentsTab();
//    }
//
//    public ScheduleTab clickScheduleTab(){
//      UIThreadManager.getBrowser().click(scheduleTab);
//      return new ScheduleTab();
//    }
//
//    public StatementsTab clickStatementsTab(){
//      UIThreadManager.getBrowser().click(statementsTab);
//      return new StatementsTab();
//    }
//
//    public CommunicationTab clickCommunicationTab(){
//      UIThreadManager.getBrowser().click(communicationTab);
//      return new CommunicationTab();
//    }
//
//    public TransactionsTab clickTransactionsTab(){
//      UIThreadManager.getBrowser().click(transactionsTab);
//      return new TransactionsTab();
//    }
//
//    public ChargeOffTab clickChargeOffTab(){
//      UIThreadManager.getBrowser().click(chargeOffTab);
//      return new ChargeOffTab();
//    }
//
//    public InformationTab getInformationTab(){
//      return new InformationTab();
//    }
//
//    public ForbearancesTab getForbearancesTab() { return new ForbearancesTab(); }
//
//    public TransactionsTab getTransactionsTab() { return new TransactionsTab(); }
//
//    public ChargeOffTab getChargeOffTab() { return new ChargeOffTab(); }
//
//    public String getRemainingPrincipal(){
//      return UIThreadManager.getBrowser().getText(remainingPrincipal);
//    }
//
//    public String getRemaningPrincipalPaidInFull(){
//      return UIThreadManager.getBrowser().getText(remainingPrincipalPaidInFull);
//    }
//
//    public String getCurrentInterestRate(){
//      return UIThreadManager.getBrowser().getText(interestRate);
//    }
//
//    public String getCurrentAmountDue(){
//      return UIThreadManager.getBrowser().getText(amountDue);
//    }
//
//    public String getDueDate(){
//      return UIThreadManager.getBrowser().getText(dueDate);
//    }
//
//    public String getDeliquentAmount(){
//      return UIThreadManager.getBrowser().getText(amountDeliquent);
//    }
//
//    public boolean isUserDeliquent(){
//      return UIThreadManager.getBrowser().getText(amountDeliquent) != "$0.00";
//    }
//
//    public String getLoanId() {
//      String parts[] = UIThreadManager.getBrowser().getPageUrl().split("loan/");
//      return parts[1];
//    }
}
