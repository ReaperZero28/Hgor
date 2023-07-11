package uapOOPLab;

import java.sql.ResultSet;

public class FutsalField extends Transaction {
	
	private String type;
	
	@Override
	public String generateFieldID() {
		Connect connect = Connect.getConnection();
		
		String formatID = "FT000";
		try {
			ResultSet result1 = connect.executeQuery(formatID);
			while(result1.next()) {
				formatID = result1.getNString("fieldID");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		formatID = formatID.substring(2,5);
		int idInt = 0;
		idInt = Integer.parseInt(formatID);
		
		int newIDInt = idInt + 1;
		String newFormatID = String.format("FT%03d", idInt);
		
		return newFormatID;
	}
	
	public FutsalField(String fieldID, String grade, String status, String type) {
		super(fieldID, grade, status);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
