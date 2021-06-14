package demo.pr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.pr.entity.Costumers;
@Service
public interface ICostumerService {
	public boolean saveCostumer(Costumers C1);
	public List<Costumers> getCostumer();

}
