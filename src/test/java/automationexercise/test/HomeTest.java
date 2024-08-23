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
        LoginDto usu =  loginData.loginDadosValidos();     // <- Gerando massa de dados
        loginPage.preencherCampoUsername(usu.getUsername());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();
        homePage.clicarBotaoClaim();
        String msgm = homePage.validarBtnTextAdm();
        validation.validateText(msgm,"Claim");
    }

    @Test
    @Description(CE_LOGIN_01)
    public void testValidarHeaderAdmin(){
        LoginDto usu =  loginData.loginDadosValidos();     // <- Gerando massa de dados
        loginPage.preencherCampoUsername(usu.getUsername());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();
        homePage.clicarBotaoClaim();
        String msgm = homePage.validarTextoBtnAposLogin();
        validation.validateText(msgm,"Claim");
    }
}
