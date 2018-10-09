package com.provaautomacao.verificationpoints;

import com.provaautomacao.utils.BasePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentVerificationPoint extends BasePageObject {

    public PaymentVerificationPoint(WebDriver navegador) {
        super(navegador);
    }

    public String getTotal() {

        String total;
        total = navegador.findElement(By.id("total_price")).getText();
        Assert.assertEquals(total, "$19.25");

        return total;
    }

    public String getTotalAmount() {

        String total;
        total = navegador.findElement(By.id("amount")).getText();
        Assert.assertEquals(total, "$19.25");

        return total;
    }
}