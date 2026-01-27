package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;


public class AuthPage{


    private WebDriver driver;
    private Utils utils;

    public AuthPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new Utils(driver);
    }

    private final By signupEmailInput = By.cssSelector("[data-qa='signup-email']");
    private final By signupNameInput = By.cssSelector("[data-qa='signup-name']");
    private final By signupButton = By.cssSelector("[data-qa='signup-button']");
    private final By loginEmailInput = By.cssSelector("[data-qa='login-email']");
    private final By loginPasswordInput = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)");
    private final By loginButton = By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button");


    public void fillEmailCreate(){
        driver.findElement(signupEmailInput).sendKeys(utils.getRandomEmail());
    }

    public void fillNameCreate(String name){
        driver.findElement(signupNameInput).sendKeys(name);
    }

    public void clickSignupButton(){
        driver.findElement(signupButton).click();
    }

    public void acessLoginScreen(){
        driver.get("https://automationexercise.com/signup");
        utils.waitElementBePresent(loginEmailInput, 10);
    }


}