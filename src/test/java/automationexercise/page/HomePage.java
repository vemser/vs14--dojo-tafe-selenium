package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class HomePage extends Interactions {
    private static final By btnClaim = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(11) > a > span");

    private static final By btnAdmin = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(1) > a > span");

    private static final By btnAdd = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-header-container > button");

    private static final By headerAdmin = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6.oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");

    private static final By headerBuzz = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(12) > a");

    private static final By headerClaim = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-title > span > h6");

    private static final By btnDropDownAccount = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > i");

    private static final By btnLogout = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-navigation > header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > ul > li:nth-child(4) > a");



    public void clicarBotaoDropDownAccount () {
        click(btnDropDownAccount);
    }

    public void clicarBotaoLogout () {
        click(btnLogout);
    }

    public void clicarBotaoClaim (){
        click(btnClaim);
    }

    public void clicarBotaoAdmin(){
        click(btnAdmin);
    }

    public void clicarBotaoAdd(){
        click(btnAdd);
    }

    public void clickHeaderBuzz(){
        click(headerBuzz);
    }
    public void clickHeaderClaim(){
        click(headerClaim);
    }


    public String validarTextoBuzz(){
        return  lerTexto(headerBuzz);

    }
     public String validarTextoClaim(){
        return lerTexto(headerClaim);
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
