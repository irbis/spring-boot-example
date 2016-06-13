package irbis.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import irbis.springboot.domain.Customer;
import irbis.springboot.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/all-customers")
	@Transactional(readOnly = true)
	public Page<Customer> allCustomers() {
		return this.customerRepository.findAll(new PageRequest(0, 10));
	}
	
}
