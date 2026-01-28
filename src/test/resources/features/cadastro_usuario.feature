# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuario
    Como novo usuario
    Quero me cadastrar
    Para fazer compras

    @cadastro_sucesso @positivo
    Cenário: Cadastro de novo usuario com sucesso
      Dado que o usuario acessa a pagina de cadastro
      Quando informa nome e email validos
      E preenche os dados obrigatorios para criacao da conta
      E confirma a criacao da conta
      Então o sistema deve exibir a mensagem de conta criada com sucesso
