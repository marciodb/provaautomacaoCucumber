package com.provaautomacao.pageobjects;

import com.provaautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPageObject extends BasePageObject {

    public PaymentPageObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getPayByBankWire(WebDriver navegador) {

        return this.navegador.findElement(By.className("bankwire"));

    }

    public WebElement getIConfirmMyOrder(WebDriver navegador) {

        return this.navegador.findElement(By.cssSelector(".cart_navigation .button-medium"));

    }
}