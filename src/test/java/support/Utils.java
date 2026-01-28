package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.time.Duration;
import java.util.Random;

public class Utils{


    private WebDriver driver;

    public static String randomEmail;
    public static String randomPassword;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Usar quando quiser apenas garantir que a tela carregou
     * (elemento existe no DOM, mas pode não estar visível).
     */
    public void waitElementBePresent(By element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    /**
     * Usar quando for interagir visualmente com o elemento
     * (digitar texto, ler mensagem, validar label).
     */
    public void waitElementBeVisible(By element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    /**
     * Usar quando for realizar ação de clique
     * (elemento visível, habilitado e clicável).
     */
    public void waitElementBeClickable(By element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public String getRandomEmail(){

        String email_init = "teste_";
        String email_final = "@gmail.com.br";
        Random random = new Random();
        int min = 0;
        int max = 99999999;
        int result = random.nextInt(max-min) + min;

        return email_init + result + email_final;
    }

    public String getRandomPassword(int length) {

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%&*()-_=+[]{}<>?";

        String allChars = upperCase + lowerCase + numbers + specialChars;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

}
