package automationexercise.test;

import automationexercise.dto.LoginDto;
import automationexercise.factory.data.LoginData;
import automationexercise.factory.selenium.Validation;
import automationexercise.page.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import static storys.LoginStory.*;

@Epic(EPIC)
@Story(USER_STORY_LOGIN)
public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    LoginData loginData = new LoginData();
    Validation validation = new Validation();

    @Test
    @Description(CE_LOGIN_01)
    public void test1validarLoginDadosValidos(){
        LoginDto usu =  loginData.loginDadosValidos();     // <- Gerando massa de dados
        loginPage.preencherCampoUsername(usu.getUsername());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();
        String msgm = loginPage.validarTextoBtnAposLogin();
        validation.validateText(msgm,"Dashboard");
    }

    @Test
    @Description(CE_LOGIN_02)
    public void test2validarLoginDadosInvalidos(){
        LoginDto usu =  loginData.LoginDadoDinamicos();
        loginPage.preencherCampoUsername(usu.getUsername());
        loginPage.preencherCampoSenha(usu.getSenha());
        loginPage.clicarBtnAcessar();
        String msgm = loginPage.validarMsgmEmailIncorreto();
        validation.validateText(msgm,"Invalid credentials");
    }


    @Test
    @Description(CE_LOGIN_03)
    public void test3validarLoginComCampoEmBranco(){
        loginPage.clicarBtnAcessar();
        String msgm1 = loginPage.validarTxtEMBranco1();
        String msgm2 = loginPage.validarTxtEMBranco2();
        validation.validateText(msgm1,"Required");
        validation.validateText(msgm2,"Required");
    }

    /*

    @Test
    @Description(CE_LOGIN_04)
    public void test4validarLoginDadosInvalidos(){
        LoginDto usu =  loginData.LoginDadoDinamicos();
        String msgm = loginPage.loginEmailIncorreto(usu.getEmail(), usu.getSenha());
        validation.validateText(msgm,"Your email or password is incorrect!");
    }*/


}
