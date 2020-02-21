
import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	String[] participant = 	{"leo", "kiki", "eden"};
	String[] completion = {"eden", "kiki"};
	Solution s1 = new Solution();
	System.out.println(s1.solution(participant, completion));

	
 }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = ""; //완주하지 못한 선수 
        for (int i = 0; i < participant.length; i++){
            for (int j = 0; j < completion.length; j++){
                if (participant[i].equals(completion[j])){
                	participant[i] ="";
                } else answer = participant[i];
            }
        }
        return answer;
    }
}







