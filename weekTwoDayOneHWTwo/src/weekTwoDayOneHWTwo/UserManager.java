package weekTwoDayOneHWTwo;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý "+user.getFirstName()+" "+user.getLastName()+" eklendi.");
	}
	
	public void addMultipleUser(User[]users) {
		
		for(User user : users) {
			add(user);
		}
	}

}
