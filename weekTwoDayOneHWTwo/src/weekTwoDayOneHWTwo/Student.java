package weekTwoDayOneHWTwo;

public class Student extends User {

	private String creditCardInfo;
	private String address;
	private String registeredCourses;
	
	public Student() {
		
	}
	
	public Student(String creditCardInfo, String address, String registeredCourses) {
		super();
		this.creditCardInfo = creditCardInfo;
		this.address = address;
		this.registeredCourses=registeredCourses;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
	
	
}
