create database TiendaPintura;

use TiendaPintura; 

create table categoria(
	id_categoria int auto_increment primary key,
    nombre varchar(50) not null unique
);

create table subcategoria(
	id_subcategoria int auto_increment primary key,
    id_categoria_r int not null unique,
    nombre varchar(50) not null,
    foreign key(id_categoria_r) references categoria (id_categoria)
);

create table producto(
	id_producto int auto_increment primary key,
    nombre varchar(50) not null,
    descripcion varchar(200),
    #id_categoria int not null unique,
    id_subcategoria_r int unique,
    precio decimal(10,2) not null,
    stock int not null default 0,
    #foreign key(id_categoria) references categoria (id_categoria),
    foreign key(id_subcategoria_r) references subcategoria (id_subcategoria)
);

create table cliente(
	id_cliente int auto_increment primary key,
    #metodo_pago varchar(20) not null 
    nombre varchar(50) not null,
    apellidos_m varchar(50) not null,
    apellidos_p varchar(50) not null,
    telefono varchar(20),
    direccion varchar(120) not null
);

create table venta(
	id_venta int auto_increment primary key,
    id_cliente_r int not null,
    id_producto_r int not null,
    fecha date,
    cantidad int not null,
    total decimal (10,2) not null,
    foreign key(id_cliente_r) references cliente (id_cliente),
    foreign key(id_producto_r) references producto (id_producto)
);

create table ticket(
	id_ticket int auto_increment primary key,
    id_venta_r int not null,
    id_producto_r int not null,
    subtotal  decimal(10,2) not null,
    foreign key(id_venta_r) references venta (id_venta),
    foreign key(id_producto_r) references producto (id_producto)
); 