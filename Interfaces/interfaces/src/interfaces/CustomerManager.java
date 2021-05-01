package interfaces;

public class CustomerManager {
	
	//loosly - tightly coupled
	
	private Logger[] loggers; //22.53 dinle
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : "+customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer.getFirstName()); //23.38 dinle
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : "+customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());

	}

}
