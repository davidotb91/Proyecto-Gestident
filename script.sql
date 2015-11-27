/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     27 nov. 2015 3:25:28:PM                      */
/*==============================================================*/


drop table if exists ADMINISTRADOR;

drop table if exists CITA;

drop table if exists DOCTOR;

drop table if exists FICHA_CLINICA;

drop table if exists HISTORIA_CLINICA;

drop table if exists PACIENTE;

/*==============================================================*/
/* Table: ADMINISTRADOR                                         */
/*==============================================================*/
create table ADMINISTRADOR
(
   ID_ADMINISTRADOR     int not null,
   CI_ADMINISTRADOR     char(10) not null,
   NOMBRE_ADIMINISTRADOR char(20) not null,
   PASSWORD_ADMINISTRADOR char(15) not null,
   primary key (ID_ADMINISTRADOR)
);

/*==============================================================*/
/* Table: CITA                                                  */
/*==============================================================*/
create table CITA
(
   ID_CITA              int not null,
   ID_PACIENTE          int,
   ID_DOCTOR            int,
   FECHA_CITA_MEDICA    date not null,
   HORA_CITA_MEDICA     time not null,
   CODIGO_CITA_MEDICA   char(10) not null,
   primary key (ID_CITA)
);

/*==============================================================*/
/* Table: DOCTOR                                                */
/*==============================================================*/
create table DOCTOR
(
   ID_DOCTOR            int not null,
   NOMBRES_DOCTOR       char(20) not null,
   APELLIDOS_DOCTOR     char(20) not null,
   CI_DOCTOR            char(10) not null,
   ESPECIALIDAD_DOCTOR  char(20) not null,
   NUM_CONSULTORIO_DOCTOR int not null,
   EMAIL_DOCTOR         char(20) not null,
   TELEFONO_FIJO_DOCTOR int not null,
   CELULAR_DOCTOR       int not null,
   FECHA_NACIMIENTO_DOCTOR date not null,
   PASSWORD_DOCTOR      char(20) not null,
   primary key (ID_DOCTOR)
);

/*==============================================================*/
/* Table: FICHA_CLINICA                                         */
/*==============================================================*/
create table FICHA_CLINICA
(
   ID_FICHA_CLINICA     int not null,
   ID_HISTORIA_CLINICA  int,
   FECHA_FICHA_CLINICA  date not null,
   NUM_FICHA_CLINICA    int not null,
   primary key (ID_FICHA_CLINICA)
);

/*==============================================================*/
/* Table: HISTORIA_CLINICA                                      */
/*==============================================================*/
create table HISTORIA_CLINICA
(
   ID_HISTORIA_CLINICA  int not null,
   ID_FICHA_CLINICA     int,
   ID_DOCTOR            int,
   FECHA_HISTORIA_CLINICA date not null,
   MOTIVO_HISTORIA_CLINICA char(20) not null,
   NUM_HISTORIA_CLINICA int not null,
   CODICO_HISTORIA_CLINICA char(10) not null,
   REGISTRO_DENTAL_FICHA_DENTAL char(20),
   DIAGNOSTICO_FICHA_DENTAL char(250),
   primary key (ID_HISTORIA_CLINICA)
);

/*==============================================================*/
/* Table: PACIENTE                                              */
/*==============================================================*/
create table PACIENTE
(
   ID_PACIENTE          int not null,
   ID_HISTORIA_CLINICA  int,
   ID_CITA              int,
   NOMBRES_PACIENTE     char(20) not null,
   APELLIDOS_PACIENTE   char(20) not null,
   CI_PACIENTE          char(10) not null,
   EMAIL_PACIENTE       char(20) not null,
   TELEFONO_FIJO_PACIENTE date not null,
   CELULAR_PACIENTE     int,
   PASSWORD_PACIENTE    int not null,
   TIPO_SANGRE_PACIENTE char(4),
   ALERGIAS_PACIENTE    char(200),
   primary key (ID_PACIENTE)
);

alter table CITA add constraint FK_RELATIONSHIP_1 foreign key (ID_DOCTOR)
      references DOCTOR (ID_DOCTOR);

alter table CITA add constraint FK_RELATIONSHIP_3 foreign key (ID_PACIENTE)
      references PACIENTE (ID_PACIENTE);

alter table FICHA_CLINICA add constraint FK_RELATIONSHIP_6 foreign key (ID_HISTORIA_CLINICA)
      references HISTORIA_CLINICA (ID_HISTORIA_CLINICA);

alter table HISTORIA_CLINICA add constraint FK_RELATIONSHIP_4 foreign key (ID_DOCTOR)
      references DOCTOR (ID_DOCTOR);

alter table HISTORIA_CLINICA add constraint FK_RELATIONSHIP_7 foreign key (ID_FICHA_CLINICA)
      references FICHA_CLINICA (ID_FICHA_CLINICA);

alter table PACIENTE add constraint FK_RELATIONSHIP_2 foreign key (ID_CITA)
      references CITA (ID_CITA);

alter table PACIENTE add constraint FK_RELATIONSHIP_5 foreign key (ID_HISTORIA_CLINICA)
      references HISTORIA_CLINICA (ID_HISTORIA_CLINICA);

