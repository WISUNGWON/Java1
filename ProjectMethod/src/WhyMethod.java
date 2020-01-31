// 왜 메서드를 사용할까?
public class WhyMethod {
	
	public static void printTwoTimesA() {
		
		 //함수로 만들고 싶은 코드 드래그 -> Refactor -> Method를 만들면 더 편하게 만들 수 있다.
		  System.out.println("_");
		  System.out.println("A");
		  System.out.println("A");
		
	}
	public static void main(String[] args) {
		
		// 1억줄
		/*System.out.println("_");
		  System.out.println("A");
		  System.out.println("A");
		  */
		
		// 1억줄짜리 코드와 결과는 같지만, 간단히 표현할 수 있게 됨.
		printTwoTimesA();
	}

	
}
