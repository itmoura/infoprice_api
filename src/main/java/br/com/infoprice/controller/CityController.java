package br.com.infoprice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infoprice.entity.City;
import br.com.infoprice.service.GenericService;

@CrossOrigin
@RestController
@RequestMapping("/city")
public class CityController extends GenericController<City>{
	
	@Autowired
	public CityController(GenericService<City> srv) {
		super(srv);
	}

}
