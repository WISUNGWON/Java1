
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println(solution("PoooPyy"));
}

private static boolean solution (String s) {
    boolean answer = true;
    s = s.toUpperCase(); //���ڿ��� �빮�ڷ� ���� 
    String[] arr; 
    arr = s.split("");//���ڿ��� ��Ҹ� �ϳ��ϳ� �־��� �迭 �����
    int cntP = 0;
    int cntY = 0; //y�� p�� ����� count�� ���� ������ְ� 
    
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[0] == Character.toString('P')); //�� false�� �������� �𸣰ڴ�.
    System.out.println(arr[0]);
     System.out.println(Character.toString('P'));
    
    for (int i = 0; i<s.length(); i++){ //��Ҹ� �ϳ��ϳ� ���Ͽ� p���� y�� ī����
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