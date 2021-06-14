package demo.pr.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import demo.pr.entity.Costumers;

public class DetalleCostumer implements IParametrosIO {
	private Integer id;
	private Integer pa_idcostumer;
	private List<Costumers> lstCostumers;
	public DetalleCostumer(Integer id, Integer pa_idcostumer) {
		super();
		this.id = id;
		this.pa_idcostumer = pa_idcostumer;
	}
	
	
	public DetalleCostumer(Integer pa_idcostumer) {
		super();
		this.pa_idcostumer = pa_idcostumer;
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPa_idcostumer() {
		return pa_idcostumer;
	}


	public void setPa_idcostumer(Integer pa_idcostumer) {
		this.pa_idcostumer = pa_idcostumer;
	}


	public List<Costumers> getLstCostumers() {
		return lstCostumers;
	}


	public void setLstCostumers(List<Costumers> lstCostumers) {
		this.lstCostumers = lstCostumers;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this );
	}
	
	

}
