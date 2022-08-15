#language: pt

  @Cadastro
  Funcionalidade: Cadastro de usuario
      Como novo usuario
      Quero me cadastrar no ecomerce
      para poder fazer compras online

    @Cadastro-sucesso
  Cenário: Registrar novo usuario com sucesso
    Dado que acesso a tela de login
    E acesso o cadastro de usuario
    Quando eu preencho o formulario de cadastro
    E clico em registrar
    Então vejo a mensagem de cadastro realizado com sucesso
