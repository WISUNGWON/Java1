package constructor;


public class Car {
	
	private int carNum;
	String carName;
	
	public Car () {}
	
	public Car (int num, String name) {
		carNum = num;
		carName = name;
	}
	
	public void showInfo () {
		System.out.println(carNum);
		System.out.println(carName);
	}
	public static void main(String[] args) {
		
		Car BMW = new Car();
		BMW.carNum = 10; //���� Car Ŭ������ main �޼��尡 �����ϱ� ������, private�� ����� carNum�� ���� ���� 
		BMW.carName = "BMW200";
		
		BMW.showInfo();
		
	}
}

