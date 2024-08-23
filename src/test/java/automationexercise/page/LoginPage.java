package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class LoginPage extends Interactions {

    private static final By campoUsername =
    By.cssSelector("input[name=\"username\"]");
    private static final By campoSenha =
    By.cssSelector("input[name=\"password\"]");
    private static final By btnAcessar =
    By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button");
    private static final By TextMsgmBtn =
    By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6");
    private static final By msgmUsernameIncorreto=
    By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > div > div.oxd-alert.oxd-alert--error > div.oxd-alert-content.oxd-alert-content--error > p");
    private static final By txtEmBranco1 = By.cssSelector("div:nth-child(2) > div > span");
    private static final By txtEmBranco2 = By.cssSelector("div:nth-child(3) > div > span");

    private static final By btnResetSenha = By.cssSelector(".orangehrm-login-forgot p");
    private static final By txtEmBranco2 = By.cssSelector("div:nth-child(3) > div > span");
    private static final By txtEmBranco2 = By.cssSelector("div:nth-child(3) > div > span");


    public void preencherCampoUsername(String username){
        sendKeys(campoUsername,username);
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
        return lerTexto(msgmUsernameIncorreto);
    }
    public String validarTxtEMBranco1(){
        return lerTexto(txtEmBranco1);
    }
    public String validarTxtEMBranco2(){
        return lerTexto(txtEmBranco2);
    }


    public String fazerLogin(String username, String senha){
        preencherCampoUsername(username);
        preencherCampoSenha(senha);
        click(btnAcessar);
        return lerTexto(TextMsgmBtn);
    }



    public String loginEmailIncorreto(String username, String senha){
        preencherCampoUsername(username);
        preencherCampoSenha(senha);
        click(btnAcessar);
        return lerTexto(msgmUsernameIncorreto);
    }
}
