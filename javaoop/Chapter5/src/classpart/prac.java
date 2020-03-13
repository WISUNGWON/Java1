package classpart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prac {
	
	static int number = 10;
	public static void main(String[] args) {
		
		// Object로 지역변수에서 전역변수 값 바꾸기
		
		List<String> listArgument = new ArrayList<>();
		listArgument.add("!");
		listArgument.add("@#$");
		
		print(listArgument);
		System.out.println(listArgument);
		
		
		
		print2(50);
		System.out.println(number);
		

	}
	
	
	public static void print (List<String> listParam) {
		String value = listParam.get(0);
		listParam.add("i12o");
		System.out.println(value);
	}
	
	public static void print2 (int num) {
		number = num; //static으로 선언된다면 기본자료형도 값이 scope에 의하여 바뀔 수 잇다.
		System.out.println(number);
	}

}
