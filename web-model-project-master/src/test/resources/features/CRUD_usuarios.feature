# language: pt
# charset: UTF-8

  @agapito
  Funcionalidade: CRUD de usuários

    Cenário: Criar um novo usuário
      Dado que o usuário está no sistema Agapito Server
      E o usuário escolhe o menu Usuarios
      E o usuário clica no botão novo usuário
      E o usuário preenche o campo "login" com "Robson Agapito"
      E o usuário preenche o campo "nome completo" com "Robson Agapito"
      E o usuário preenche o campo "email" com "Robson Agapito"
      E o usuário preenche o campo "idade" com "18"
      Quando o usuário clicar em salvar
      Então o usuário deveria ver a mensagem "Usuário foi criado com sucesso."

    @CONSULTAR
    Cenário: Consultar um novo usuário
      Dado que o usuário está no sistema Agapito Server
      E o usuário escolhe o menu Usuarios
      E o usuário clica no botão novo usuário
      E o usuário preenche o campo "login" com "Robson Agapito"
      E o usuário preenche o campo "nome completo" com "Robson Agapito"
      E o usuário preenche o campo "email" com "Robson Agapito"
      E o usuário preenche o campo "idade" com "18"
      E o usuário clicar em salvar
      E o usuário clicar em voltar
      Quando o usuário consultar o último cadastro
      Então o usuário deveria ver "login" com "Robson Agapito"
      E o usuário deveria ver "nome completo" com "Robson Agapito"
      E o usuário deveria ver "email" com "Robson Agapito"
      E o usuário deveria ver "idade" com "18"


