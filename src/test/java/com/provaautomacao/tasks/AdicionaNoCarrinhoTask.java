package com.provaautomacao.tasks;

import com.provaautomacao.pageobjects.AdicionaNoCarrinhoObject;
import org.openqa.selenium.WebDriver;

public class AdicionaNoCarrinhoTask {
    private WebDriver navegador;
    public AdicionaNoCarrinhoObject buttonAddToCart;

    public AdicionaNoCarrinhoTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonAddToCart = new AdicionaNoCarrinhoObject(navegador);
    }

    public void clicarBotao() {
        this.buttonAddToCart.getAddToCartButton(navegador).click();
    }
}