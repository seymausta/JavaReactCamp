import java.util.GregorianCalendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter() );
		
		customerManager.save(new Customer(1, "Þeymanur", "Usta","28414043400",new GregorianCalendar(1999, 4, 8).getTime()));
		
		
		
		
	}

}
