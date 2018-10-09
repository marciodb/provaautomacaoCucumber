package com.provaautomacao.steps;

import com.provaautomacao.tasks.*;
import com.provaautomacao.utils.TestBase;
import com.provaautomacao.verificationpoints.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;



public class ComprarProduto {

    private static WebDriver navegador;
    EscolheProdutoTask elemento;
    AdicionaNoCarrinhoTask buttonAddToCart;

    @Before
    public void beforeCenario() {
        System.out.println("This will run before the every Scenario");
    }


    @Given("^Usuário está na Home Page$")
    public void usuário_está_na_home_page() {
        this.navegador = TestBase.createChrome();
    }

    @When("^Usuário escolhe um produto$")
    public void usuário_escolhe_um_produto() {
        this.elemento = new EscolheProdutoTask(this.navegador);

    }

    @Then("^É redirecionado para a página de descrição do produto$")
    public void é_redirecionado_para_a_página_de_descrição_do_produto() {
        this.elemento.clicarImagem();

    }

    @Given("^Usuário está na página de descrição de seu produto$")
    public void usuário_está_na_página_de_descrição_de_seu_produto() {
        PaginaDescricaoVerificationPoint tituloDescricaoDoProduto = new PaginaDescricaoVerificationPoint(this.navegador);
        tituloDescricaoDoProduto.getTitulo();

    }

    @When("^Usuário adiciona seu produto no carrinho$")
    public void usuário_adiciona_seu_produto_no_carrinho() {
        this.buttonAddToCart = new AdicionaNoCarrinhoTask(this.navegador);

    }

    @Then("^O usuário vai para a página de confirmação de seu item no carrinho$")
    public void o_usuário_vai_para_a_página_de_confirmação_de_seu_item_no_carrinho() {
        this.buttonAddToCart.clicarBotao();
    }

    @Given("^Usuário está na pagina de confirmação$")
    public void usuário_está_na_pagina_de_confirmação() {
        PaginaConfirmacaoVerificationPoint tituloProccedToCheckout = new PaginaConfirmacaoVerificationPoint(this.navegador);
        tituloProccedToCheckout.getTitulo();
    }

    @And("^Procede para o checkout$")
    public void procede_para_o_checkout() {
        ProcedeParaCheckoutTask buttonProceedToCheckout = new ProcedeParaCheckoutTask(this.navegador);
        buttonProceedToCheckout.clicarBotao();
    }

    @When("^O usuário confirma o produto$")
    public void o_usuário_confirma_o_produto() {
        ConfirmacaoDoProdutoVerificationPoint linkTextDoProduto = new ConfirmacaoDoProdutoVerificationPoint(this.navegador);
        linkTextDoProduto.getTitulo();
    }

    @Then("^O usuário finaliza a primeira etapa da compra$")
    public void o_usuário_finaliza_a_primeira_etapa_da_compra() {
        ProcedeParaCadastroTask buttonProceedToCheckout2 = new ProcedeParaCadastroTask(this.navegador);
        buttonProceedToCheckout2.clicarBotao();
    }

    @Given("^Usuario cadastra seu email$")
    public void usuario_cadastra_seu_email() {
        SignInPageTask campoCadastraEmail = new SignInPageTask(this.navegador);
        campoCadastraEmail.cadastrarEmail();
    }

    @And("^Usuario confirma seu email$")
    public void usuario_confirma_seu_email() {
        SignInPageTask submitCreateButton = new SignInPageTask(this.navegador);
        submitCreateButton.clicarBotao();
    }

    @Then("^Usuário preenche e envia formulário de cadastro$")
    public void usuário_preenche_e_envia_formulario_de_cadastro() {
        SignInPageTask elementosDeCadastro = new SignInPageTask(this.navegador);
        elementosDeCadastro.preencherFormulario();
    }

    @Given("^Usuário valida seus dados e prossegue$")
    public void usuário_valida_seus_dados_e_prossegue() {
        PaginaAdressVerificationPoint validarDados = new PaginaAdressVerificationPoint(this.navegador);
        validarDados.getAdress();
        PaginaAdressTask prosseguir = new PaginaAdressTask(this.navegador);
        prosseguir.clicarBotao();
    }

    @And("^Usuário aceita os termos de serviço e prossegue$")
    public void usuário_aceita_os_termos_de_serviço_e_prossegue() {
        ShippingPageTask aceitarTermos = new ShippingPageTask(this.navegador);
        aceitarTermos.marcarCheckBox();
        ShippingPageTask buttonProceedToCheckout = new ShippingPageTask(this.navegador);
        buttonProceedToCheckout.clicarBotao();
    }

    @And("^Usuário valida o total do valor de seu produto$")
    public void usuário_valida_o_total_do_valor_de_seu_produto() {
        PaymentVerificationPoint total = new PaymentVerificationPoint(this.navegador);
        total.getTotal();
    }

    @When("^Usuário seleciona um método de pagamento e prossegue$")
    public void usuário_seleciona_um_método_de_pagamento_e_prossegue() {
        PaymentTask metodoDePagamento = new PaymentTask(this.navegador);
        metodoDePagamento.clicarBotao();
    }

    @Then("^Usuário confere a finalização da sua compra$")
    public void usuário_confere_a_finalização_da_sua_compra() {
        PaymentVerificationPoint totalAmount = new PaymentVerificationPoint(this.navegador);
        totalAmount.getTotalAmount();
        PaymentTask confirmarMinhaCompra = new PaymentTask(this.navegador);
        confirmarMinhaCompra.clicarBotaoConfirmandoPagamento();
    }

}