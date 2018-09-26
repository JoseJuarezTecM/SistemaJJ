

![Visual](https://github.com/JoseJuarezTecM/SistemaJJ/blob/master/Logo.png)

# Plantilla de trabajo

## Resumen :blue_book:

* ### Descripción

  Se realizo un plan para implementar una mejora dentro de la empresa, en meses anteriores se llevo a cabo un minuciosa
  observación de algunos de los procesos que se ejecutan en la empresa, en los cuales se puedo notar la falta de sisetmas
  o softwares para la mejora de los mismos, por ello se le hicieron las observaciones a dirección, la cual autorizo poner
  en marcha algunas de las mejoras propuestas por un servidor.

* ### Problema Identificado

  Uno de los problemas identificados en el proceso de observación y que supimos que se podía empezar a resolver de forma 
  más rápida fue el como se lleva el registro de clientes y productos en varios archivos de excel los cuales son 
  manipulados por varias personas, lo que hace de la información muy vulnerable, ya que si alguna de las personas borra o
  modifica un archivo sin la prevía autorización de otro usuario, la información se pierde y esto conlleva a tener que
  generar de nuevo dicho archivo, por ello se les sugirio la siguiente solución.

* ### Solución

 Se realizo un software en el cual la empresa prodrá registrar a sus clientes y sus productos, cualquier persona que lo 
 necesite podrá consultar dicha información y también podra dar de alta nuevos clientes y productos, pero este con la ventaja 
 de que solo personal autorizado podrá borrar o modificar información en el sistema.

* ### Arquitectura

Aplicación Visual System (Escritorio y Multiplataforma)

Elaborado en NetBeans IDE 8.2

JDBC

Base de datos SQL Server (Servidor de Base de Datos)

Repositorio código fuente GitHub


## Requerimientos :green_book:

* ### Servidores de aplicación, web, bases de datos
 
 NetBeans IDE 8.2
 Base de datos SQL Server (Servidor de Base de Datos)
 
 * ### Paquetes adicionales
 
 No aplica
 
  * ### Versión de Java
  
  Version 8 Update 181
 
 
## Instalación :orange_book:

  El software tendrá un ejecutable que se podrá correr en cualquier sistema de computo, ya sea Windows, IOS, Linux, etc, ya que 
  esta fabricado en código Java, cada usuario tendrá acceso al servidor donde estará instalado el programa, esto con el fin de
  que todo lo que se modifique del sistema este en una sola base de datos.
  
  Las pruebas se podrán ejecutar manualmente por cada usuario ya que cada uno de ellos tendrá el mismo ejecutable, esto con el 
  fin de que cada usuario pueda practicar y entender como se maneja el sistema.
  
  Como lo mencione anteriormente el sistema se ejecutara en un servidor de la empresa que se tiene con Amazon y todos los usuarios
  que van a tener acceso a el se conectaran por medio de una VPN y del escritorio remoto, por supuesto las personas de sistemas se
  encargarán de hacer dichas instalaciones y configuraciones en cada una de la maquinas de los usuarios.
    
## Configuración :blue_book:

* ### Configuración del producto (archivos de configuración)
  
  Los archivos que se necesitaran son:
  
  SQL Server versión 2008 o superior
  Java JDK, SDK y Environment.
  
  Se deberán instalar los tres Java y realizar la siguiente configuración.
  
  Equipo
  Disco local c:
  archivos de programa.
  Java.
  jdk1.8.0_152 o la ultima versión que se maneje.
  ingresar al bin.
  copiar liga que aparece en la parte superior.
  Ir a equipo.
  Propiedades.
  Configuración avanzada del sistema.
  Variables de entorno.
  variables del sistema.
  buscar la que dice Path.
  Dar clic en editar.
  Con la flechas del teclado, posicionarnos hasta el final colocar un punto y coma.
  Pegamos la liga copiada anteriormente.
  Aceptar, Aceptar.
  Abrir CMD y colocar lo siguiente javac -version, esto para revisar que se configuro correctamente el jdk.
  
  
## Uso :green_book:

## Manual de usuario :blue_book:

* ### Pantalla de acceso.

El sistema de registro, nos muestra la siguiente información, para entrar al sistema hay que dar click en el botón de “acceder al sistema”.

* ### Login 
En la siguiente pantalla que se muestra, debe de ingresar el usuario y password  para poder entrar al sistema de registro, el usuario y password será predeterminado por el administrador.

* ### Pantalla de Usuario (vista de usuario)

En esta pantalla se capturan los datos del equipo que se desea reparar,  en la cual se llenaran los campos establecidos por el sistema para la mejor gestión de datos de la empresa. En esta interfaz se proporciona diferentes opciones como es guardar un nuevo usuario, eliminar un campo o dato erróneo del usuario se validan también que tipo de servicios solicito el cliente, esto con el fin de llevar un mejor control de validación.
Se deben de llenar todos los campos establecidos como; nombre del cliente, teléfono, e-mail, dirección, tipo de servicio, número de servicio, depto que realizara el servicio, fecha de solicitud, marca, fecha probable de entrega y observaciones o reporte. 

* ### Pantalla de opciones de usuarios.

Esta pantalla aparecerá dando clic en opciones, esta nos muestra las diferentes opciones que tiene el usuario las cuales son:
•	Imprimir tabla de clientes (muestra todos los clientes registrados). 
•	Imprimir lista de servicios (muestra todos los servicios que se están ejecutando).
•	Imprimir lista de servicios no generados (muestra una lista de todos los servicios que aún no han sido entregados a los clientes).
•	Crear e imprimir gráfica (nos crea un grafica realizada con las estadísticas de los servicios entregados y no entregados).
Al igual de las opciones de regresar a la pantalla anterior y de cerrar sesión.

* ### Pantalla de Técnico (vista de técnico o consultor)

Esta pantalla al igual que la pantalla de usuario nos muestra y realiza la captura de los datos del servicio que se va a brindar al cliente, en la cual se llenaran los campos establecidos por el sistema para la mejor gestión de datos de la empresa. En esta interfaz se proporciona diferentes opciones como es guardar un nuevo usuario, eliminar un campo o dato erróneo del usuario se validan también que tipo de servicio y que depto está asignado esto con el fin de llevar un mejor control de validación.
Se deben de llenar todos los campos establecidos como; nombre del cliente, teléfono, e-mail, dirección, tipo de servicio, número de servicio, depto, fecha de solicitud, ID, fecha probable de entrega y observaciones o reporte.   
La diferencia de la vista de usuario a la vista de técnico o consultor, es que el técnico puede modificar si el servicio ya se encuentra entregado o en proceso, además de poder describir lo que realizo en la visita con él cliente.

* ### Pantalla de Administrador

Esta es la vista y pantalla del administrador, la cual le permite agregar nuevos usuarios, administradores, consultores o técnicos. Este tiene el manejo de todo el sistema, puede modificar los datos que se encuentren.  
El botón del área técnica, le permite modificar los datos de los servicios que se han solicitado.

* ### Recuperación de password.

Esta pantalla consiste en recuperar la contraseña del usuario, la cual consiste en ingresar el nombre del usuario y automáticamente se recupera el password dando clic en el botón “Buscar”.
El botón de Login te regresa automáticamente a la pantalla de Login.


## Contribución :orange_book:

* ### Titulo 3
  Descripción
  
## Roadmap :blue_book:

* ### Descripción
 
 El sistema esta en un 20% de lo que sera su capacidad, en los proximos meses el área de desarrollo empezara a realizar mejoras 
 al sismema tales como:
 
 El sistema podrá generar ordenes de servicio.
 
 En el sistema se podrán generar oportunidades para el área de ventas.
 
 Las cuales una vez ganada la oportunidad se convertira en pedido.
 
 Desde los pedidos el área administrativa podrá realizar la facturación.
 
 El sistema se ira a un servicio Web para que se pueda usar también en equpos moviles como celulares, tabletas, etc.
 
 El sistema en un futuro se deberá convertir en un CRM más profesional.
 
  

  
  [Mas información MD.PDF](https://github.com/visualmexico/customers/blob/master/markdown.pdf)

> Todos los derechos reservados para Visual ERP Systems. :registered:
