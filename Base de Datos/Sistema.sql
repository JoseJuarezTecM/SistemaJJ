create database Sistema
use Sistema


--Tabla 1
create table Usuarios(IDusuario int identity(100,1), nombre varchar(50) not null unique, 
                      password varchar (30) not null, tipo int not null)


Insert into Usuarios (nombre, password, tipo) values ('administrador', 'administrador', 1)
Insert into Usuarios (nombre, password, tipo) values ('vendedor', 'vendedor', 2)
Insert into Usuarios (nombre, password, tipo) values ('usuario', 'usuario', 3)
Insert into Usuarios (nombre, password, tipo) values ('consultor', 'consultor', 4)


--Tabla 2
create table Tipos (IDtipo int identity, nombreT varchar(20) not null)

Insert into Tipos (nombreT) values ('Administrador')
Insert into Tipos (nombreT) values ('Vendedor')
Insert into Tipos (nombreT) values ('Usuario')
Insert into Tipos (nombreT) values ('Consultor')
Insert into Tipos (nombreT) values ('Desarrollador')

--Tabla 3
create table Clientes (IDCliente int primary key identity (1000,1),
                       nombrecliente varchar(50) not null, 
                       telefono varchar(30) not null, 
                       mail varchar(50) not null, 
                       direccion varchar (100) not null,)

insert into Clientes (nombrecliente, telefono, mail, direccion) values ('Maquiladora Gráfica Mexicana', '0', 'cvargas@mgm.com.mx', 'Bosque de Chapultepec')
insert into Clientes (nombrecliente, telefono, mail, direccion) values ('Swissmex Rapid', '3423122032', 'aanaya@swissmex.com', 'Avenida del monte')
insert into Clientes (nombrecliente, telefono, mail, direccion) values ('Cimatic de México', '3423122032', 'asanchez@cimatic.com.mx', 'Río Tiber 66 piso 7')

--Tabla 4            /*IDClientes int references Clientes (IDCliente) identity (1000,1)*/  
create table Productos (ID int identity (1000,1),
                      nombre int not null, 
                      diaSolicitud int not null,
                      mesSolicitud int not null,
                      anoSolicitud int not null,
                      Númerodeservicio varchar (30) not null,
                      Tipo varchar (50) not null,
                      Depto varchar (30) not null,
					  diaEntrega int not null,
                      mesEntrega int not null,
                      anoEntrega int not null,
                      Observaciones varchar (200) not null)

					  
insert into Productos (nombre, diaSolicitud, mesSolicitud, anoSolicitud, Númerodeservicio, Tipo, Depto, diaEntrega, mesEntrega, anoEntrega, Observaciones) 
values (2,17, 09, 2018, '850010','Uno', 'Consultoría', 1, 10, 2001, 'Actualización')
insert into Productos (nombre, diaSolicitud, mesSolicitud, anoSolicitud, Númerodeservicio, Tipo, Depto, diaEntrega, mesEntrega, anoEntrega, Observaciones) 
values (5,18, 09, 2018, '850010','Dos', 'Desarrollo', 1, 10, 2001, 'Addenda bancos') 


--Tabla 5
create table Estado (IDEstado int identity (1000,1),                      
                      status varchar (30) not null,                      
                      Observaciones varchar (200) not null)

insert into Estado (status, Observaciones) values ('Terminado', 'Se entrego el servicio completo')
insert into Estado (status, Observaciones) values ('No Terminado', 'El consultor no ha terminado')


Select * from Usuarios
Select * from Tipos
select * from CLientes
select * from Productos
select * from Estado

--drop table Usuarios
--drop table tipos
--drop table Clientes
--drop table Equipos
--drop table Estado

select * from Clientes, Servicio where IDCliente = 1001 and ID = 1001
select * from Clientes where IDCliente = 1000



select status,count(status)as numero_reparados
from estado
group by status

select * from productos