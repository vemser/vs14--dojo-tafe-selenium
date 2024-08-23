package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

public class PimPage extends Interactions {


    private static final By btnPim = By.cssSelector("nav > div.oxd-sidepanel-body > ul > li:nth-child(2) > a");
    private static final By btnAdd = By.cssSelector("div.orangehrm-paper-container > div.orangehrm-header-container > button");
    private static final By btnAdd = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input");
    private static final By btnAdd = By.cssSelector();
    private static final By btnAdd = By.cssSelector();
    private static final By btnAdd = By.cssSelector();


    public void clicarBtnPim() {click(btnPim);}
    public void clicarBtnAdd() {click(btnAdd);}


    public void addUsuario() {
        clicarBtnPim();
        clicarBtnAdd();
    }

    public void preencher() {}

}
