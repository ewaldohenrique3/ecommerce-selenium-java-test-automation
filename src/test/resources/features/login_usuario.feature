# language: pt

  @login
  Funcionalidade: : Login de usuario
    Eu como usuario cadastrado
    Quero fazer login
    Para realizar uma compra

    @login_sucesso @positivo
    Cenario: Login com email e senha válidos
      Dado que o usuario acessa a pagina de login
      Quando informa email e senha válidos
      E confirma o login
      Então o sistema deve exibir o usuário logado com seu nome