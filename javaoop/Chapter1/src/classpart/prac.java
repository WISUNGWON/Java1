package classpart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prac {
	
  public static void main(String[] args) {
	  
	  
	  String str = "Hello world"; // 가비지 값이 됨.
	  System.out.println(System.identityHashCode(str));
	  str += "2";
	  System.out.println(System.identityHashCode(str));
	  System.out.println(str);
  }


}
