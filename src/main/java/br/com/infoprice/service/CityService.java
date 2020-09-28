package br.com.infoprice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.infoprice.entity.City;

@Service
public class CityService extends GenericService<City>{
	
	@Autowired
	public CityService(JpaRepository<City, Long> repo) {
		super(repo);
	}
}
