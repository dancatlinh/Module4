package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
     List<Customer> findAllCustomer();

     Customer findById(int id);

     void addCustomer(Customer customer);

     void editCustomer (int id, Customer customer);

    void remove(int id);
}
