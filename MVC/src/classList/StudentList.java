package classList;

public class StudentList {

	public static void main(String[] args) {
		
		studentModel model = getStudentDetails();
		
		studentView view = new studentView();
		studentController sc = new studentController(model, view);
		
		sc.updateView();
			
	}

	private static studentModel getStudentDetails() {
	
		studentModel student = new studentModel();
		
		student.setFirstName("Joe");
		student.setLastName("Schmoe");
		student.setBirthDate("5/15/1975");
		student.setGradeLevel("Senior");
		
		return student;
		
	}
}


