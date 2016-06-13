package irbis.springboot.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import irbis.springboot.domain.Customer;

public interface CustomerRepository extends Repository<Customer, Long>{
	Page<Customer> findAll(Pageable pageable);
	
	Page<Customer> findByLastName(String lastname, Pageable pageable);
}
