# language:es

Característica:  El usuario agrega un producto al carrito de compras
  Yo como usuario selecciono y agrego un producto al carrito de compras
  Esquema del escenario: Agregar producto
    Dado Yo como usuario me logue en la pagina
      |id    |usuario         |clave       |
      | <id> |    <usuario>   |   <clave>  |
    Cuando Selecciono y agrego un producto al carrito de compra
      | Producto   |
      | <Producto> |
    Entonces Visualizo el producto en el carrito de compra


    Ejemplos:
      | id | usuario  | clave | Producto |
##@externaldata@./src/test/resources/datadriven/data.xlsx@Sheet1
      |1   |standard_user  |secret_sauce   | Sauce Labs Backpack|

