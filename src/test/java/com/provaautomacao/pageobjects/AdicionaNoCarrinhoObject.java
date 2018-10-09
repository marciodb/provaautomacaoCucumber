package com.provaautomacao.pageobjects;

import com.provaautomacao.utils.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdicionaNoCarrinhoObject extends BasePageObject {

    public AdicionaNoCarrinhoObject(WebDriver navegador) {
        super(navegador);
    }

    public WebElement getAddToCartButton(WebDriver navegador) {

        return navegador.findElement(By.name("Submit"));
    }

}