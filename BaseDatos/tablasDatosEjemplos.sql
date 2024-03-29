CREATE TABLE TACATTIPOCUENTA (
    IDTIPOCUENTA        NUMBER NOT NULL,
    TIPO                VARCHAR2(50),
    DESCRIPCION         VARCHAR2(50),
    ACTIVO              NUMBER,
    ULTIMAMODIFICACION  DATE NOT NULL,
    USUARIOMODIFICO     VARCHAR2(50) NOT NULL
)TABLESPACE LMTBSB;
ALTER TABLE TACATTIPOCUENTA ADD CONSTRAINT TACATTIPOCUENTA_PK PRIMARY KEY ( IDTIPOCUENTA );
/

CREATE TABLE TACOSTUMER (
 	CUSTOMER_ID        NUMBER NOT NULL , 
	CUSTOMER_NAME      VARCHAR2(50), 
	ADDRESS            VARCHAR2(50), 
	CITY               VARCHAR2(50), 
	STATE              VARCHAR2(50), 
	ZIP_CODE           VARCHAR2(50), 
	ULTIMAMODIFICACION DATE NOT NULL, 
	USUARIOMODIFICO    VARCHAR2(50) NOT NULL
)TABLESPACE LMTBSB;
ALTER TABLE TACOSTUMER ADD CONSTRAINT TACOSTUMER_PK PRIMARY KEY ( CUSTOMER_ID );
/




Insert into USRDHIPOLITO.TACOSTUMER (CUSTOMER_ID,CUSTOMER_NAME,ADDRESS,CITY,STATE,ZIP_CODE,ULTIMAMODIFICACION,USUARIOMODIFICO) values (1,'Doroteo','ajusco','CDMX','DF','04300',sysdate,user);
Insert into USRDHIPOLITO.TACOSTUMER (CUSTOMER_ID,CUSTOMER_NAME,ADDRESS,CITY,STATE,ZIP_CODE,ULTIMAMODIFICACION,USUARIOMODIFICO) values (2,'Pedro','morelia','morelia','Michoacan','04300',sysdate,user);
Insert into USRDHIPOLITO.TACOSTUMER (CUSTOMER_ID,CUSTOMER_NAME,ADDRESS,CITY,STATE,ZIP_CODE,ULTIMAMODIFICACION,USUARIOMODIFICO) values (3,'Pancho','ajusco','colioma','COLIMA','1400',sysdate,user);

select * FROM  tacostumer;


create or replace PROCEDURE  USRDHIPOLITO.SPLSTCOUTUMER(
pa_idcostumer in number,
pa_Lista  OUT SYS_REFCURSOR,
pa_Codigo OUT VARCHAR2, 
pa_Motivo OUT VARCHAR2
)
AS
CSL_NUMCERO         CONSTANT    NUMBER  := 0;
CSL_NUMUNO          CONSTANT    NUMBER  := 1;
CSL_MENOSUNO          CONSTANT    VARCHAR2(2)  := '-1';
CSL_STATUSCERO          CONSTANT    VARCHAR2(2)  := '0';
BEGIN


  OPEN pa_Lista FOR
  
  
SELECT  frec.customer_id,
        frec.customer_name,
        frec.address,
        frec.city,
        frec.state,
        frec.zip_code
--       FREC.ULTIMAMODIFICACION
  FROM USRDHIPOLITO.TACOSTUMER FREC
 WHERE decode(pa_idcostumer,CSL_MENOSUNO,CSL_MENOSUNO,frec.customer_id)=pa_idcostumer
   order by FREC.ULTIMAMODIFICACION DESC;


   pa_Codigo:=CSL_STATUSCERO;
      EXCEPTION
        WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        pa_Codigo:=CSL_MENOSUNO;
        pa_Motivo:= SQLCODE || ' NO HAY PREGUNTAS EN LA BASE DE DATOS  ' || SQLERRM;
          WHEN OTHERS THEN
            ROLLBACK;
              pa_Codigo:=CSL_MENOSUNO;
              pa_Motivo:=SQLERRM(SQLCODE);
              dbms_output.put_line('Error2 ' ||SQLERRM(SQLCODE));
END SPLSTCOUTUMER;
/