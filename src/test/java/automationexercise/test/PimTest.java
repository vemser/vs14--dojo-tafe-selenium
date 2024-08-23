package automationexercise.test;

import automationexercise.factory.data.LoginData;
import automationexercise.factory.selenium.Validation;
import automationexercise.page.HomePage;
import automationexercise.page.LoginPage;
import automationexercise.page.PimPage;
import org.junit.jupiter.api.Test;

public class PimTest extends BaseTest {


    LoginPage loginPage = new LoginPage();
    Validation validation = new Validation();
    LoginData loginData = new LoginData();
    HomePage homePage = new HomePage();
    PimPage pimPage = new PimPage();

    @Test
    public void testValidaCadastroEmpregado() {
        loginPage.fazerLogin("Admin", "admin123");
        pimPage.addUsuario();







    }

}
