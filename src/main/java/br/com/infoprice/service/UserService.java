package br.com.infoprice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.infoprice.entity.User;

@Service
public class UserService extends GenericService<User>{
	
	@Autowired
	public UserService(JpaRepository<User, Long> repo) {
		super(repo);
	}

}
