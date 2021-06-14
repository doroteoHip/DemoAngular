package demo.pr.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import demo.pr.dao.IDaoCostumer;
import demo.pr.dto.DetalleCostumer;
import demo.pr.dto.IParametrosIO;
import demo.pr.entity.Costumers;
import demo.pr.mapper.MapperBDI;
@Repository
public class DaoCostumerImpl implements IDaoCostumer {
	@Autowired
	private MapperBDI accesoDB;

	@Override
	public List<Costumers> getAllCostumer(IParametrosIO pio) {
		accesoDB.getlstTPDocs(pio);
		System.out.println();
		return ((DetalleCostumer)pio).getLstCostumers();
	}

}
