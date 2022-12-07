package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By getSuccessfullyLoginMessage = By.xpath("//span[contains(text(),'Products')]");



    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getMessageAfterSucessfullyLogin() {
        return getTextFromElement(getSuccessfullyLoginMessage);
    }

    public int actualSize() {
        List<WebElement> numberOfProducts = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        int size = numberOfProducts.size();
        return size;
    }

}
