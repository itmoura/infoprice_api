package br.com.infoprice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoprice.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
//	@Query("SELECT a FROM Address a INNER JOIN User u ON a.userId.id = u.id AND u.id = :userId")
//	List<Address> getUserEntityFullNameById(@Param("userId") Integer userId);
	
}