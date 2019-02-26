# provaautomacao
Estruturação de um projeto BDD em java com Cucumber.

Guia de instalação:

Baixe o projeto e descompacte
Abra o InteliJ
Clique em Import Project
Identifique o caminho do projeto baixado
Selecione import project from external model > escolha maven > selecione import Maven project automatically > next > ok > next > finish

Agora com a IDE aberta, siga pelos diretórios: src>test>java>com.provaautomacao>runner>TestRunner e execute o teste através dessa classe.

*OBSERVE O COMPORTAMENTO E A UTILIZAÇÃO DO BDD NAS CLASSES DENTRO DOS PACOTES FEATURES (ComprarProduto.feature) E STEPS (ComprarProduto)


*OBSERVE QUE OS OBJETOS SÃO MAPEADOS NAS CLASSES DO DIRETÓRIO "PAGEOBJECTS", SUAS AÇÕES E COMPORTAMENTOS SÃO EXECUTADOS NO "TASKS" 
E SUAS VALIDAÇÕES NO "VERIFICATIONPOINTS".


*OBSERVE QUE A CLASSE STEPS APENAS INSTANCIA E CHAMA AS AÇÕES DAS CLASSES TASKS PARA EXECUTAR O COMPORTAMENTO DEFINIDO NAS FEATURES.

Qualquer problema, lembre-se de verificar as dependências nos arquivos POM.XML 

Esse projeto foi feito utilizando:

IDE: IntelliJ IDEA Community Version 2018.1.6
JAVA VERSION: jdk1.8.0_181
MAVEN VERSION: 4.0.0

O desafio contempla:

Caso de teste: realizar uma compra com sucesso.
1.              Acessar o site: www.automationpractice.com.
2.              Escolha um produto qualquer na loja.
3.              Adicione o produto escolhido ao carrinho.
4.              Prossiga para o checkout.
5.              Valide se o produto foi corretamente adicionado ao carrinho e prossiga caso esteja tudo certo.
6.              Realize o cadastro do cliente preenchendo todos os campos obrigatórios dos formulários.
7.              Valide se o endereço está correto e prossiga.
8.              Aceite os termos de serviço e prossiga.
9.              Valide o valor total da compra.
10.          Selecione um método de pagamento e prossiga.
11.          Confirme a compra e valide se foi finalizada com sucesso.





