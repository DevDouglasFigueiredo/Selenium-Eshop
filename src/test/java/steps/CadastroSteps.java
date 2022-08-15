package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {


CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro()  {
        cadastroPage.selectTitle(1);
        cadastroPage.fillName("Douglas");
        cadastroPage.fillLastName("Figueiredo");
        cadastroPage.fillPassword("11223344");
        cadastroPage.birthDate(22, 06, "1988");
        cadastroPage.fillAddress("rua da palhoça");
        cadastroPage.fillCity("palhoça");
        cadastroPage.fillState("Colorado");
        cadastroPage.fillPostcode("88132");
        cadastroPage.fillPhone("+5548996356396");
        cadastroPage.clickRegister();


    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar()  {

    }

    @Então("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso()  {

    }
}
