#language: es

Característica: un usuario quiere iniciar sesion en Sauce Demo

  @InicioSesionExitoso
  Esquema del escenario: inicio de sesion exitoso
    Dado que el usuario se encuentra en la pagina web de Sauce Demo
    Cuando ingresa con credenciales correctas
      | username   | password   |
      | <username> | <password> |
    Entonces visualiza el titulo inicial
    Ejemplos:
      | username      | password     |
      | standard_user | secret_sauce |