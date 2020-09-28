package br.com.infoprice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infoprice.entity.User;
import br.com.infoprice.service.GenericService;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController extends GenericController<User>{
	
	@Autowired
	public UserController(GenericService<User> srv) {
		super(srv);
	}
}
