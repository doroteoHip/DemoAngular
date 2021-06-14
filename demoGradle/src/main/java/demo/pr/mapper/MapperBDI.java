package demo.pr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import demo.pr.dto.IParametrosIO;

@Mapper
public interface MapperBDI {
	/*
	@Select("{"
			+ "#{lstCostumers,mode=OUT,jdbcType=CURSOR, resultMap=rm_Tdoc}="
			+ "call" + "COSTUMER.FNLSTCOSTUMS("
			+ "#{opcion            ,mode=IN, jdbcType=INTEGER }"
			//+ "#{opcion             ,mode=IN, jdbcType=INTEGER }"
			+ ")"
			+ "}")
	@Options(statementType = StatementType.CALLABLE)
	
	*/
	
	@Select("{"
			+ "#{lstCostumers,mode=OUT,jdbcType=CURSOR, resultMap=rm_Tdoc}="
			+ "call" + "USRDHIPOLITO.SPLSTCOUTUMER1("
			+ "#{pa_idcostumer            ,mode=IN, jdbcType=INTEGER }"
			+ ")"
			+ "}")
	@Options(statementType = StatementType.CALLABLE)
	
	public void getlstTPDocs(IParametrosIO pIO);

}
