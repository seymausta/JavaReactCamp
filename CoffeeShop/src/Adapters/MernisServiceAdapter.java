package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;
import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap client= new KPSPublicSoapProxy();
		
		boolean result = false; 
		
		try {
		return client.TCKimlikNoDogrula(
				Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
				);
		
		} catch (NumberFormatException e) {
		
		e.printStackTrace();
		} catch (RemoteException e) {
		
		e.printStackTrace();
		}
		
		return result;


}
}