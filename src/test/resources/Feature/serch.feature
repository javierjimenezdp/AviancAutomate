Feature: Yo como usuario pasajero, deseo hacer una compra de un tiquete aereo
  @Stories @Scenario1
  Scenario Outline: Compra exitosa de un tiquete aereo
    Given Como usuario pasajero deseo hacer la búsquedad de un tiquete aereo
    And debo verificar que sea un vuelo de ida y vuelta
    And debo ingresar la <ciudad> de origen, el <destino> de la ciudad, la fecha de <salida>, la fecha de <vuelta> y el número de pasajeros
    And debo seleccionar un vuelo con el tipo de equipaje de ida y seleccionar un vuelo con el tipo de equipaje de vuelta para continuar con la personalización del vuelo
    And debo ingresar <nombre1>, <apellido1> del 1er pasajero, <nombre2>, <apellido2> del 2do pasajero y también <email>, <numero> de contacto de emergencia
    And sin seleccionar ningún servicio especial, continuar al proceso de pago de los tiquetes, eligiendo PSE como metodo de pago
    When cargue la informacion PSE, debo ingresar <banco>, <tipo_persona>, <tipo_CC>, <CC> y marcar la casilla de acuerdos para continuar el proceso de pago seguro
    Then debo comprobar que me redirija a el portal de pago de Nequi

    Examples:
      |ciudad|destino|salida|vuelta|nombre1|apellido1|nombre2|apellido2|email|numero|banco|tipo_persona|tipo_CC|CC|
      |bogota|medellin|2023.2.10|16Mar.|javier|jimenez|david|plata  |ing.javierdavidjp@gmail.com|3165784528|Nequi|Natural|CC|1093785891|
