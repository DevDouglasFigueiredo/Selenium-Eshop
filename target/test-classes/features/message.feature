#language: pt

@Cadastro
Funcionalidade: Enviar mensagem


  @Enviar-mensagem-sucesso
  Cenário: Enviar uma mensagem com sucesso
    Dado que estou na tela da mensagem
    E preencho todos os campos
    Quando clico em enviar mensagem
    Então vejo o feedback de mensagem enviada com sucesso

