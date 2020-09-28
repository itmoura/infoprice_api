package br.com.infoprice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoprice.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
