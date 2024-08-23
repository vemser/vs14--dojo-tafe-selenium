package automationexercise.test;

import automationexercise.dto.*;
import automationexercise.factory.data.*;
import automationexercise.factory.selenium.*;
import automationexercise.page.*;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static storys.LoginStory.CE_LOGIN_01;

public class HomeTest extends BaseTest{

    LoginPage loginPage = new LoginPage();
    Validation validation = new Validation();
    LoginData loginData = new LoginData();
    HomePage homePage = new HomePage();

    @Test
    @Description(CE_LOGIN_01)
    public void testValidarHeaderClaim(){
        loginPage.fazerLogin("Admin", "admin123");
        homePage.clicarBotaoClaim();
        String msgm = homePage.validarBtnTextClaim();
        validation.validateText(msgm,"Claim");
    }

    @Test
    @Description(CE_LOGIN_01)
    public void testValidarHeaderAdmin(){
        loginPage.fazerLogin("Admin", "admin123");
        homePage.clicarBotaoAdmin();
        String msgm = homePage.pegarTextoHeaderAdmin();
        validation.validateText(msgm,"Admin");
    }

    @Test
    @Description(CE_LOGIN_01)
    public void testValidarHeaderByzz(){
        loginPage.fazerLogin("Admin", "admin123");
        homePage.clickHeaderBuzz();
        String msgm = homePage.validarTextoBuzz();
        validation.validateText("Buzz", msgm);
    }



}
