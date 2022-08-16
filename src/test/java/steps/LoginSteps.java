package steps;

import cucumber.api.java.es.Dado;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que acesso a tela de login$")
    public void que_acesso_a_tela_de_login() {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessScreenLogin();

    }

    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario() {
        loginPage.fillEmailCreate();
        loginPage.clickCreateAnAccount();

    }
}
