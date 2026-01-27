package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.AccountInformationPage;
import pages.AuthPage;
import support.Utils;
import static hooks.Hooks.driver;

public class AccountInformationSteps{

    AuthPage authpage = new AuthPage(driver);
    AccountInformationPage accountInformationPage = new AccountInformationPage(driver);
    Utils utils = new Utils(driver);

    @Dado("que o usuario acessa a pagina de cadastro")
    public void que_o_usuario_acessa_a_pagina_de_cadastro() {
        authpage.acessLoginScreen();
    }

    @Quando("informa nome e email validos")
    public void informa_nome_e_email_validos() {
        authpage.fillEmailCreate();
        authpage.fillNameCreate("Jonh Embaixadinha");
        authpage.clickSignupButton();
    }
    @Quando("preenche os dados obrigatorios para criacao da conta")
    public void preenche_os_dos_obrigatorios_para_criacao_da_conta() {
        utils.waitElementBePresent(By.id("id_gender1"),10);
        accountInformationPage.selectGender(1);
        accountInformationPage.fillFirstNameInput("Jonh");
        accountInformationPage.fillLastNameInput("Embaixadinha");
        accountInformationPage.fillPasswordInput("123456");
        accountInformationPage.selectDateBirth("28","7","2000");
        accountInformationPage.fillCompanyInput("QAZANDO");
        accountInformationPage.fillAddressInput("Automated Test Street, 123");
        accountInformationPage.selectCountry("United States");
        accountInformationPage.fillStateInput("Florida (FL)");
        accountInformationPage.fillCityInput("Miami");
        accountInformationPage.fillZipcodeInput("33101");
        accountInformationPage.fillMobileNumberInput("(305) 692-1847");
    }
    @Quando("confirma a criacao da conta")
    public void confirma_a_criacao_da_conta() {
        accountInformationPage.clickCreateAccountButton();
    }

    @Entao("o sistema deve exibir a mensagem de conta criada com sucesso")
    public void o_sistema_deve_exibir_a_mensagem_de_conta_criada_com_sucesso() {
        utils.waitElementBePresent(accountInformationPage.accountCreationMessage,10);
        String successMessage = accountInformationPage.getAccountCreationSuccessMessage();
        Assertions.assertEquals("ACCOUNT CREATED!",
                successMessage,
                "Account creation success message is incorrect!");
    }
}
