# language:es

Característica: Loguin de un usuario en la plataforma Swag Labs
  Yo como usuario de Swag Labs necesito ingresar con mi credenciales

  Esquema del escenario: Loguin en la plataforma
    Dado Yo como usuario del portal web
    Cuando Ingreso credenciale para la autenticacion
      |id    |usuario         |clave       |
      | <id> |    <usuario>   |   <clave>  |
    Entonces Visualizo la pantalla principal


    Ejemplos:
      | id | usuario  | clave | Producto |
##@externaldata@./src/test/resources/datadriven/data.xlsx@Sheet1
      |1   |standard_user  |secret_sauce   | Sauce Labs Backpack|


