package classList;

public class studentController {
	
	private studentModel model;
	private studentView view;
	
	public studentController(studentModel model, studentView view) {
		this.model = model;
		this.view = view;
	}

	public void setStudentFirstName(String first) {
		model.setFirstName(first);
	}
		
	public String getStudentFirstName() {
		return model.getFirstName();
	
	}
	
	public void setStudentLastName(String last) {
		model.setLastName(last);
	}
		
	public String getStudentLastName() {
		return model.getLastName();
	
	}
	
	public void setStudentBirthDate(String date) {
		model.setBirthDate(date);
	}
		
	public String getStudentBirthDate() {
		return model.getBirthDate();
	
	}
	
	public void setStudentGradeLevel(String grade) {
		model.setLastName(grade);
	}
		
	public String getStudentGradeLevel() {
		return model.getLastName();
	
	}
	
	public void updateView() {
		view.printStudentDetails(model.getFirstName(), model.getLastName(), model.getBirthDate(), model.getGradeLevel());
	}

}
