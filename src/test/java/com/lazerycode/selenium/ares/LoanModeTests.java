package com.lazerycode.selenium.ares;

public class LoanModeTests {
//  public class LoanModTests extends BaseUITest {
//    private ServicingDashboardPage dbPage;
//
//    @BeforeEach
//    private void login() throws Exception {
//      dbPage = Pages.CommonPages.Login.loginToServicingPage(hostAndPort);
//      Wait.For("Didn't ever make it to dashboard page.", dbPage::isCurrentStep);
//    }
//
//    private void runEligibilityCheck (String query,String loanId) {
//      ServicingCustomerSummaryPage customerSummaryPage = dbPage.searchForBorrower(query);
//      NotesTab notesTab = customerSummaryPage.clickNotesTab();
//      LoanTabPanel loanTabPanel = notesTab.clickCustomerLoanLink();
//      LoanModificationsTab loanModificationsTab = loanTabPanel.clickLoanModificationsTab();
//      loanModificationsTab.clickCheckEligibilityForLoanModifications();
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully added AdminForb Request",
//            purpose = "Verify ability of adding AdminForb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is pending ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 20", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-20 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Admin Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void addAdminForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:20", "20");
//      AdminTab adminTab = loanModificationsTab.clickAdminApply();
//      adminTab.addAdminForb("Fraud", "2019-10-28");
//
//      Assert.assertTrue(adminTab.isApprovalStatusShown("Pending"), "Status is not Pending");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully added IOForb Request",
//            purpose = "Verify ability of adding IOForb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is pending ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 15", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-15 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for IO Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void addIOForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:15", "15");
//      InterestOnlyTab interestOnlyTab =loanModificationsTab.clickInterestOnlyApply();
//      interestOnlyTab.addIOForb("Income to Debt Ratio", "2019-10-28");
//
//      Assert.assertTrue(interestOnlyTab.isApprovalStatusShown("Pending"), "Status is not Pending");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully added Natural Disaster Request",
//            purpose = "Verify ability of adding  Natural Disaster Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is pending ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 16", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-16 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Natural Disaster Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void addNaturalDisasterForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:16", "16");
//      NaturalDisasterTab naturalDisasterTab = loanModificationsTab.clickNaturalDisasterApply();
//      naturalDisasterTab.addNaturalDisasterForb("Natural Disaster", "2019-09-01", "2019-10-20");
//      Assert.assertTrue(naturalDisasterTab.isApprovalStatusShown("Pending"), "Status is not Pending");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully added Hardship Request",
//            purpose = "Verify ability of adding  Hardship Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is pending ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 17", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-17 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Hardship Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void addHardshipForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:17", "17");
//      HardshipTab hardshipTab = loanModificationsTab.clickHardshipApply();
//      hardshipTab.addHardshipForb("Long Term Medical", "2019-10-25" );
//      Assert.assertTrue(hardshipTab.isApprovalStatusShown("Pending"), "Status is not Pending");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully added One Payment Extension Request",
//            purpose = "Verify ability of adding  One Payment Extension Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is pending ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 21", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-21 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for One Payment Extension", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void addOnePaymentExtensionRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:21", "21");
//      OnePaymentExtensionTab onePaymentExtensionTab = loanModificationsTab.clickOnePaymentApply();
//      onePaymentExtensionTab.addOnePaymentExtensionForb("Reduced Hours", "2019-10-01" );
//      Assert.assertTrue(onePaymentExtensionTab.isApprovalStatusShown("Pending"), "Status is not Pending");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully added Military Request",
//            purpose = "Verify ability of adding Military Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is pending ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 22", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-22 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Military", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void addMilitaryRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:22", "22");
//      MilitaryTab militaryTab = loanModificationsTab.clickMilitaryApply();
//      militaryTab.addMilitaryForb("Military Deployment", "2019-10-25", "2019-10-28" , "3");
//      Assert.assertTrue(militaryTab.isApprovalStatusShown("Pending"), "Status is not Pending");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully approved Admin Forbearance Request",
//            purpose = "Verify ability of approving Admin Forbearance request",
//            component = "Servicing UI",
//            feature = "Status of  forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 26", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-26 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Admin", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request"),
//                    @Step(step = "Click on review button", expectation = "We should see the form for approval"),
//                    @Step(step = "Click on approve request button", expectation = "We should see that system asks us additional time if we are sure to approve"),
//                    @Step(step = "Click on final approve button", expectation = "We should see approved status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void approveAdminForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:26", "26");
//      AdminTab adminTab = loanModificationsTab.clickAdminApply();
//      adminTab.addAdminForb("Fraud", "2019-10-28");
//      loanModificationsTab.clickOnReviewButton();
//      adminTab.approveRequest();
//      Assert.assertTrue(adminTab.isApprovalStatusShown("Approved"), "Status is not Approved");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully approved IO Forbearance Request",
//            purpose = "Verify ability of approving IO Forbearance request",
//            component = "Servicing UI",
//            feature = "Status of  forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 47", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-47 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for IO Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request"),
//                    @Step(step = "Click on review button", expectation = "We should see the form for approval"),
//                    @Step(step = "Click on approve request button", expectation = "We should see that system asks us additional time if we are sure to approve"),
//                    @Step(step = "Click on final approve button", expectation = "We should see approved status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void approveIOForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:47", "47");
//      InterestOnlyTab interestOnlyTab =loanModificationsTab.clickInterestOnlyApply();
//      interestOnlyTab.addIOForb("Income to Debt Ratio", "2019-10-28");
//      loanModificationsTab.clickOnReviewButton();
//      interestOnlyTab.approveIOForbRequest();
//      Assert.assertTrue(interestOnlyTab.isApprovalStatusShown("Approved"), "Status is not Approved");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully approved ND Forbearance Request",
//            purpose = "Verify ability of approving ND Forbearance request",
//            component = "Servicing UI",
//            feature = "Status of  forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 48", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-48 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for ND Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request"),
//                    @Step(step = "Click on review button", expectation = "We should see the form for approval"),
//                    @Step(step = "Click on approve request button", expectation = "We should see that system asks us additional time if we are sure to approve"),
//                    @Step(step = "Click on final approve button", expectation = "We should see approved status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void approveNDForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:48", "48");
//      NaturalDisasterTab naturalDisasterTab = loanModificationsTab.clickNaturalDisasterApply();
//      naturalDisasterTab.addNaturalDisasterForb("Natural Disaster", "2019-09-01", "2019-10-20");
//      loanModificationsTab.clickOnReviewButton();
//      naturalDisasterTab.approveNDForbRequest();
//      Assert.assertTrue(naturalDisasterTab.isApprovalStatusShown("Approved"), "Status is not Approved");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully approved Hardship Request",
//            purpose = "Verify ability of approving  Hardship Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 50", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-50 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Hardship Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request"),
//                    @Step(step = "Click on review button", expectation = "We should see the form for approval"),
//                    @Step(step = "Click on approve request button", expectation = "We should see that system asks us additional time if we are sure to approve"),
//                    @Step(step = "Click on final approve button", expectation = "We should see approved status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void approveHardshipForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:50", "50");
//      HardshipTab hardshipTab = loanModificationsTab.clickHardshipApply();
//      hardshipTab.addHardshipForb("Long Term Medical", "2019-10-25" );
//      loanModificationsTab.clickOnReviewButton();
//      hardshipTab.approveHardshipForbRequest();
//      Assert.assertTrue(hardshipTab.isApprovalStatusShown("Approved"), "Status is not Approved");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully approved Military Request",
//            purpose = "Verify ability of approving  Military Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 55", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-55 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Military Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request"),
//                    @Step(step = "Click on review button", expectation = "We should see the form for approval"),
//                    @Step(step = "Click on approve request button", expectation = "We should see that system asks us additional time if we are sure to approve"),
//                    @Step(step = "Click on final approve button", expectation = "We should see approved status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void approveMilitaryForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:55", "55");
//      MilitaryTab militaryTab = loanModificationsTab.clickMilitaryApply();
//      militaryTab.addMilitaryForb("Military Deployment", "2019-10-25", "2019-10-28" , "3");
//      loanModificationsTab.clickOnReviewButton();
//      militaryTab.approveMilitaryForbRequest();
//      Assert.assertTrue(militaryTab.isApprovalStatusShown("Approved"), "Status is not Approved");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user successfully approved One Payment Extension Request",
//            purpose = "Verify ability of approving  One Payment Extension Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 56", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-56 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for One Payment Extension Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see pending status of Forb request"),
//                    @Step(step = "Click on review button", expectation = "We should see the form for approval"),
//                    @Step(step = "Click on approve request button", expectation = "We should see that system asks us additional time if we are sure to approve"),
//                    @Step(step = "Click on final approve button", expectation = "We should see approved status of Forb request")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void approveOnePaymentExtensionForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:56", "56");
//      OnePaymentExtensionTab onePaymentExtensionTab = loanModificationsTab.clickOnePaymentApply();
//      onePaymentExtensionTab.addOnePaymentExtensionForb("Reduced Hours", "2019-10-28" );
//      loanModificationsTab.clickOnReviewButton();
//      onePaymentExtensionTab.approveOnePaymentExtensionForbRequest();
//      Assert.assertTrue(onePaymentExtensionTab.isApprovalStatusShown("Approved"), "Status is not Approved");
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user will see required fields that should be filled out in order to save Military Request",
//            purpose = "Verify required fields to save Military Forb",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 54", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-54 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Military Forb", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save without filling out all fields", expectation = "We should that 3 fields are required to be filled out in case to save")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void areAllRequiredFieldsShownInMiliratyForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:54", "54");
//      MilitaryTab militaryTab = loanModificationsTab.clickMilitaryApply();
//      militaryTab.clickSaveButton();
//      SoftAssert softAssert = new SoftAssert();
//      softAssert.assertTrue(militaryTab.isReasonForHardshipShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertTrue(militaryTab.isReceivedDateShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertTrue(militaryTab.isForbDurationShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertAll();
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user will see required fields that should be filled out in order to save Natural Disaster Forb. Request",
//            purpose = "Verify required fields to save Natural Disaster Forb.",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 53", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-53 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Natural Disaster Forb.", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save without filling out all fields", expectation = "We should that 3 fields are required to be filled out in case to save")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void areAllRequiredFieldsShownInNaturalDisasterForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:53", "53");
//      NaturalDisasterTab naturalDisasterTab = loanModificationsTab.clickNaturalDisasterApply();
//      naturalDisasterTab.clickSaveButton();
//      SoftAssert softAssert = new SoftAssert();
//      softAssert.assertTrue(naturalDisasterTab.isReasonForHardshipShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertTrue(naturalDisasterTab.isReceivedDateShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertTrue(naturalDisasterTab.isNaturalDisasterDateShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertAll();
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user will see required fields that should be filled out in order to save Administrative Forb. Request",
//            purpose = "Verify required fields to save Administrative Forb.",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 52", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-52 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Administrative Forb.", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save without filling out all fields", expectation = "We should that 2 fields are required to be filled out in case to save")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void areAllRequiredFieldsShownAdministrativeForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:52", "52");
//      AdminTab adminTab = loanModificationsTab.clickAdminApply();
//      adminTab.clickSaveButton();
//      SoftAssert softAssert = new SoftAssert();
//      softAssert.assertTrue(adminTab.isReasonForHardshipShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertTrue(adminTab.isReceivedDateShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertAll();
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user will see required fields that should be filled out in order to save Hardship Forb. Request",
//            purpose = "Verify required fields to save Hardship Forb.",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 51", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-51 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Hardship Forb.", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save without filling out all fields", expectation = "We should that 2 fields are required to be filled out in case to save")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void areAllRequiredFieldsShownHardshipForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:51", "51");
//      HardshipTab hardshipTab = loanModificationsTab.clickHardshipApply();
//      hardshipTab.clickSaveButton();
//      SoftAssert softAssert = new SoftAssert();
//      softAssert.assertTrue(hardshipTab.isReasonForHardshipShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertTrue(hardshipTab.isReceivedDateShownAsRequiredField(),"Isn't shown as required" );
//      softAssert.assertAll();
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user will see required fields that should be filled out in order to save Interest Only Repayment Plan Request",
//            purpose = "Verify required fields to save Interest Only Repayment Plan",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 49", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-49 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for Interest Only Repayment Plan", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save without filling out all fields", expectation = "We should that 2 fields are required to be filled out in case to save")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void areAllRequiredFieldsShownIORepaymentPlanRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:49", "49");
//      InterestOnlyTab interestOnlyTab = loanModificationsTab.clickInterestOnlyApply();
//      interestOnlyTab.clickSaveButton();
//      SoftAssert softAssert = new SoftAssert();
//      softAssert.assertTrue(interestOnlyTab.isReasonForHardshipShownAsRequiredField(), "Isn't shown as required");
//      softAssert.assertTrue(interestOnlyTab.isReceivedDateShownAsRequiredField(), "Isn't shown as required");
//      softAssert.assertAll();
//    }
//
//    @TestCaseInfo(
//            title = "Verify that user will see required fields that should be filled out in order to save One Payment Extension Forb. Request",
//            purpose = "Verify required fields to save One Payment Extension Forb.",
//            component = "Servicing UI",
//            feature = "Status of just added forbearance request is approved ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 46", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-46 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on Loan Modifications ", expectation = "We should see check Loan Eligibility button"),
//                    @Step(step = "Click on loan Mod eligibility button", expectation = "We should see available forb types"),
//                    @Step(step = "Click on Apply button for One Payment Extension Forb.", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save without filling out all fields", expectation = "We should that 2 fields are required to be filled out in case to save")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void areAllRequiredFieldsShownOnePaymentExtensionForbRequest() throws Exception {
//      LoanModificationsTab loanModificationsTab = new LoanModificationsTab();
//      runEligibilityCheck("loan:46", "46");
//      OnePaymentExtensionTab onePaymentExtensionTab = loanModificationsTab.clickOnePaymentApply();
//      onePaymentExtensionTab.clickSaveButton();
//      SoftAssert softAssert = new SoftAssert();
//      softAssert.assertTrue(onePaymentExtensionTab.isReasonForHardshipShownAsRequiredField(), "Isn't shown as required");
//      softAssert.assertTrue(onePaymentExtensionTab.isReceivedDateShownAsRequiredField(), "Isn't shown as required");
//      softAssert.assertAll();
//    }
}
