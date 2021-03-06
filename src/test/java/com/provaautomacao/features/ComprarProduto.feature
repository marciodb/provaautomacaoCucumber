Feature: ComprarProduto

  Scenario: Selecionar um produto na página
    Given Usuário está na Home Page
    When Usuário escolhe um produto
    Then É redirecionado para a página de descrição do produto

  Scenario: Adicionar um produto no carrinho
    Given Usuário está na página de descrição de seu produto
    When Usuário adiciona seu produto no carrinho
    Then O usuário vai para a página de confirmação de seu item no carrinho

  Scenario: Prosseguir na compra do produto
    Given Usuário está na pagina de confirmação
    And Procede para o checkout
    When O usuário confirma o produto
    Then O usuário finaliza a primeira etapa da compra

  Scenario: Criar uma conta
    Given Usuario cadastra seu email
    And Usuario confirma seu email
    Then Usuário preenche e envia formulário de cadastro

  Scenario: Finalizar a compra do produto
    Given Usuário valida seus dados e prossegue
    And Usuário aceita os termos de serviço e prossegue
    And Usuário valida o total do valor de seu produto
    When Usuário seleciona um método de pagamento e prossegue
    Then Usuário confere a finalização da sua compra