package login;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.ClickLoginButton();
        secureAreaPage.getAlertText();
    }
}
