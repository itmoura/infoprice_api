package br.com.infoprice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import br.com.infoprice.entity.Address;

@Service
public class AddressService extends GenericService<Address>{

	@Autowired
	public AddressService(JpaRepository<Address, Long> repo) {
		super(repo);
	}
}
