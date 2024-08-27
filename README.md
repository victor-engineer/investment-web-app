# investment-web-app  
Investment Web

Este é um projeto de Gerenciador de Investimentos Pessoais que permite acompanhar uma carteira de investimentos com integração a uma API externa para consultar cotações de ativos. O projeto foi desenvolvido em Java com foco em simular lucros e prejuízos com base em preços de compra e venda.
Funcionalidades

    Adicionar investimentos à carteira, especificando o ticker, tipo de ativo e quantidade.
    Consultar a cotação atual de um ativo através da API da Alpha Vantage.
    Simular lucros ou prejuízos ao vender ativos a preços específicos.

Tecnologias Utilizadas

    Java 17
    Maven
    API Alpha Vantage (para cotações)
    HTTP Client (para integração com a API)
    JSON.org (para manipulação de JSON)

Estrutura do Projeto

O projeto está organizado da seguinte forma:

css

investmentweb/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── model/
│   │   │   │   └── Investment.java
│   │   │   ├── service/
│   │   │   │   └── InvestmentService.java
│   │   │   └── InvestmentApp.java
│   └── pom.xml

    Investment.java: Representa um investimento com informações sobre o ticker, tipo de ativo, quantidade e preço de compra.
    InvestmentService.java: Lida com a lógica de negócio para adicionar investimentos, consultar cotações e simular lucros/prejuízos.
    InvestmentApp.java: Classe principal para executar o projeto.

Como Executar

    Clone o repositório:

    bash

git clone https://github.com/seu-usuario/investment-web.git

Navegue até o diretório do projeto:

bash

cd investment-web

Compile e instale o projeto usando Maven:

bash

mvn clean install

Execute a aplicação:

bash

    java -cp target/investment-web-1.0-SNAPSHOT.jar service.InvestmentApp

Configuração da API

O projeto usa a Alpha Vantage API para consultar as cotações dos ativos. Substitua a chave de API (apiKey) na classe InvestmentService.java pela sua chave pessoal:

java

String apiKey = "SUA_CHAVE_DE_API";

Exemplo de Uso

bash

Cotação atual da AAPL: $150.0
Lucro potencial: $50.0

Contribuições

Sinta-se à vontade para abrir issues ou enviar pull requests.
