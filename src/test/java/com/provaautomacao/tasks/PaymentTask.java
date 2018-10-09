package com.provaautomacao.tasks;

import com.provaautomacao.pageobjects.PaymentPageObject;
import org.openqa.selenium.WebDriver;

public class PaymentTask {

    private WebDriver navegador;
    public PaymentPageObject buttonPayByBankWire;

    public PaymentTask(WebDriver navegador) {
        this.navegador = navegador;
        this.buttonPayByBankWire = new PaymentPageObject(navegador);
    }

    public void clicarBotao() {
        this.buttonPayByBankWire.getPayByBankWire(navegador).click();
    }

    public void clicarBotaoConfirmandoPagamento() {
        this.buttonPayByBankWire.getIConfirmMyOrder(navegador).click();
    }

}