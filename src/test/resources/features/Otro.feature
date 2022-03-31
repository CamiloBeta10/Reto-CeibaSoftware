# language:es

Característica: Esto es una prueba

  Esquema del escenario: Otro escenario
    Dado Yo como usuario del portal web
    Cuando Ingreso credenciale para la autenticacion
      |id    |usuario         |clave       |
      | <id> |    <usuario>   |   <clave>  |
    Entonces Visualizo la pantalla principal
    Y Veo otras cosas muy bonitas


    Ejemplos:
      | id | usuario  | clave | Producto |
##@externaldata@./src/test/resources/datadriven/data.xlsx@Sheet1
      |1   |standard_user  |secret_sauce   | Sauce Labs Backpack|


