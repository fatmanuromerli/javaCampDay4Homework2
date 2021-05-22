package javaCampDay4Homework2.Concrete;



import javaCampDay4Homework2.Entities.Customer;
import javaCampDay4Homework2.Abstract.BaseCustomerManager;
import javaCampDay4Homework2.Abstract.CustomerCheckService;



public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
}
