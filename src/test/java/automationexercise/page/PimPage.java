package automationexercise.page;

import automationexercise.factory.selenium.Interactions;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.cssSelector;

public class PimPage extends Interactions {


    private static final By btnPim = cssSelector("nav > div.oxd-sidepanel-body > ul > li:nth-child(2) > a");
    private static final By btnAdd = cssSelector("div.orangehrm-paper-container > div.orangehrm-header-container > button");
    private static final By firstName = cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input");
    private static final By middleName = cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(2) > div:nth-child(2) > input");
    private static final By lastName = cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(3) > div:nth-child(2) > input");
    private static final By btnDetails = cssSelector("input[type=checkbox]");
    private static final By username = cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.orangehrm-employee-container > div.orangehrm-employee-form > div:nth-child(4) > div > div:nth-child(1) > div > div:nth-child(2) > input");



    public void clicarBtnPim() {click(btnPim);}
    public void clicarBtnAdd() {click(btnAdd);}
    public void addFirstName() {
        sendKeys(firstName, "Victor");
    }

    public void addMiddleName() {
        sendKeys(middleName, "Prudente");
    }

    public void addLastName() {
        sendKeys(lastName, "Maciel");
    }

    public void clicarBtnDetails() {
        click(btnDetails);
    }

    public void addUsername() {

    }


    public void addUsuario() {
        clicarBtnPim();
        clicarBtnAdd();
        addFirstName();
        addMiddleName();
        addLastName();
        clicarBtnDetails();
    }

    public void preencher() {}

}
