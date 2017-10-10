
CREATE TABLE alumno
(
	cod_alum             INTEGER NOT NULL ,
	nom_alum             VARCHAR2(30) NULL ,
	ape_alum             VARCHAR2(30) NULL ,
	dni_alum             INTEGER NOT NULL ,
	ingr_alum            VARCHAR2(18) NULL ,
	fch_nac_alum         DATE NULL ,
	correo_alum          VARCHAR2(50) NULL ,
	telf1_alum           INTEGER NULL ,
	telf2_alum           INTEGER NULL ,
	dir_alum             VARCHAR2(30) NULL ,
	ref_alum             VARCHAR2(80) NULL ,
	dir_orig             VARCHAR2(30) NULL ,
	ref_orig             VARCHAR2(80) NULL ,
	dpto_orig            VARCHAR2(30) NULL ,
	prov_orig            VARCHAR2(30) NULL ,
	dis_orig             VARCHAR2(30) NULL ,
	dpto_alum            VARCHAR2(30) NULL ,
	prov_alum            VARCHAR2(30) NULL ,
	dis_alum             VARCHAR2(30) NULL ,
	est_alum             VARCHAR2(1) NULL ,
	car_alum             VARCHAR2(10) NULL 
);

CREATE UNIQUE INDEX XPKalumno ON alumno
(cod_alum   ASC);

ALTER TABLE alumno
	ADD CONSTRAINT  XPKalumno PRIMARY KEY (cod_alum);

CREATE TABLE aula
(
	cod_aula             VARCHAR2(18) NOT NULL ,
	sem_aula             VARCHAR2(18) NULL ,
	year_aula            VARCHAR2(18) NULL 
);

CREATE UNIQUE INDEX XPKaula ON aula
(cod_aula   ASC);

ALTER TABLE aula
	ADD CONSTRAINT  XPKaula PRIMARY KEY (cod_aula);

CREATE TABLE c_evaluacion
(
	cod_ceval            VARCHAR2(20) NOT NULL ,
	nom_ceval            VARCHAR2(18) NULL ,
	tip_ceval            VARCHAR2(18) NULL ,
	peso_ceval           VARCHAR2(18) NULL ,
	year_ceval           VARCHAR2(18) NULL ,
	est_ceval            VARCHAR2(20) NULL 
);

CREATE UNIQUE INDEX XPKc_evaluacion ON c_evaluacion
(cod_ceval   ASC);

ALTER TABLE c_evaluacion
	ADD CONSTRAINT  XPKc_evaluacion PRIMARY KEY (cod_ceval);

CREATE TABLE c_monitoreo
(
	cod_cmon             INTEGER NOT NULL ,
	nom_cmon             VARCHAR2(40) NULL ,
	max_cmon             INTEGER NULL ,
	year_cmon            DATE NULL ,
	est_cmon             VARCHAR2(18) NULL 
);

CREATE UNIQUE INDEX XPKc_monitoreo ON c_monitoreo
(cod_cmon   ASC);

ALTER TABLE c_monitoreo
	ADD CONSTRAINT  XPKc_monitoreo PRIMARY KEY (cod_cmon);

CREATE TABLE carrera
(
	cod_car              VARCHAR2(18) NOT NULL ,
	mod_car              VARCHAR2(18) NULL ,
	name_car             VARCHAR2(18) NULL ,
	year_car             VARCHAR2(18) NULL 
);

CREATE UNIQUE INDEX XPKcarrera ON carrera
(cod_car   ASC);

ALTER TABLE carrera
	ADD CONSTRAINT  XPKcarrera PRIMARY KEY (cod_car);

CREATE TABLE departamento
(
	cod_dpto             INTEGER NOT NULL ,
	departamento         VARCHAR2(40) NULL 
);

CREATE UNIQUE INDEX XPKdepartamento ON departamento
(cod_dpto   ASC);

ALTER TABLE departamento
	ADD CONSTRAINT  XPKdepartamento PRIMARY KEY (cod_dpto);

CREATE TABLE empresa
(
	cod_emp              varchar2(03) NOT NULL ,
	nom_emp              VARCHAR2(30) NULL ,
	enc_emp              VARCHAR2(30) NULL ,
	telf1_emp            INTEGER NULL ,
	telf2_amp            INTEGER NULL ,
	dir_emp              VARCHAR2(50) NULL ,
	ref_emp              VARCHAR2(80) NULL ,
	doc_emp              VARCHAR2(18) NULL ,
	telf3_emp            INTEGER NULL ,
	dpto_emp             VARCHAR2(30) NULL ,
	prov_emp             VARCHAR2(30) NULL ,
	dis_emp              VARCHAR2(30) NULL 
);

CREATE UNIQUE INDEX XPKempresa ON empresa
(cod_emp   ASC);

ALTER TABLE empresa
	ADD CONSTRAINT  XPKempresa PRIMARY KEY (cod_emp);

CREATE TABLE Empleos
(
	id_emp               CHAR(18) NOT NULL ,
	cod_alum             INTEGER NULL ,
	cod_emp              varchar2(03) NULL ,
	fech_init            DATE NULL ,
	fech_final           DATE NULL ,
	time_emp             VARCHAR2(5) NULL ,
	flag_time            char(1) NULL 
);

CREATE UNIQUE INDEX XPKEmpleos ON Empleos
(id_emp   ASC);

ALTER TABLE Empleos
	ADD CONSTRAINT  XPKEmpleos PRIMARY KEY (id_emp);

CREATE TABLE evaluacion
(
	fch_eval             DATE NULL ,
	cod_prac             VARCHAR2(30) NOT NULL ,
	cod_eval             VARCHAR2(30) NOT NULL ,
	tot_eval             INTEGER NULL ,
	est_eval             VARCHAR2(2) NULL 
);

CREATE UNIQUE INDEX XPKevaluacion ON evaluacion
(cod_eval   ASC);

ALTER TABLE evaluacion
	ADD CONSTRAINT  XPKevaluacion PRIMARY KEY (cod_eval);

CREATE TABLE ficha_monitoreo
(
	cod_fmon             VARCHAR2(30) NOT NULL ,
	fech_fmon            DATE NULL ,
	nota_fmon            VARCHAR2(18) NULL ,
	cod_prac             VARCHAR2(30) NULL ,
	est_mon              VARCHAR2(2) NULL 
);

CREATE UNIQUE INDEX XPKficha_monitoreo ON ficha_monitoreo
(cod_fmon   ASC);

ALTER TABLE ficha_monitoreo
	ADD CONSTRAINT  XPKficha_monitoreo PRIMARY KEY (cod_fmon);

CREATE TABLE detalle_monitoreo
(
	cod_fmon             VARCHAR2(30) NOT NULL ,
	cal_dmon             DECIMAL(1,2) NULL ,
	cod_cmon             INTEGER NOT NULL ,
	cod_dmon             INTEGER NOT NULL 
);

CREATE UNIQUE INDEX XPKdetalle_monitoreo ON detalle_monitoreo
(cod_dmon   ASC);

ALTER TABLE detalle_monitoreo
	ADD CONSTRAINT  XPKdetalle_monitoreo PRIMARY KEY (cod_dmon);

CREATE TABLE h_evaluacion
(
	cod_heval            VARCHAR2(18) NOT NULL ,
	tot_heval            INTEGER NULL ,
	st1_heval            VARCHAR2(18) NULL ,
	st2_heval            VARCHAR2(18) NULL ,
	st3_heval            VARCHAR2(18) NULL ,
	cod_eval             VARCHAR2(30) NOT NULL 
);

CREATE UNIQUE INDEX XPKh_evaluacion ON h_evaluacion
(cod_heval   ASC);

ALTER TABLE h_evaluacion
	ADD CONSTRAINT  XPKh_evaluacion PRIMARY KEY (cod_heval);

CREATE TABLE detalle_evaluacion
(
	cod_eval             VARCHAR2(30) NOT NULL ,
	cod_ceval            VARCHAR2(20) NOT NULL ,
	cal_deval            VARCHAR2(18) NULL ,
	cod_deval            INTEGER NOT NULL 
);

CREATE UNIQUE INDEX XPKdetalle_evaluacion ON detalle_evaluacion
(cod_deval   ASC);

ALTER TABLE detalle_evaluacion
	ADD CONSTRAINT  XPKdetalle_evaluacion PRIMARY KEY (cod_deval);

CREATE TABLE matricula
(
	cod_aula             VARCHAR2(18) NULL ,
	cod_alum             INTEGER NULL ,
	Fech_matri           date NULL ,
	cod_matri            VARCHAR2(18) NOT NULL 
);

CREATE UNIQUE INDEX XPKmatricula ON matricula
(cod_matri   ASC);

ALTER TABLE matricula
	ADD CONSTRAINT  XPKmatricula PRIMARY KEY (cod_matri);

CREATE TABLE monitor
(
	cod_mon              VARCHAR2(3) NOT NULL ,
	dni_per              INTEGER NULL ,
	ape_per              VARCHAR2(50) NULL ,
	fch_nac_per          DATE NULL ,
	sexo_per             VARCHAR2(18) NULL ,
	correo_per           VARCHAR2(80) NULL ,
	telf_per             INTEGER NULL ,
	dir_per              VARCHAR2(80) NULL ,
	distr_per            VARCHAR2(50) NULL ,
	espc_per             VARCHAR2(60) NULL ,
	cargo_per            VARCHAR2(60) NULL ,
	nom_per              VARCHAR2(50) NULL 
);

CREATE UNIQUE INDEX XPKmonitor ON monitor
(cod_mon   ASC);

ALTER TABLE monitor
	ADD CONSTRAINT  XPKmonitor PRIMARY KEY (cod_mon);

CREATE TABLE practicas
(
	cod_prac             VARCHAR2(30) NOT NULL ,
	fch_ini_prac         DATE NULL ,
	fch_fin_prac         DATE NULL ,
	cod_emp              varchar2(03) NOT NULL ,
	est_prac             VARCHAR2(18) NULL ,
	cod_alum             INTEGER NULL ,
	fch1_prac            DATE NULL ,
	est1_prac            VARCHAR2(18) NULL ,
	fch2_prac            DATE NULL ,
	est2_prac            VARCHAR2(18) NULL ,
	fch3_prac            DATE NULL ,
	est3_prac            VARCHAR2(18) NULL ,
	fch4_prac            DATE NULL ,
	est4_prac            VARCHAR2(18) NULL ,
	fch5_prac            DATE NULL ,
	est5_prac            VARCHAR2(18) NULL ,
	fch6_prac            DATE NULL ,
	est6_prac            VARCHAR2(18) NULL ,
	fch7_prac            DATE NULL ,
	est7_prac            VARCHAR2(18) NULL ,
	fch8_prac            DATE NULL ,
	est8_prac            VARCHAR2(18) NULL ,
	fch9_prac            DATE NULL ,
	est9_prac            VARCHAR2(18) NULL ,
	fch10_prac           DATE NULL ,
	est10_prac           VARCHAR2(18) NULL ,
	fch11_prac           DATE NULL ,
	est11_prac           VARCHAR2(18) NULL ,
	fch12_prac           DATE NULL ,
	est12_prac           VARCHAR2(18) NULL ,
	asig_prad            VARCHAR2(2) NULL 
);

CREATE UNIQUE INDEX XPKpracticas ON practicas
(cod_prac   ASC);

ALTER TABLE practicas
	ADD CONSTRAINT  XPKpracticas PRIMARY KEY (cod_prac);

CREATE TABLE provincia
(
	cod_pro              INTEGER NOT NULL ,
	provincia            VARCHAR2(40) NULL ,
	cod_dpto             INTEGER NULL 
);

CREATE UNIQUE INDEX XPKprovincia ON provincia
(cod_pro   ASC);

ALTER TABLE provincia
	ADD CONSTRAINT  XPKprovincia PRIMARY KEY (cod_pro);

CREATE TABLE distrito
(
	cod_dis              INTEGER NOT NULL ,
	distrito             VARCHAR2(40) NULL ,
	cod_pro              INTEGER NULL 
);

CREATE UNIQUE INDEX XPKdistrito ON distrito
(cod_dis   ASC);

ALTER TABLE distrito
	ADD CONSTRAINT  XPKdistrito PRIMARY KEY (cod_dis);

CREATE TABLE Recover
(
	cod_rec              INTEGER NOT NULL ,
	user_rec             VARCHAR2(18) NULL ,
	pass_rec             VARCHAR2(18) NULL ,
	ref_rec              VARCHAR2(255) NULL ,
	correo_rec           VARCHAR2(80) NULL ,
	celular              INTEGER NULL ,
	fch_system           DATE NULL 
);

CREATE UNIQUE INDEX XPKRecover ON Recover
(cod_rec   ASC);

ALTER TABLE Recover
	ADD CONSTRAINT  XPKRecover PRIMARY KEY (cod_rec);

CREATE TABLE usuarios
(
	cod_user             INTEGER NOT NULL ,
	nom_user             VARCHAR2(30) NULL ,
	pass_user            VARCHAR2(50) NULL ,
	nivel_user           VARCHAR2(18) NULL 
);

CREATE UNIQUE INDEX XPKusuarios ON usuarios
(cod_user   ASC);

ALTER TABLE usuarios
	ADD CONSTRAINT  XPKusuarios PRIMARY KEY (cod_user);

ALTER TABLE Empleos
	ADD (CONSTRAINT R_107 FOREIGN KEY (cod_alum) REFERENCES alumno (cod_alum) ON DELETE SET NULL);

ALTER TABLE Empleos
	ADD (CONSTRAINT R_108 FOREIGN KEY (cod_emp) REFERENCES empresa (cod_emp) ON DELETE SET NULL);

ALTER TABLE evaluacion
	ADD (CONSTRAINT R_67 FOREIGN KEY (cod_prac) REFERENCES practicas (cod_prac));

ALTER TABLE ficha_monitoreo
	ADD (CONSTRAINT R_77 FOREIGN KEY (cod_prac) REFERENCES practicas (cod_prac) ON DELETE SET NULL);

ALTER TABLE detalle_monitoreo
	ADD (CONSTRAINT R_73 FOREIGN KEY (cod_fmon) REFERENCES ficha_monitoreo (cod_fmon));

ALTER TABLE detalle_monitoreo
	ADD (CONSTRAINT R_80 FOREIGN KEY (cod_cmon) REFERENCES c_monitoreo (cod_cmon));

ALTER TABLE h_evaluacion
	ADD (CONSTRAINT R_81 FOREIGN KEY (cod_eval) REFERENCES evaluacion (cod_eval));

ALTER TABLE detalle_evaluacion
	ADD (CONSTRAINT R_68 FOREIGN KEY (cod_eval) REFERENCES evaluacion (cod_eval));

ALTER TABLE detalle_evaluacion
	ADD (CONSTRAINT R_70 FOREIGN KEY (cod_ceval) REFERENCES c_evaluacion (cod_ceval));

ALTER TABLE matricula
	ADD (CONSTRAINT R_64 FOREIGN KEY (cod_aula) REFERENCES aula (cod_aula) ON DELETE SET NULL);

ALTER TABLE matricula
	ADD (CONSTRAINT R_66 FOREIGN KEY (cod_alum) REFERENCES alumno (cod_alum) ON DELETE SET NULL);

ALTER TABLE practicas
	ADD (CONSTRAINT R_59 FOREIGN KEY (cod_emp) REFERENCES empresa (cod_emp));

ALTER TABLE practicas
	ADD (CONSTRAINT R_82 FOREIGN KEY (cod_alum) REFERENCES alumno (cod_alum) ON DELETE SET NULL);

ALTER TABLE provincia
	ADD (CONSTRAINT R_102 FOREIGN KEY (cod_dpto) REFERENCES departamento (cod_dpto) ON DELETE SET NULL);

ALTER TABLE distrito
	ADD (CONSTRAINT R_103 FOREIGN KEY (cod_pro) REFERENCES provincia (cod_pro) ON DELETE SET NULL);

--REGISTRO DE ALUMNOS
Insert into MASTERVG.ALUMNO (COD_ALUM,NOM_ALUM,APE_ALUM,DNI_ALUM,INGR_ALUM,FCH_NAC_ALUM,CORREO_ALUM,TELF1_ALUM,TELF2_ALUM,DIR_ALUM,REF_ALUM,DIR_ORIG,REF_ORIG,DPTO_ORIG,PROV_ORIG,DIS_ORIG,DPTO_ALUM,PROV_ALUM,DIS_ALUM,EST_ALUM,CAR_ALUM) values ('73183532','SEBASTIAN','LEYVA','73183532','ORDINARIO',to_date('02/08/99','DD/MM/RR'),null,'963020871',null,null,null,null,null,'LIMA','CAÑETE','QUILMANA','LIMA','CAÑETE','QUILMANA','A','ADS');
Insert into MASTERVG.ALUMNO (COD_ALUM,NOM_ALUM,APE_ALUM,DNI_ALUM,INGR_ALUM,FCH_NAC_ALUM,CORREO_ALUM,TELF1_ALUM,TELF2_ALUM,DIR_ALUM,REF_ALUM,DIR_ORIG,REF_ORIG,DPTO_ORIG,PROV_ORIG,DIS_ORIG,DPTO_ALUM,PROV_ALUM,DIS_ALUM,EST_ALUM,CAR_ALUM) values ('76350841','ALVARO','ITURRIZAGA','76350841','CICLOCERO',to_date('18/03/99','DD/MM/RR'),null,'951403587',null,'JR. BELLAVISTA 138',null,'JR. BELLAVISTA 138','COLISEO DE GALLOS','LIMA','CAÑETE','SAN VICENTE','LIMA','CAÑETE','SAN VICENTE','A','ADS');
Insert into MASTERVG.ALUMNO (COD_ALUM,NOM_ALUM,APE_ALUM,DNI_ALUM,INGR_ALUM,FCH_NAC_ALUM,CORREO_ALUM,TELF1_ALUM,TELF2_ALUM,DIR_ALUM,REF_ALUM,DIR_ORIG,REF_ORIG,DPTO_ORIG,PROV_ORIG,DIS_ORIG,DPTO_ALUM,PROV_ALUM,DIS_ALUM,EST_ALUM,CAR_ALUM) values ('72720518','DIEGO','ROJAS','72720518','CICLOCERO',to_date('24/07/99','DD/MM/RR'),null,'923820545',null,'ARCO DE SAN AGUSTIN',null,'MZ. S LT. 22','ARCO DE SAN AGUSTIN','LIMA','CAÑETE','SAN VICENTE','LIMA','CAÑETE','SAN VICENTE','A','ADS');
Insert into MASTERVG.ALUMNO (COD_ALUM,NOM_ALUM,APE_ALUM,DNI_ALUM,INGR_ALUM,FCH_NAC_ALUM,CORREO_ALUM,TELF1_ALUM,TELF2_ALUM,DIR_ALUM,REF_ALUM,DIR_ORIG,REF_ORIG,DPTO_ORIG,PROV_ORIG,DIS_ORIG,DPTO_ALUM,PROV_ALUM,DIS_ALUM,EST_ALUM,CAR_ALUM) values ('73936529','CESAR','BARRAZA','73936529','CICLOCERO',to_date('09/09/98','DD/MM/RR'),null,'933374046',null,'DOS DE MAYO',null,'DOS DE MAYO','POSTA ','LIMA','CAÑETE','ROMA','LIMA','CAÑETE','ROMA','A','ADS');
Insert into MASTERVG.ALUMNO (COD_ALUM,NOM_ALUM,APE_ALUM,DNI_ALUM,INGR_ALUM,FCH_NAC_ALUM,CORREO_ALUM,TELF1_ALUM,TELF2_ALUM,DIR_ALUM,REF_ALUM,DIR_ORIG,REF_ORIG,DPTO_ORIG,PROV_ORIG,DIS_ORIG,DPTO_ALUM,PROV_ALUM,DIS_ALUM,EST_ALUM,CAR_ALUM) values ('70571491','ANTONY','LOAYZA','70571491','CICLOCERO',to_date('16/02/97','DD/MM/RR'),null,'993784215',null,'MONTALVAN',null,'MONTALVAN','SOYUS','LIMA','YAUYOS','CANCHAN','LIMA','YAUYOS','CANCHAN','A','ADS');
Insert into MASTERVG.ALUMNO (COD_ALUM,NOM_ALUM,APE_ALUM,DNI_ALUM,INGR_ALUM,FCH_NAC_ALUM,CORREO_ALUM,TELF1_ALUM,TELF2_ALUM,DIR_ALUM,REF_ALUM,DIR_ORIG,REF_ORIG,DPTO_ORIG,PROV_ORIG,DIS_ORIG,DPTO_ALUM,PROV_ALUM,DIS_ALUM,EST_ALUM,CAR_ALUM) values ('71448172','ANTONIO','ARAUJO','71448172','CICLOCERO',to_date('28/04/99','DD/MM/RR'),null,'947888114',null,'URBANIZACION LIBERTAD',null,'JAEN CITY',null,'CAJAMARCA','JAEN','JAEN','CAJAMARCA','JAEN','JAEN','A','ADS');

--REGISTRO DE EMPRESAS
Insert into MASTERVG.EMPRESA (COD_EMP,NOM_EMP,ENC_EMP,TELF1_EMP,TELF2_AMP,DIR_EMP,REF_EMP,DOC_EMP,TELF3_EMP,DPTO_EMP,PROV_EMP,DIS_EMP) values ('001','CI JEANPAUL','EDWIN SIERRA','15646203','12356410','JR. 2 DE MAYO','AAL COSTADO DE MOVISTAR','20134679852',null,'LIMA','CAÑETE','SAN VICENTE');
Insert into MASTERVG.EMPRESA (COD_EMP,NOM_EMP,ENC_EMP,TELF1_EMP,TELF2_AMP,DIR_EMP,REF_EMP,DOC_EMP,TELF3_EMP,DPTO_EMP,PROV_EMP,DIS_EMP) values ('002','HUARCO','GIANCARLO TICLAYAURI','18523465',null,'AV. CONDORAY 149','POR EL INSTITUTO CONDORAY','20136520144',null,'LIMA','CAÑETE','SAN VICENTE');
Insert into MASTERVG.EMPRESA (COD_EMP,NOM_EMP,ENC_EMP,TELF1_EMP,TELF2_AMP,DIR_EMP,REF_EMP,DOC_EMP,TELF3_EMP,DPTO_EMP,PROV_EMP,DIS_EMP) values ('003','SERVI FAST','OSCAR ANCAJIMA','19187965',null,'AV. LOS MUERTITOS','POR EL CEMENTERIO SAN LUIS','20121478692',null,'LIMA','CAÑETE','SAN LUIS');
Insert into MASTERVG.EMPRESA (COD_EMP,NOM_EMP,ENC_EMP,TELF1_EMP,TELF2_AMP,DIR_EMP,REF_EMP,DOC_EMP,TELF3_EMP,DPTO_EMP,PROV_EMP,DIS_EMP) values ('004','COMPUNET','JIREN CARRASCO','19458798',null,'AV. LOS LIBERTADORES','POR EL BANCO DE LA NACION','20147894562',null,'LIMA','CAÑETE','SAN VICENTE');
Insert into MASTERVG.EMPRESA (COD_EMP,NOM_EMP,ENC_EMP,TELF1_EMP,TELF2_AMP,DIR_EMP,REF_EMP,DOC_EMP,TELF3_EMP,DPTO_EMP,PROV_EMP,DIS_EMP) values ('005','AVSA','WILMER  PAYANO','19745457','19456897','CARRETERA A QUILAMAN','EN MEDIO DE LA ENTRADA DE ROMA A QUILAMAN','20157894129',null,'LIMA','CCAÑETE','QUILMANA');

--REGISTRO DE MONITORES
Insert into MASTERVG.MONITOR (COD_MON,DNI_PER,APE_PER,FCH_NAC_PER,SEXO_PER,CORREO_PER,TELF_PER,DIR_PER,DISTR_PER,ESPC_PER,CARGO_PER,NOM_PER) values ('001','72786918','VALENCIA SOTOMAYOR',to_date('04/08/89','DD/MM/RR'),'M','GVALENCIA@VALLEGRANDE.EDU.PE','945897584','URB SAN AGUSTIN MAZ S LT.22','LIMA','ING. SISTEMAS','PROFESOR','GIANCARLO');

--REGISTRO DE USUARIOS
INSERT INTO "MASTERVG"."USUARIOS" (COD_USER, NOM_USER, PASS_USER, NIVEL_USER) VALUES ('1', 'admin', 'admin', 'admin');
INSERT INTO "MASTERVG"."USUARIOS" (COD_USER, NOM_USER, PASS_USER, NIVEL_USER) VALUES ('2', 'user', 'user', 'user');


/*CREATE SEQUENCE usuarios_secuencia START WITH 1 INCREMENT BY 1 NOMAXVALUE;
CREATE TRIGGER TRIG_USER_SEC BEFORE
INSERT ON
.addEventListener},l=function(t){"undefined"!=typeof e&&e.console&&e.console.log("SweetAlert: "+t)},i=function(e,t){e=String(e).replace(/*