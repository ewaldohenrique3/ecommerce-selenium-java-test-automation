package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pages.AuthPage;
import static hooks.Hooks.driver;

public class AuthSteps {

    AuthPage authpage = new AuthPage(driver);

    @Dado("que o usuario acessa a pagina de login")
    public void que_o_usuario_acessa_a_pagina_de_login() {
        authpage.acessLoginScreen();
    }

    @Quando("informa email e senha válidos")
    public void informa_email_e_senha_válidos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("confirma o login")
    public void confirma_o_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("o sistema deve exibir o usuário logado com seu nome")
    public void o_sistema_deve_exibir_o_usuário_logado_com_seu_nome() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
