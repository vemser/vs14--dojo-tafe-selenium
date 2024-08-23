package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class EsqueciSenhaPage extends Interactions {

    private static final By btnResetSenha = By.cssSelector(".orangehrm-login-forgot p");
    private static final By campoUsername = By.cssSelector("input[name=\"username\"]");
    private static final By btnEnviarReset = By.cssSelector("button[type=\"submit\"]");
    private static final By textCampoRequerido = By.cssSelector("span");
    private static final By textSucesso = By.cssSelector("h6.orangehrm-forgot-password-title");


    public void preencherCampoUsername(String username){
        sendKeys(campoUsername,username);
    }

    public void clicarBtnResetSenha(){
        click(btnResetSenha);
    }

    public void clicarBtnEnviarReset(){
        click(btnEnviarReset);
    }

    public String validarMsgmEmailIncorreto(){
        return lerTexto();
    }

    public String validarTxtEMBranco(){
        return lerTexto(textCampoRequerido);
    }

    public String fazerReset(String username){
        click(btnResetSenha);
        preencherCampoUsername(username);
        click(btnEnviarReset);
        return lerTexto(textSucesso);
    }

    public String fazerResetVazio(){
        click(btnResetSenha);
        click(btnEnviarReset);
        return lerTexto(textCampoRequerido);
    }
}
