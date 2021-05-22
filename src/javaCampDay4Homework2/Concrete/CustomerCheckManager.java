package javaCampDay4Homework2.Concrete;

import javaCampDay4Homework2.Abstract.CustomerCheckService;
import javaCampDay4Homework2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	
	@Override
	
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}
}
