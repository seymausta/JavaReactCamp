package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) throws Exception  {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" veritabanưna kaydedildi.");
	}
}
