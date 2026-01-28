package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.jupiter.api.Assertions;
import pages.AuthPage;
import support.Utils;

import static hooks.Hooks.driver;

public class AuthSteps {

    AuthPage authpage = new AuthPage(driver);
    Utils utils = new Utils(driver);

    @Dado("que o usuario acessa a pagina de login")
    public void que_o_usuario_acessa_a_pagina_de_login() {
        authpage.accessLoginScreen();
    }

    @Quando("informa email e senha validos")
    public void informa_email_e_senha_validos() {
        authpage.fillLoginEmail();
        authpage.fillLoginPassword();
    }
    @Quando("confirma o login")
    public void confirma_o_login() {
        authpage.clickLoginButton();
    }
    @Entao("o sistema deve exibir o usuario logado com seu nome")
    public void o_sistema_deve_exibir_o_usuario_logado_com_seu_nome() {
        utils.waitElementBePresent(authpage.loggedMessage ,10);
        String actualLoggedUser = authpage.getLoggedUserText();
        Assertions.assertEquals("Logged in as João da Silva",
                actualLoggedUser,
                "O nome exibido após o login não condiz com o esperado!");

    }
}
