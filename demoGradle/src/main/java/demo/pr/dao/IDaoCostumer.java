package demo.pr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import demo.pr.dto.IParametrosIO;
import demo.pr.entity.Costumers;



@Repository
public interface IDaoCostumer {
	public List<Costumers> getAllCostumer(IParametrosIO pio);

}
