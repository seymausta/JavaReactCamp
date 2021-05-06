package weekTwoDayOneHWTwo;

public class Instructor extends User {
	
	private String info;
	private String coursesOfInstructor;

	public Instructor() {
		
	}
	
	public Instructor(String info, String coursesOfInstructor) {
		super();
		this.info = info;
		this.coursesOfInstructor = coursesOfInstructor;
	}

	

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCoursesOfInstructor() {
		return coursesOfInstructor;
	}

	public void setCoursesOfInstructor(String coursesOfInstructor) {
		this.coursesOfInstructor = coursesOfInstructor;
	}
	
	

}
