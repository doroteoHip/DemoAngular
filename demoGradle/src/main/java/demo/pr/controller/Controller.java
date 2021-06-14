package demo.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.pr.bo.IBoCostumerSrvice;
import demo.pr.dto.DetalleCostumer;
import demo.pr.dto.IParametrosIO;
import demo.pr.entity.Costumers;
import demo.pr.service.ICostumerService;

@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
public class Controller {

	
	@Autowired
	private IBoCostumerSrvice service;
	
	
	@GetMapping("/demo")
	public String demo() {
		return "Hola Spring 2.0.5";
	}
	
	@GetMapping("/c")
	public List<Costumers> getcCost() {
		IParametrosIO pio = new DetalleCostumer(-1);
		return service.getallCostumer(pio);
	}
	
	
  
}
