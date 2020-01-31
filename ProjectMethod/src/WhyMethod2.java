//왜 메서드에 매개변수(parameter)가 필요할까?

public class WhyMethod2 {

	public static void printTwoTimesA() {
		
		  System.out.println("_");
		  System.out.println("A");
		  System.out.println("A");
		
	}
	
	//2-1) 매개변수가 존재하여 인자값을 받는 메서드
	public static void printTwoTimes(String text) {
		
		  System.out.println("_");
		  System.out.println(text);
		  System.out.println(text);
	}
	
	//3-1) 매개변수가 2개인 메소드                            //매개변수 parameter
	public static void printTwoTimes1(String text, String delimiter) {
		
		  System.out.println(delimiter);
		  System.out.println(text);
		  System.out.println(text);
	}
	
	
	public static void main(String[] args) {
		
		printTwoTimesA();
		/*1)위 코드의 아쉬운점은 B를 출력하고 싶을 때 밑에처럼,
		 public static void printTwoTimesB() {
		
		  System.out.println("_");
		  System.out.println("B");
		  System.out.println("B");
		  
		 같은 메소트를 하나 더 만들어 줘야 한다는 것이고 C를 출력하고 싶을 때도 ...Z를 출력하고 싶을 때도 마찬가지이다.
		 */
					//인자, argument (메서드 안에 주입한 구체적인 값) 
		printTwoTimes("B");
		printTwoTimes("C");
		/*
		 * 2) 이럴때 입력 값이 존재하는 메소드(2-1)를 생성해 주면, 새로 메소드를 만들 필요 없이
		 * 메서드에 인자값을 넣어주어  원하는 값을 얻을 수 있다
		 */
		
		//3) 매개변수가 2개인 메소드도 생산가능
		printTwoTimes1("D", "-");
   }

}
