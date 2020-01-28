//데이터 타입의 변환
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		System.out.println(b); // 1.0 : int값은 1이 자동으로 double로 converting 됨
		
	//	int c = 1.1; can't convert from double to int 
		double d = 1.1;
		int e = (int) 1.1; //double값 1.1을 강제로(명시적으로) int로 바꿈 
		System.out.println(e);
		
		// int to String
		String f = Integer.toString(1);
		System.out.println(f.getClass());
		
	}

}

/*
 * 손실이 일어날 경우 명시적으로 테이터 타입을 변환해야 한다.
 * ex) double값인 1.1을 int 값인 1로 바꿀 경우 0.1의 손실이 일어난다 
 * 프로그램은 0.1의 손실을 막기 위해 자동적으로 테이터 값을 변환시키지 않고 에러를 발생시킨다
 * 이런 경우 테이터 타입을 변경하기 위해서는 명시적으로 바꾸어야 한다.
 */


/*
 * Casting이란?
 * 데이터 타입을 미리 정의하는 Java의 경우 변수의 데이터타입을 변환(convert)할 경우
 * 이전 데이터 타입으로부터 바꾸려는 데이터 타입으로 이전(casting)이라고 한다.
 * Casting을 하기 위해서는 인터넷에 검색하면 여러가지 데이터 타입을 변환시키는 자료들이
 * 나오므로 참고하자 
 */
*/