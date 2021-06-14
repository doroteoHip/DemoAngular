create or replace function  USRDHIPOLITO.SPLSTCOUTUMER1(
pa_idcostumer in number

)RETURN SYS_REFCURSOR
AS
pa_Lista     SYS_REFCURSOR;
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
   order by FREC.customer_id asc;


RETURN pa_Lista;

      EXCEPTION
        WHEN NO_DATA_FOUND THEN
        ROLLBACK;
       
         --SQLCODE || ' NO HAY PREGUNTAS EN LA BASE DE DATOS  ' || SQLERRM;
          WHEN OTHERS THEN
            ROLLBACK;
              --pa_Codigo:=CSL_MENOSUNO;
              --pa_Motivo:=SQLERRM(SQLCODE);
              dbms_output.put_line('Error2 ' ||SQLERRM(SQLCODE));
END SPLSTCOUTUMER1;
/