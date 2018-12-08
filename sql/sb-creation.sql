/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  cassi
 * Created: 07/12/2018
 */

DROP TABLE users;
CREATE TABLE users(
    id BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1)
        , role varchar(200)  not null
        , name varchar (200) not null
        , login varchar (20)  not null
        , passwordHash BIGINT not null
);
INSERT INTO users values
(default, 'ADMIN', 'admininstrador', 'admin', 1509442);





DROP TABLE Paciente;
CREATE TABLE Paciente(
    id BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1)
        ,Nome varchar(100)                 not null
        ,Telefone varchar (12)            not null
        ,CPF varchar (11)                 not null
        ,Email varchar(30)                not null
        ,celular varchar (12)             not null
        ,endereço varchar(80)             not null
        ,RG varchar (12)                  not null 
        ,RGORGEMISSOR varchar(10)         not null
        
       );

DROP TABLE  Medico;
CREATE TABLE Medico
    (id BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1)
        
        ,Nome varchar(100)       not null
        ,Telefone   varchar (12)         not null
        ,endereço varchar(80)           not null
        ,CRM varchar(14)               not null
        ,Especialidade varchar(50)      not null

        


);
DROP TABLE Agenda;
CREATE TABLE Agenda;
(id BIGINT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1)
        ,id_medico int not null,
FOREIGN KEY (id_Medico) REFERENCES Medico(id)
        ,id_paciente int  not null,
 foreign key (id_paciente) references Paciente (id)
);
        
