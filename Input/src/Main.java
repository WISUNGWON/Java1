
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println(solution("PoooPyy"));
}

private static boolean solution (String s) {
    boolean answer = true;
    s = s.toUpperCase(); //문자열을 대문자로 세팅 
    String[] arr; 
    arr = s.split("");//문자열의 요소를 하나하나 넣어줄 배열 만들고
    int cntP = 0;
    int cntY = 0; //y와 p의 대수를 count할 변수 만들어주고 
    
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[0] == Character.toString('P')); //왜 false가 나오는지 모르겠다.
    System.out.println(arr[0]);
     System.out.println(Character.toString('P'));
    
    for (int i = 0; i<s.length(); i++){ //요소를 하나하나 비교하여 p값과 y값 카운팅
        if (arr[i] == Character.toString('P')){
            cntP = cntP + 1;
        }
        else if (arr[i] ==Character.toString('Y')){
            cntY = cntY + 1;
        }
    }
     
    System.out.println(cntP);
    System.out.println(cntY);
    if (cntP == cntY){
        answer = true;
    } else answer = false;
    


    return answer;

 }

}

class Solution {
	
}