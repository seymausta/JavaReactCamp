package weekTwoDayOneHWTwo;

public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String profilePicture;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String eMail, String profilePicture) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.profilePicture = profilePicture;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	
	
	
	
	

}