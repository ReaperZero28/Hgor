package uapOOPLab;

import java.sql.ResultSet;

public class BasketField extends Transaction {
	
	private String ringHeight;
	
	@Override
	public String generateFieldID() {
		Connect connect = Connect.getConnection();
		
		String formatID = "BB000";
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
		String newFormatID = String.format("BB%03d", idInt);
		
		return newFormatID;
	}
	
	public BasketField(String fieldID, String grade, String status, String ringHeight) {
		super(fieldID, grade, status);
		this.ringHeight = ringHeight;
	}

	public String getRingHeight() {
		return ringHeight;
	}

	public void setRingHeight(String ringHeight) {
		this.ringHeight = ringHeight;
	}
	
}
