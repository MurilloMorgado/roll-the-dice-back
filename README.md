## FastDoubleClickBackend
Este projeto foi desenvolvido utilizando Spring Boot, proporcionando uma API simples para interação com o front-end do [Roll-the-dice-front](https://github.com/MurilloMorgado/roll-the-dice-front).

## Pré-requisitos
Certifique-se de ter o Java 17 ou superior e o Maven instalados em sua máquina para rodar este projeto.

Instalar o Java

Instalar o Maven

## Como Rodar o Projeto
### 1. Clone o Repositório
Clone este repositório para a sua máquina local:

`git clone https://github.com/MurilloMorgado/roll-the-dice-back.git`

### 2. Instale as Dependências
Acesse o diretório do projeto e execute o comando para baixar as dependências:

`mvn clean install`


### 3. Teste a API
Com o servidor em execução, você pode fazer requisições para os seguintes endpoints:

## POST /api/tempos
Este endpoint recebe a informação do dado jogado e sua quantidade de lados, trazendo o resultado e armazenando no banco h2 o historico.

Exemplo de corpo da requisição:

```
{
  "lado": 6, // Quantidade de lados que o dado tem
}
```

GET /api/tempos
Este endpoint retorna todos os tempos salvos no arquivo .json.

```
[
  {
    "lado": 6,
    "resultado": 5
  },
  {
    "lado": 20,
    "resultado": 15
  }
]
```

## Estrutura do Projeto
O back-end é composto por:

Controller CronometroController: Responsável pelos endpoints para listar o historico de jogadas e trazer o resultado para cada rolagem.

Serviço CronometroService: Lógica de negócios para trazer o resultado da rolagem e salvar o historico no banco h2.

