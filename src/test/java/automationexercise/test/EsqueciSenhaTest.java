package automationexercise.test;

import automationexercise.dto.LoginDto;
import automationexercise.factory.data.LoginData;
import automationexercise.factory.selenium.Validation;
import automationexercise.page.EsqueciSenhaPage;
import automationexercise.page.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import static storys.LoginStory.*;

@Epic(EPIC)
@Story(USER_STORY_LOGIN)
public class EsqueciSenhaTest extends BaseTest {

    EsqueciSenhaPage esqueciSenhaPage = new EsqueciSenhaPage();
    LoginData loginData = new LoginData();
    Validation validation = new Validation();

    @Test
    @Description(CE_LOGIN_01)
    public void test1validarEsqueciSenhaDadosValidos(){
        LoginDto usu =  loginData.loginDadosValidos();     // <- Gerando massa de dados
        String msgm = esqueciSenhaPage.fazerReset(usu.getUsername());
        validation.validateText(msgm,"Reset Password link sent successfully");
    }

    @Test
    @Description(CE_LOGIN_03)
    public void test3validarEsqueciSenhaEmBranco(){
        String msgm = esqueciSenhaPage.fazerResetVazio();
        validation.validateText(msgm,"Required");
    }



    /*

    @Test
    @Description(CE_LOGIN_04)
    public void test4validarLoginDadosInvalidos(){
        LoginDto usu =  loginData.LoginDadoDinamicos();
        String msgm = esqueciSenhaPage.loginEmailIncorreto(usu.getEmail(), usu.getSenha());
        validation.validateText(msgm,"Your email or password is incorrect!");
    }*/


}
