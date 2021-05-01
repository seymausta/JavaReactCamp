package weekTwoDayOneHWTwo;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setId(1);
		student1.setFirstName("Þeyma");
		student1.setLastName("Usta");
		student1.seteMail("seyma@gmail.com");
		student1.setCreditCardInfo("2345671");
		student1.setAddress("Amasya/Merkez");
		student1.setProfilePicture("Eklendi.");
		student1.setRegisteredCourses("Java + React");
		
		Instructor instructor1 =new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.seteMail("engindemirog@gmail.com");
		instructor1.setProfilePicture("Eklendi.");
		instructor1.setCoursesOfInstructor("Java + React");
		instructor1.setInfo("Yazýlým geliþtirmeye lisede yazýlým bölümünde okurken baþladým.");
		
		User [] users= {student1,instructor1};
		
		UserManager userManager = new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		studentManager.add(student1);
		instructorManager.add(instructor1);
		

	}

}
