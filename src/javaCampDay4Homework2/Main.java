package javaCampDay4Homework2;

import javaCampDay4Homework2.Abstract.BaseCustomerManager;
import javaCampDay4Homework2.Concrete.StarbucksCustomerManager;
import javaCampDay4Homework2.Entities.Customer;
import javaCampDay4Homework2.adaptor.MernisServiceAdapter;
import javaCampDay4Homework2.Concrete.CustomerCheckManager;
import javaCampDay4Homework2.Concrete.NeroCustomerManager;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
	
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager.save(new Customer(1, "Fatmanur", "Ömerli", LocalDate.of(2001, 4, 23), "51208450500"));
	
	}

}
