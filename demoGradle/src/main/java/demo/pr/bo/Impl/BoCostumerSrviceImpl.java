package demo.pr.bo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.pr.bo.IBoCostumerSrvice;
import demo.pr.dao.IDaoCostumer;
import demo.pr.dto.IParametrosIO;
import demo.pr.entity.Costumers;

@Component
public class BoCostumerSrviceImpl  implements IBoCostumerSrvice{
	@Autowired
	private IDaoCostumer daoBD;

	@Override
	public List<Costumers> getallCostumer(IParametrosIO pio) {
		// TODO Auto-generated method stub
		
		System.out.println(daoBD.getAllCostumer(pio).get(0).getAddress()		);
		return daoBD.getAllCostumer(pio);
	}

}
