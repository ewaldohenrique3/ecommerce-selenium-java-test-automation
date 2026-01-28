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
    private final By loginPasswordInput = By.cssSelector("[data-qa='login-password']");
    private final By loginButton = By.cssSelector("[data-qa='login-button']");
    public final By loggedMessage = By.xpath("//a[contains(., 'Logged in as')]");

    public String getLoggedUserText() {
        return driver.findElement(loggedMessage).getText();
    }

    public void fillEmailCreate(){
        driver.findElement(signupEmailInput).sendKeys(Utils.randomEmail);
    }

    public void fillNameCreate(String name){
        driver.findElement(signupNameInput).sendKeys(name);
    }

    public void clickSignupButton(){
        driver.findElement(signupButton).click();
    }

    public void accessLoginScreen(){
        driver.get("https://automationexercise.com/signup");
        utils.waitElementBePresent(loginEmailInput, 10);
    }

    public void fillLoginEmail(){
        driver.findElement(loginEmailInput).sendKeys(Utils.randomEmail);
    }

    public void fillLoginPassword(){
        driver.findElement(loginPasswordInput).sendKeys(Utils.randomPassword);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }


}