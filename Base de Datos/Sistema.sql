create database Sistema
use Sistema


--Tabla 1
create table Usuarios(IDusuario int identity(100,1), nombre varchar(50) not null unique, 
                      password varchar (30) not null, tipo int not null)


Insert into Usuarios (nombre, password, tipo) values ('administrador', 'administrador', 1)
Insert into Usuarios (nombre, password, tipo) values ('vendedor', 'vendedor', 2)
Insert into Usuarios (nombre, password, tipo) values ('usuario', 'usuario', 3)


--Tabla 2
create table Tipos (IDtipo int identity, nombreT varchar(20) not null)

Insert into Tipos (nombreT) values ('Administrador')
Insert into Tipos (nombreT) values ('vendedor')
Insert into Tipos (nombreT) values ('Usuario')

--Tabla 3
create table Clientes (IDCliente int primary key identity (1000,1),
                       nombrecliente varchar(50) not null, 
                       telefono varchar(30) not null, 
                       mail varchar(50) not null, 
                       direccion varchar (100) not null,)

insert into Clientes (nombrecliente, telefono, mail, direccion) values ('Cimatic de México', '15000780', 'asanchez@visualmexico.com.mx', 'Rio Tiber 66')
insert into Clientes (nombrecliente, telefono, mail, direccion) values ('Maquiladora Gráfica Mexicana', '3323122032', 'caguirre@mgm.com', 'Avenida del monte 66')

--Tabla 4            /*IDClientes int references Clientes (IDCliente) identity (1000,1)*/  
create table Servicios (ID int identity (1000,1),
                      nombre int not null, 
                      diaSolicitud int not null,
                      mesSolicitud int not null,
                      anoSolicitud int not null,
                      servicio varchar (30) not null,
                      depto varchar (50) not null,
                      Tipo varchar (30) not null, 
                      diaEntrega int not null,
                      mesEntrega int not null,
                      anoEntrega int not null,
                      Observaciones varchar (200) not null)


insert into Servicios (nombre, diaSolicitud, mesSolicitud, anoSolicitud, servicio, depto, Tipo, diaEntrega, mesEntrega, anoEntrega, Observaciones) values (1, 17, 09, 2018, 'Consultoría', 'Consultoria', 'servicio', 01, 10, 2018, 'Se revisa el lay out de bancos')
insert into Servicios (nombre, diaSolicitud, mesSolicitud, anoSolicitud, servicio, depto, Tipo, diaEntrega, mesEntrega, anoEntrega, Observaciones) values (2, 18, 09, 2018, 'Desarrollo', 'Desarrollo', 'desarrollo', 03, 11, 2018, 'Se realiza addenda nueva para bancos')


--Tabla 5
create table Estado (IDEstado int identity (1000,1),                      
                      status varchar (30) not null,                      
                      Observaciones varchar (200) not null)

insert into Estado (status, Observaciones) values ('Entregado', 'Se entrega addenda funcionando con Bancomer')
insert into Estado (status, Observaciones) values ('No entregado', 'Falto la capacitación del módulo de finanzas')


Select * from Usuarios
Select * from Tipos
select * from CLientes
select * from Servicios
select * from Estado

drop table Usuarios
drop table tipos
drop table Clientes
drop table Equipos
drop table Estado

select * from Clientes, Equipos where IDCliente = 1001 and ID = 1001
select * from Clientes where IDCliente = 1000



select status,count(status)as numero_reparados
from estado
group by status