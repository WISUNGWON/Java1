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
		BMW.carNum = 10; //같은 Car 클래스에 main 메서드가 존재하기 때문에, private로 선언된 carNum에 접근 가능 
		BMW.carName = "BMW200";
		
		BMW.showInfo();
		
	}
}

