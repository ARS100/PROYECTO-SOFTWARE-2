CREATE DATABASE proyecto_software;
USE proyecto_software


CREATE TABLE Usuario(
	id_usuario INT AUTO_INCREMENT,
	nombre VARCHAR(25),
	contraseña VARCHAR(10),
	tipo_de_usuario VARCHAR(10),
	PRIMARY KEY (id_usuario)
	
	
);

CREATE TABLE Malteadas(

	id_malteada INT AUTO_INCREMENT,
	tipo_Malteada VARCHAR(15),
	nombre_Malteada VARCHAR(15),
	PRIMARY KEY (id_malteada)

);

CREATE TABLE Helados(

   id_helado INT AUTO_INCREMENT,
   nombre_Helado VARCHAR(20),
   tipo_Helado VARCHAR(20),
   costo_Helado INT,
   PRIMARY KEY (id_helado)
   );
   

CREATE TABLE Cono(
	id_cono INT AUTO_INCREMENT,
	cantidad_Conos INT,
	precio INT,
	FK_id_helados INT,
	PRIMARY KEY (id_cono),
	CONSTRAINT FK_id_helados FOREIGN KEY (FK_id_helados) REFERENCES Helados(id_helado)
	
);
CREATE TABLE Carrito(
	id_carrito INT AUTO_INCREMENT,
	costo INT,
	FK_id_cono INT,
	FK_id_usuario INT,
	FK_id_malteada INT,
	PRIMARY KEY (id_carrito),
	FOREIGN KEY (FK_id_cono) REFERENCES Cono(id_cono),
	FOREIGN KEY (FK_id_usuario) REFERENCES Usuario(id_usuario),
	FOREIGN KEY (FK_id_malteada) REFERENCES Malteadas(id_malteada)
);
