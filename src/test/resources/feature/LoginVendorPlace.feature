# new feature
#language:es
@Todo
Característica: Validacion de Login

  @ingresocorrecto
  Escenario: Ingresar a la página VendorPlace, con usuario registrado
    Dado que ingresa a la pagina VendorPlace
    Cuando escribe sus credenciales
    Y hace click en continuar
    Entonces la pagina VendorPlace muesta el Home

  @loginincorrecto
  Esquema del escenario: Validar login incorrecto de la pagina VendorPlace
    Dado que ingresa a la pagina VendorPlace
    Cuando ingresa su correo electronico "<sUser>"
    Y ingresa su contraseña "<sPassword>"
    Y hace click en continuar
    Entonces el usuario captura el mensaje de alerta "<sAlertaincorrecto>"
  Ejemplos:
  |sUser                  |sPassword      |sAlertaincorrecto       |
  |automation@test.com    |Abc12345.zzzz  |usuario y contraseña incorrectos|
  |automationmm@test.com    |Abc12345.      |usuario y contraseña incorrectos|

  @1234
  Esquema del escenario: Validar login campos vacio de la pagina VendorPlace
      Dado que ingresa a la pagina VendorPlace
      Cuando ingresa su correo electronico "<sUser>"
      Y ingresa su contraseña "<sPassword>"
    Y hace click en continuar
      Entonces el usuario captura el mensaje de alerta "<sAlertaContraseña>" en el campo contraseña
      Ejemplos:
        |sUser              |sPassword      |sAlertaContraseña        |
        |automation@test.com|               |    contraseña requerida               |
  @123
  Esquema del escenario: Validar login campos vacio de la pagina VendorPlace
    Dado que ingresa a la pagina VendorPlace
    Cuando ingresa su correo electronico "<sUser>"
    Y ingresa su contraseña "<sPassword>"
    Y hace click en continuar
    Entonces el usuario captura el mensaje de alerta "<sAlertacorreo>" en el campo correo electronico
    Ejemplos:
      |sUser              |sPassword      |sAlertacorreo       |
      |                   | 12345678    |Por favor escribe un correo como orlando@mybusines |

  @todo1
  Escenario: Registrarme a la pagina VendorPlace
    Dado que ingresa a la pagina VendorPlace
    Y pulsa crear cuenta
    Cuando ingrese sus datos en los campos determinados
    Y hace click en continuar
    Y ingreso su nuemero de celular
    Y hace click en continuar
    Entonces entonces la aplicacion completa el proceso y te muesta el home de la pagina

  @todo
  Esquema del escenario: Ingresar a la pagina VemdorPlace iniciar sesion, recuperar la contraseña olvidada.
    Dado que ingresa a la pagina VendorPlace
    Y pulsa olvide mi contraseña
    Cuando ingresa el correo de recuperacion
    Entonces entonces valida el mensaje "<sMensaje>"
    Ejemplos:
      |sMensaje|
      |revisa tu correo electronico|