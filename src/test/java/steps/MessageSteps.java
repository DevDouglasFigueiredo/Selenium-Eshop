package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.MessagePage;
import runner.RunCucumberTest;

public class MessageSteps extends RunCucumberTest {

    MessagePage messagePage = new MessagePage();
    @Dado("^que estou na tela da mensagem$")
    public void que_estou_na_tela_da_mensagem() {
        messagePage.acessScreenContact();

    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos()  {
        messagePage.fillSubject("Webmaster");
        messagePage.fillEmailCreate();
        messagePage.fillMessage("minha mensagem");
        messagePage.uploadFile("C:\\Users\\User K2\\OneDrive\\Área de Trabalho\\Douglas Alura\\SeleniumEshopExercicio\\Screenshot_1.png");

    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem()  {
        messagePage.clickToSendMessage();
    }

    @Então("^vejo o feedback de mensagem enviada com sucesso$")
    public void vejo_o_feedback_de_mensagem_enviada_com_sucesso() {
        messagePage.validateMessage();

    }
}
