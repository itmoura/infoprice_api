package br.com.infoprice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infoprice.entity.Address;
import br.com.infoprice.service.GenericService;

@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddressController extends GenericController<Address> {

	@Autowired
	public AddressController(GenericService<Address> srv) {
		super(srv);
	}
}
