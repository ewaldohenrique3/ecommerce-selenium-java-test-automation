# language: pt

  @login
  Funcionalidade: : Login de usuario
    Como usuario cadastrado
    Quero fazer login
    Para realizar uma compra

    @login_sucesso @positivo
    Cenario: Login com email e senha validos
      Dado que o usuario acessa a pagina de login
      Quando informa email e senha validos
      E confirma o login
      Então o sistema deve exibir o usuario logado com seu nome