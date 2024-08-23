package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class HomePage extends Interactions {
    private static final By btnClaim = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(11) > a > span");

    private static final By btnAdmin = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(1) > a > span");

    private static final By btnAdd = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button");

    private static final By headerAdmin = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");

    private static final By headerClaim = By.cssSelector("er > div.oxd-topbar-header-title > span > h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");

    public void clicarBotaoClaim (){
        click(btnClaim);
    }

    public void clicarBotaoAdmin(){
        click(btnAdmin);
    }

    public void clicarBotaoAdd(){
        click(btnAdd);
    }


    public String validarBtnTextClaim(){
        return lerTexto(btnClaim);
    }

    public String validarBtnTextAdm(){
        return lerTexto(btnAdmin);
    }

    public String pegarTextoHeaderAdmin(){
        return lerTexto(headerAdmin);
    }

    public String pegarTextoHeaderClaim(){
        return lerTexto(headerAdmin);
    }




}
