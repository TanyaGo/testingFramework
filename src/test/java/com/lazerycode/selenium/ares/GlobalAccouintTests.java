package com.lazerycode.selenium.ares;

public class GlobalAccouintTests {
//  public class GlobalBankAccountTests extends BaseUITest {
//    private ServicingDashboardPage dbPage;
//
//    @BeforeEach
//    private void login() throws Exception {
//      dbPage = Pages.CommonPages.Login.loginToServicingPage(hostAndPort);
//      Wait.For("Didn't ever make it to dashboard page.", dbPage::isCurrentStep);
//    }
//
//    private void goToOneTimePaymentTab(String query, String loanId) {
//      ServicingCustomerSummaryPage customerSummaryPage = dbPage.searchForBorrower(query);
//      NotesTab notesTab = customerSummaryPage.clickNotesTab();
//      LoanTabPanel loanTabPanel = notesTab.clickCustomerLoanLink();
//      OneTimePaymentsTab oneTimePaymentsTab = loanTabPanel.clickOneTimePaymentsTab();
//      oneTimePaymentsTab.clickBankAccountsTab();
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that user successfully added bank account",
//            component = "Servicing UI",
//            feature = "Added account with nickname shopping is shown on the bank account page ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 20", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-20 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see new added account")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void addNewBankAccount() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:20", "20");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "345345346", "Shopping");
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("Shopping"), "Account is not added");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that user successfully removed bank account",
//            component = "Servicing UI",
//            feature = "Removed account should not be shown on the page ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 20", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-20 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see new added account"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see Add New Payment button"),
//                    @Step(step = "Click on Add New Payment", expectation = "We should see the form"),
//                    @Step(step = "Click on Select existing account (optional) dropdown", expectation = "We should see a list with accounts and Remove an account button"),
//                    @Step(step = "Click on Remove an account button", expectation = "We should new pop up window with accounts"),
//                    @Step(step = "Click on needed radio button amd then on remove an account button", expectation = "the form disappear"),
//                    @Step(step = "Click on loan Bank Account ta", expectation = "We should not see removed account in the list with accounts ")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void removeNewBankAccountFromOneTimePaymentTab() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:20", "20");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147156", "For Test1");
//      oneTimePaymentsTab.clickOneTimePaymentsTab();
//      oneTimePaymentsTab.clickAddNewOneTimePayment();
//      oneTimePaymentsTab.selectExistingAccount("Remove an Account");
//      oneTimePaymentsTab.selectAccountToBeRemoved("For Test1");
//      oneTimePaymentsTab.clickRemoveBankAccountButtonOTP();
//      oneTimePaymentsTab.clickBankAccountsTab();
//      Assert.assertFalse(oneTimePaymentsTab.isNicknameShown("For Test1"), "Account is not removed");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not allow to save two accounts with the same nickname",
//            component = "Servicing UI",
//            feature = "Preventing accounts with the same nicknames ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 25", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-25 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should new added account"),
//                    @Step(step = "Add an account with the same nickname as borrower already has but different account credentials,Account Type Should Be The Same  ", expectation = "System will give error")
//
//            },
//            author = "tshcherbyna")
//    @Test
//    public void preventAccountWithTheSameNicknames() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:25", "25");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147156", "For Test1");
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147155", "For Test1");
//      Assert.assertTrue(oneTimePaymentsTab.isErrorAnotherAccountWithThisNicknameAlreadyExistsShown("Another active account with this nickname already exists. Please choose a different nickname."), "Error is not shown");
//
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not allow to add bank account that user already has ",
//            component = "Servicing UI",
//            feature = "Preventing from adding the same bank account but different nicknames ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 22", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-22 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see new added account"),
//                    @Step(step = "Add an account with the same account number as borrower already has but different nickname,account type should be the same  ", expectation = "System will give error")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void preventAddingExistingBankAccountWithDifferentNickname() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:22", "22");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147156", "For Test1");
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147156", "For Test2");
//      Assert.assertTrue(oneTimePaymentsTab.isErrorAccountAlreadySavedShown("errorMessage: This account is already saved as"), "Error is not shown");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not allow to add a bank account with invalid routing number ",
//            component = "Servicing UI",
//            feature = "Preventing from adding bank account with invalid routing number ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 21", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-21 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill out all needed form with invalid routing number ", expectation = "We should error")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void preventAddingAccountWithInvalidRoutingNumber() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:21", "21");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123125", "147147156", "Testing");
//      Assert.assertTrue(oneTimePaymentsTab.isErrorRoutingNumberInvalidShown("routingNumber: [\"Routing number is invalid\"]"), "Error is not shown");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that user can remove bank account from Bank Accounts tab ",
//            component = "Servicing UI",
//            feature = "Account can be deleted ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 19", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-19 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Click on save if all files are filled out", expectation = "We should see new added account"),
//                    @Step(step = "Click on remove sign", expectation = "Verify that account was deleted")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void removeNewBankAccountFromBankAccountsTab() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:19", "19");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147156", "Testing");
//      oneTimePaymentsTab.clickOnRemoveBankAccountButton();
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("Testing"), "Account is not removed");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not allow to add an account with AutoPay nickname ",
//            component = "Servicing UI",
//            feature = "Preventing from adding an account with AutoPay nickname ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 15", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-15 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill all required forms and set Nickname as Autopay click on save", expectation = "We should see error message")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void preventAddingAccountWithAutoPayNickname() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:15", "15");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147156", "AutoPay");
//      Assert.assertTrue(oneTimePaymentsTab.isErrorNicknameCannotBeAutoPayShown("errorMessage: Nickname cannot be AutoPay"), "Error is not shown");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not allow to add an account with autoPay nickname ",
//            component = "Servicing UI",
//            feature = "Preventing from adding an account with autoPay nickname ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 15", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-15 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill all required forms and set Nickname as autopay click on save", expectation = "We should see error message")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void preventAddingAccountWithAutoPayNicknameLowerCase() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:15", "15");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "147147156", "autoPay");
//      Assert.assertTrue(oneTimePaymentsTab.isErrorNicknameCannotBeAutoPayShown("errorMessage: Nickname cannot be autoPay"), "Error is not shown");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not allow saving the same account/routing with a different nickname unless account type is different ",
//            component = "Servicing UI",
//            feature = "Preventing from adding account with the same credentials ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 15", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-15 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill all required forms and click on save", expectation = "We should see added account"),
//                    @Step(step = "Add another account with the same credentials but different account type and different nickname ", expectation = "Account will be added"),
//            },
//            author = "tshcherbyna")
//    @Test
//    public void preventAddingAccountWithTheSameAccountCredentialsUnlessTypeIsDifferent() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:15", "15");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "45678", "My Account");
//      oneTimePaymentsTab.addNewBankAccountProcess("Saving", "Shirley Bartak", "123123123", "45678", "Shopping");
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("My Account"), "Account is not added");
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("Shopping"), "Account is not added");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will allow to add an account as Refund account ",
//            component = "Servicing UI",
//            feature = "Adding Refund Account ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 15", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-15 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill all required forms, set refund checkbox and click on save", expectation = "Account with nickname refund will be saved")
//            },
//            author = "tshcherbyna")
//    @Test
//    public void userIsAbleToAddAccountAsRefundAccount() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:15", "15");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcessWithRefundCheckbox("Checking", "Shirley Bartak", "123123123", "123456");
//      oneTimePaymentsTab.setRefundAccountCheckbox();
//      oneTimePaymentsTab.clickOnSaveAccountButton();
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("REFUND"), "Account is not added");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not allow to add an account that already exists as refund account ",
//            component = "Servicing UI",
//            feature = "Preventing from adding account with the same credentials ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 16", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-16 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill out all required forms and click on save", expectation = "Account will be saved"),
//                    @Step(step = "Add another account with the same credentials as refund account", expectation = "System will give error"),
//            },
//            author = "tshcherbyna")
//    @Test
//    public void userIsNotAllowedToAddAccountThatAlreadyExistsAsRefundAccount() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:16", "16");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "123456", "TestingAccount");
//      oneTimePaymentsTab.addNewBankAccountProcessWithRefundCheckbox("Checking", "Shirley Bartak", "123123123", "123456");
//      oneTimePaymentsTab.setRefundAccountCheckbox();
//      oneTimePaymentsTab.clickOnSaveAccountButton();
//      Assert.assertTrue(oneTimePaymentsTab.isErrorAccountAlreadySavedShown("errorMessage: This account is already saved as"), "Error is not shown");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will allow to add an account with the same credentials if account is added my different parties ",
//            component = "Servicing UI",
//            feature = "Preventing from adding account with the same credentials ",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 134", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-134 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill out all required forms and click on save", expectation = "Account will be saved"),
//                    @Step(step = "Go on co-borrower page and add an account with the same credentials but different Nickname", expectation = "System will allow to save account"),
//            },
//            author = "tshcherbyna")
//    @Test
//    public void abilityToAddAnAccountWithTheSameCredentialsForCoBorrowerLoan() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:134", "134");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "123456", "TestingAccount");
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("TestingAccount"), "Account is not shown");
//      goToOneTimePaymentTab("party:134", "134");
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "123456", "My Account");
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("My Account"), "Account is not shown");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that system will not show Refund Account checkbox on 'saved accounts'",
//            component = "Servicing UI",
//            feature = "User cannot set 'saved account' to REFUND account",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 2", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-2 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill out all required forms and click on save", expectation = "Account will be saved"),
//                    @Step(step = "Click on edit button", expectation = "Refund account checkbox will be hidded"),
//            },
//            author = "tshcherbyna")
//    @Test
//    public void refundCheckboxShouldBeHiddenOnSavedAccounts() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:2", "2");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcess("Checking", "Shirley Bartak", "123123123", "123456098", "Shirleys Account");
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("Shirleys Account"), "Account is not shown");
//      oneTimePaymentsTab.clickOnEditBankAccountButton();
//      Assert.assertFalse(oneTimePaymentsTab.isThisRefundAccountCheckboxShown(), "Checkbox is shown");
//    }
//
//    @TestCaseInfo(
//            purpose = "Verify that after refund account was moved to 'saved accounts' system will not show Refund Account checkbox ",
//            component = "Servicing UI",
//            feature = "User cannot set 'saved account' to REFUND account",
//            steps = {
//                    @Step(step = "Login to servicing UI", expectation = "Verify we should get to the servicing UI dashboard"),
//                    @Step(step = "Find loan 9", expectation = "We should see loan page "),
//                    @Step(step = "Click on PL-9 link", expectation = "We should see general loan page"),
//                    @Step(step = "Click on One Time Payments tab ", expectation = "We should see 4 tabs on One Time Payments Tab "),
//                    @Step(step = "Click on loan Bank Account tab", expectation = "We should see Add New Bank Account button"),
//                    @Step(step = "Click on Add New Bank Account button", expectation = "We should see a form to fill out"),
//                    @Step(step = "Fill out all required forms, click on Refund Account checkbox and click on save", expectation = "Account will be saved as refund"),
//                    @Step(step = "Click on edit button", expectation = "Refund account checkbox still checked"),
//                    @Step(step = "Uncheck Refund checkbox", expectation = "Nickname field will pop up"),
//                    @Step(step = "Change nickname and save", expectation = "Account with new nickname is saved"),
//                    @Step(step = "Click on edit button", expectation = "Refund account checkbox is hidden")
//
//            },
//            author = "tshcherbyna")
//    @Test
//    public void verifyRefundCheckboxIsHiddenOnSavedAccountsAfterAccountSwitchedFromRefundToSaved() throws Exception {
//      OneTimePaymentsTab oneTimePaymentsTab = new OneTimePaymentsTab();
//      goToOneTimePaymentTab("loan:9", "9");
//      oneTimePaymentsTab.clickBankAccountsTab();
//      oneTimePaymentsTab.addNewBankAccountProcessWithRefundCheckbox("Checking", "Shirley Bartak", "123123123", "123456098");
//      oneTimePaymentsTab.setRefundAccountCheckbox();
//      oneTimePaymentsTab.clickOnSaveAccountButton();
//      Assert.assertTrue(oneTimePaymentsTab.isNicknameShown("REFUND"), "Account is not shown");
//      oneTimePaymentsTab.clickOnEditBankAccountButton();
//      oneTimePaymentsTab.setRefundAccountCheckbox();
//      oneTimePaymentsTab.clearNickNameField();
//      oneTimePaymentsTab.typeNickname("My new Account");
//      oneTimePaymentsTab.clickOnSaveAccountButton();
//      oneTimePaymentsTab.clickOnEditBankAccountButton();
//      Assert.assertFalse(oneTimePaymentsTab.isThisRefundAccountCheckboxShown(), "Checkbox is shown");
    }

