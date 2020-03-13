package classpart;

public class Order {
	
	long OrderNumber;
	String ID;
	String Date;
	String Name;
	String OrderID;
	String Address;
	
	void showInfo () {
		
		System.out.println("OrderNumber : " + OrderNumber);
		System.out.println("ID : " + ID);
		System.out.println("Date : " + Date);
		System.out.println("Name : " + Name);
		System.out.println("OrderID : " + OrderID);
		System.out.println("Address : " + Address);
		
	}

}
