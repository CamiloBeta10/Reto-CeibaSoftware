# language:es

Característica:  El usuario compra un producto
  Yo como usuario compro un producto por la pagina web
  Esquema del escenario: Comprar producto
    Dado Yo como usuario me logue en la pagina
      |id    |usuario         |clave       |
      | <id> |    <usuario>   |   <clave>  |
    Cuando Selecciono y agrego un producto al carrito de compra
      | Producto   |
      | <Producto> |
    Entonces Ingreso mis datos para la compra
      | nombre  | apellido    | codigopostal   |
      | <nombre>| <apellido>  | <codigopostal> |
    Y Visualizo la orden ingreso exitosamente

    Ejemplos:
      | id | usuario  | clave | Producto | nombre  | apellido    | codigopostal   |
##@externaldata@./src/test/resources/datadriven/compra.xlsx@Sheet1
      |1   |standard_user  |secret_sauce   | Sauce Labs Backpack| Camilo  | Betancur    | 05001  |

