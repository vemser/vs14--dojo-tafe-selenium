package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class LoginPage extends Interactions {

    private static final By campoEmail =
    By.cssSelector("imput[name=\"username\"]");
    private static final By campoSenha =
    By.cssSelector("imput[name=\"password\"]");
    private static final By btnAcessar =
    By.cssSelector(".orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input");
    private static final By TextMsgmBtn =
    By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6");
    private static final By msgmEmailIncorreto =
    By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p");

    public void preencherCampoEmail(String email){
        sendKeys(campoEmail,email);
    }

    public void preencherCampoSenha(String senha){
        sendKeys(campoSenha,senha);
    }

    public void clicarBtnAcessar(){
        click(btnAcessar);
    }
    public String validarTextoBtnAposLogin(){
        return lerTexto(TextMsgmBtn);
    }
    public String validarMsgmEmailIncorreto(){
        return lerTexto(msgmEmailIncorreto);
    }

    public String fazerLogin(String email, String senha){
        preencherCampoEmail(email);
        preencherCampoSenha(senha);
        click(btnAcessar);
        return lerTexto(TextMsgmBtn);
    }
    public String loginEmailIncorreto(String email, String senha){
        preencherCampoEmail(email);
        preencherCampoSenha(senha);
        click(btnAcessar);
        return lerTexto(msgmEmailIncorreto);
    }
}
