package demo.pr.bo;

import java.util.List;

import org.springframework.stereotype.Component;

import demo.pr.dto.IParametrosIO;
import demo.pr.entity.Costumers;

@Component
public interface IBoCostumerSrvice {
	public List<Costumers> getallCostumer(IParametrosIO pio);

}

