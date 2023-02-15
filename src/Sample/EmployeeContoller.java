package Sample;

public class EmployeeContoller {
	private EmployeModel model;
	private EmployeView view;
	
	
	public EmployeeContoller(EmployeModel model,EmployeView view) {
		this.model=model;
		this.view = view;
	}


	public String setEmployeeName(String name) {
		return model.getEmployeeName();
	}
	
	
	
	
	

}
