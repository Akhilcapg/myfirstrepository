package com.mobilemodel.serviceimpl;



import com.mobilemodel.entity.Customer;
import com.mobilemodel.exception.CustomerNotFoundException;
import com.mobilemodel.repository.CustomerRepository;
import com.mobilemodel.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        if (customer.isPresent()) {
            return customer.get();
        } else {
            throw new CustomerNotFoundException(customerId);
        }
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long customerId, Customer customer) {
        if (customerRepository.existsById(customerId)) {
            customer.setCustomerId(customerId);
            return customerRepository.save(customer);
        }
        return null; // Handle this as needed, e.g., return a meaningful error response.
    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
