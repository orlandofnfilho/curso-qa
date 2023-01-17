package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;

public class UserSteps {

    private Home home = new Home();
    private MenuHome menu = new MenuHome();
    private UsersGrid usersGrid = new UsersGrid();
    private UsersCreate usersCreate = new UsersCreate();

    @Dado("que o usuário está no sistema Agapito Server")
    public void queOUsuarioEstaNoSistemaAgapitoServer() {
        home.openPage();
    }

    @E("o usuário escolhe o menu Usuarios")
    public void oUsuarioEscolheOMenuUsuarios() {
        menu.clickUser();
    }

    @E("o usuário clica no botão novo usuário")
    public void oUsuarioClicaEmNovoUsuario() {
        usersGrid.clickNewUser();
    }

    @E("o usuário preenche o campo {string} com {string}")
    public void oUsuarioPreencheOCampoCom(String field, String value) throws InterruptedException {
        usersCreate.fillField(field, value);
    }

    @Quando("o usuário clicar em salvar")
    public void oUsuarioClicarEmSalvar() {
        usersCreate.clickSave();
        usersCreate.setLastUser(usersShow.getCode());
    }

    private final UsersShow usersShow = new UsersShow();

    @Então("o usuário deveria ver a mensagem {string}")
    public void oUsuarioDeveriaVerAMensagem(String message) {
        Assert.assertEquals(message,usersShow.getNotice());
    }


    @E("o usuário clicar em voltar")
    public void oUsuarioClicarEmVoltar() {
        usersShow.clickBack();
    }



    @Então("o usuário deveria ver {string} com {string}")
    public void oUsuarioDeveriaVerCom(String field, String value) {
        String act = usersShow.fillField(field);
        Assert.assertEquals(value,act);
    }

    @Quando("o usuário consultar o último cadastro")
    public void oUsuarioConsultarOUltimoCadastro() {
        usersGrid.clickShowUser(usersCreate.getLastUser());
    }
}

