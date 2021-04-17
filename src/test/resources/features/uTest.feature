#Autor: Miguel

  @stories
      Feature: uTest

        @scenario

        Scenario:  Register and search for a course

        Given miguel se registra en el portal
          |strNombre   | |strApellido  |   |strEmail  | |strLenguaje  | |strCiudad  | |strCPostal  | |strPais  | |strComputador  | |strMovil  | |strPassword  | |strCPassword  | |strStayInformed  | |strTermUse  | |strPSP  |
          |<strNombre> | |<strApellido>|   |<strEmail>| |<strLenguaje>| |<strCiudad>| |<strCPostal>| |<strPais>| |<strComputador>| |<strMovil>| |<strPassword>| |<strCPassword>| |<strStayInformed>| |<strTermUse>| |<strPSP>|

        When ingresa al portal con los datos
          |strEmailLogin  | |strPasswordLogin  |
          |<strEmailLogin>| |<strPasswordLogin>|

          Then busca el curso

          |strCurso  |
          |<strCurso>|
