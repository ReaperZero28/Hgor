package uapOOPLab;

public abstract class Transaction {
	
	protected String fieldID;
	protected String grade;
	protected String status;
	
	public abstract String generateFieldID();

	public Transaction(String fieldID, String grade, String status) {
		super();
		this.fieldID = fieldID;
		this.grade = grade;
		this.status = status;
	}

	public String getFieldID() {
		return fieldID;
	}

	public String getGrade() {
		return grade;
	}

	public String getStatus() {
		return status;
	}

	public void setFieldID(String fieldID) {
		this.fieldID = fieldID;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
