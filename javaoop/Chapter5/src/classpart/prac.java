package classpart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prac {
	
	static int number = 10;
	public static void main(String[] args) {
		
		// Object�� ������������ �������� �� �ٲٱ�
		
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
		number = num; //static���� ����ȴٸ� �⺻�ڷ����� ���� scope�� ���Ͽ� �ٲ� �� �մ�.
		System.out.println(number);
	}

}
