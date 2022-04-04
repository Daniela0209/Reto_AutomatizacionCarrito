
  @FeatureName:addToCar
    Feature: Añadir productos al carrito de compras
      como usuario logeado de la pagina
    deseo poder agregar algun producto al carro de compras
    y asi poder acceder a los productos desde la plataforma

    @ScenarioName:AgregarProductosAlCarrito
    Scenario: Agregar productos desde el inicio de la pagina
      Given que el usuario esta registrado y esta navegando en la plataforma
      When el usuario escoge algunos productos y hace el respectivos checkout
      Then el cliente agrego correctamente y se hizo el respectivo checkout


    @ScenarioName:AnadirProductosAlCarro
    Scenario: Agregar productos desde el inicio de la pagina
      Given que el usuario esta registrado y esta navegando en la plataforma
      When el usuario escoge productos por color y hace el respectivo pago
      Then el usuario agrego correctamente y se hizo el respectivo checkout
