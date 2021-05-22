package javaCampDay4Homework2.Abstract;

import javaCampDay4Homework2.Entities.Customer;


public abstract class BaseCustomerManager implements CustomerService{
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
	}
}
