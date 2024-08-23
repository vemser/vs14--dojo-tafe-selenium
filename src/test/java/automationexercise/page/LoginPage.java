package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class LoginPage extends Interactions {

    private static final By campoEmail =
    By.cssSelector("input[name=\"username\"]");
    private static final By campoSenha =
    By.cssSelector("input[name=\"password\"]");
    private static final By btnAcessar =
    By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button");
    private static final By TextMsgmBtn =
    By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6");
    private static final By msgmEmailIncorreto =
    By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div.oxd-alert.oxd-alert--error > div.oxd-alert-content.oxd-alert-content--error > p");

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
