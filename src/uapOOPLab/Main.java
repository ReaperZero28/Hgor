package uapOOPLab;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	Connect connect = Connect.getConnection();
	ArrayList<Transaction> newTransaction = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int menu;
		do {
			menu = 0;
			System.out.println("HGor");
			System.out.println("=======================");
			System.out.println("1. Booking Field");
			System.out.println("2. View Transactions");
			System.out.println("3.Delete Transactions");
			System.out.println("4. Exit");
			System.out.println(">>");
			
			menu = scan.nextInt();
			
			if(menu==1) {
				initialData();
				String fieldID;
				do {
					System.out.println("Input Field ID [must exists (case sensitive)] : ");
					fieldID = scan.nextLine();
				}while(fieldID == "FT%03d" || fieldID == "BB%03d");
				
				int playTime;
				do {
					System.out.println("Input Playing Time [1 - 5 hours] : ");
					playTime = scan.nextInt();
				}while(playTime<1 || playTime>5);
				
				double totalPrice;
				String type;
				String status;
				int basePrice;
				String grade;
				int gradeValue;
				double ringHeight;
				if(type.equals("FT%03d")) {
					if(type.equals("Grass")) {
						if(status.equals("Outdoor")) {
							basePrice = 15000;
						}
						else if(status.equals("Indoor")) {
							basePrice = 10000;
						}
						if(grade.equals("A")) {
							gradeValue = 5000;
						}
						else if(grade.equals("B")) {
							gradeValue = 2000;
						}
						else if(grade.equals("C")) {
							gradeValue = 0;
						}
						totalPrice = (basePrice + gradeValue) * 3;
					}
					else if(type.equals("Floor")) {
						if(status.equals("Outdoor")) {
							basePrice = 15000;
						}
						else if(status.equals("Indoor")) {
							basePrice = 10000;
						}
						if(grade.equals("A")) {
							gradeValue = 5000;
						}
						else if(grade.equals("B")) {
							gradeValue = 2000;
						}
						else if(grade.equals("C")) {
							gradeValue = 0;
						}
						totalPrice = (basePrice + gradeValue) * 2;
					}
				}
				else if(type.equals("BB%03d")) {
					if(status.equals("Outdoor")) {
						basePrice = 15000;
					}
					else if(status.equals("Indoor")) {
						basePrice = 10000;
					}
					if(grade.equals("A")) {
						gradeValue = 5000;
					}
					else if(grade.equals("B")) {
						gradeValue = 2000;
					}
					else if(grade.equals("C")) {
						gradeValue = 0;
					}
					totalPrice = (basePrice + gradeValue) * ringHeight;
				}
				newTransaction.add();
				System.out.println("Successfully added! [press enter]");
			}
			
			else if(menu==2) {
				if(Transaction.isEmpty()) {
					System.out.println("No Transaction..");
					System.out.println("Please enter to continue..");
				}
				else {
					view();
				}
			}
			
			else if(menu==3){
				if(Transaction.isEmpty()) {
					System.out.println("No Transaction to Delete..");
					System.out.println("Please enter to continue..");
				}
				else {
					delete();
				}
			}
			
		}while(menu!=4);
	}

	public void initialData() {
		try {
			ResultSet result1 = connect.executeQuery("Select * From FutsalField;");
			while(result1.next()) {
				FutsalField ff = new FutsalField(result1.getString("fieldID"), result1.getString("grade"), result1.getString("status"), result1.getString("type"));
				newTransaction.add(ff);
			}
		} 
		ResultSet result2 = connect.executeQuery("Select * From BasketballField;");
			while(result2.next()) {
				BasketField bf = new BasketField(result2.getString("fieldID"), result2.getString("grade"), result2.getString("status"), result2.getString("ringHeight"));
				newTransaction.add(bf);
			}
		catch (Exception e) {
				
		}
	} 
	
	public void view() {
		int row = 1;
		System.out.println("%-2s | %-5s | %-5s | %-5s | ");
	}
	
	public void delete() {
		
	}
}
