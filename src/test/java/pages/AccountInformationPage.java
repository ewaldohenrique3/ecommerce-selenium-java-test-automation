package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class AccountInformationPage{

    private final WebDriver driver;

    public AccountInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By genderM = By.id("id_gender1");
    private final By genderF = By.id("id_gender2");
    private final By passwordInput = By.id("password");
    private final By firstNameInput = By.id("first_name");
    private final By lastNameInput = By.id("last_name");
    private final By selectBirthDay = By.id("days");
    private final By selectBirthMonth = By.id("months");
    private final By selectBirthYear = By.id("years");
    private final By companyInput = By.id("company");
    private final By addressInput = By.id("address1");
    private final By countryInput = By.id("country");
    private final By stateInput = By.id("state");
    private final By cityInput = By.id("city");
    private final By zipcodeInput = By.id("zipcode");
    private final By mobileNumberInput = By.id("mobile_number");
    private final By createAccountButton = By.cssSelector("#form > div > div > div > div > form > button");
    public final By accountCreationMessage = By.cssSelector("#form > div > div > div > h2 > b");

    public String getAccountCreationSuccessMessage() {
        return driver.findElement(accountCreationMessage).getText();
    }

    public void selectGender(Integer type) {
        if (type == 1) {
            driver.findElement(genderM).click();
        } else if (type == 2){
            driver.findElement(genderF).click();
        }
    }

    public void fillPasswordInput(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void selectDateBirth(String day, String month, String year){
        Select  selectDay = new Select(driver.findElement(selectBirthDay));
        selectDay.selectByValue(day);
        
        Select  selectMonth = new Select(driver.findElement(selectBirthMonth));
        selectMonth.selectByValue(month);
        
        Select  selectYear = new Select(driver.findElement(selectBirthYear));
        selectYear.selectByValue(year);
    }

    public void fillFirstNameInput(String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void fillLastNameInput(String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void fillCompanyInput(String company){
        driver.findElement(companyInput).sendKeys(company);
    }

    public void fillAddressInput(String address){
        driver.findElement(addressInput).sendKeys(address);
    }

    public void selectCountry(String country){
        Select selectCountry = new Select(driver.findElement(countryInput));
        selectCountry.selectByValue(country);
    }

    public void fillStateInput(String state){
        driver.findElement(stateInput).sendKeys(state);
    }

    public void fillCityInput(String city){
        driver.findElement(cityInput).sendKeys(city);
    }

    public void fillZipcodeInput(String zipcode){
        driver.findElement(zipcodeInput).sendKeys(zipcode);
    }

    public void fillMobileNumberInput(String mobileNumber){
        driver.findElement(mobileNumberInput).sendKeys(mobileNumber);
    }

    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }


}
