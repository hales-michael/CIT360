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
		
		// Hard-coded student details to be printed to screen by the controller
		student.setFirstName("Wesley");
		student.setLastName("Crusher");
		student.setBirthDate("3/14/2347");
		student.setGradeLevel("Senior");
		
		return student;
		
	}
}


