#language: es

Característica: un usuario quiere comprar productos en Sauce Demo

  Antecedentes:
    Dado que el usuario se encuentra en la pagina web de Sauce Demo
    Cuando ingresa con credenciales correctas
      | username      | password     |
      | standard_user | secret_sauce |
    Entonces visualiza el titulo inicial

  @CheckoutExitoso
  Esquema del escenario: : checkout exitoso
    Cuando selecciona los productos a comprar, selecciona el carrito
    Y diligencia los datos de la compra finalizandola
      | firstName   | lastName   | postalCode   |
      | <firstName> | <lastName> | <postalCode> |
    Entonces visualiza el el titulo de la orden despachada
    Ejemplos:
      | firstName | lastName | postalCode |
      | Juan      | Ruiz     | 12345      |