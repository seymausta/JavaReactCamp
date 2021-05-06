package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws RemoteException,Exception {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new Exception("not a valid person");}
	}



	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return false;
	}
}	
