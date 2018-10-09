package com.provaautomacao.tasks;

import com.provaautomacao.pageobjects.EscolheProdutoObject;
import org.openqa.selenium.WebDriver;

public class EscolheProdutoTask {

    private WebDriver navegador;
    public EscolheProdutoObject produtoPageObject;

    public EscolheProdutoTask(WebDriver navegador) {
        this.navegador = navegador;
        this.produtoPageObject = new EscolheProdutoObject(this.navegador);
    }

    public void clicarImagem() {
        this.produtoPageObject.imagemDoProduto(navegador).click();
    }
}