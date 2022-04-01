
@FeatureName:crearUnMensaje
  Feature:Crear un mensaje para soporte
    Como cliente o usuario
    Tengo la necesidad de enviar un mensaje
    Para realizar quejas o sugerencias

  @ScenarioName:CrearElMensaje
    Scenario: Crear el mensaje
    Given que el cliente se encuentra en la plataforma en la parte de inicio
    When El cliente accede a la parte de contacto donde coloca su email, destinatario y el respectivo mensaje
    Then el cliente recibe un mensaje exitoso de que se envio correctamente

    @ScenarioName:CrearMensajeReference
    Scenario: Crear mensaje con referencia
      Given que el cliente ingresa a la pagina en la parte de inicio
      When el cliente ingresa a contacto donde coloca el destinatario, email, reference y el mensaje
      Then el cliente recibe un mensaje de que fue enviado correctamente

