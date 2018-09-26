

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
  archivos de programa
  Java
  jdk1.8.0_152 o la ultima versión que se maneje
  ingresar al bin
  copiar liga que aparece en la parte superior
  Ir a equipo
  Propiedades
  Configuración avanzada del sistema
  Variables de entorno
  variables del sistema
  buscar la que dice Path
  Dar clic en editar
  Con la flechas del teclado, posicionarnos hasta el final colocar un punto y coma
  Pegamos la liga copiada anteriormente
  Aceptar, Aceptar
  Abrir CMD y colocar lo siguiente javac -version, esto para revisar que se configuro correctamente el jdk
  
  

## Uso :green_book:

* ### Titulo 3
  Descripción

## Contribución :orange_book:

* ### Titulo 3
  Descripción
  
## Roadmap :blue_book:

* ### Descripción
  Descripción
  

  
  [Mas información MD.PDF](https://github.com/visualmexico/customers/blob/master/markdown.pdf)

> Todos los derechos reservados para Visual ERP Systems. :registered:
