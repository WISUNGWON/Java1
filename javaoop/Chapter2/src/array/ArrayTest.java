package array;

public class ArrayTest {

    public static void main(String[] args) {
        
        //1. 선언과 동시에 초기화
        int[] arr = new int[] {1, 2, 3};
        
        //2. 선언과 동시에 초기화(new 생략)
        int[] arr2 = {1, 2, 3, 4};
        
        //3. 선언 후 초기화는 불가능하다
        int[] arr3;
        //arr = {1, 2, 3, 4]; error
        
        //4. 배열 선언
        int[] arr4 = new int[10]; //선언시에 크기를 정해준다.
        
        //5. for문을 이용한 배열에 element 넣기
        for (int i = 0, num = 1; i < arr4.length; i++, num++) {
            arr4[i] = num;
        }
        
        //6. for문을 이용한 배열의 element 출력
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
            
        }
        
        //7. for문을 이용한 배열의 합 구하기
        int total = 0;
        for (int i = 0; i < arr4.length; i++) {
            total += arr4[i];
        }
        
        System.out.println(total);
        
        //8. 대문자 A-Z를 배열에 저장하고 다시 출력
        char[] arrAlpha = new char[26];
        char ch = 'A';
        for (int i = 0; i < arrAlpha.length; i++) {
            arrAlpha[i] = ch++;
        }
        
        for (int i = 0; i < arrAlpha.length; i++) {
            System.out.print(arrAlpha[i] + " ");
        }
        
        String arr6 = "1";
        
        int a = Integer.parseInt(arr6);
    }

}
