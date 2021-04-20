https://programmers.co.kr/learn/courses/30/lessons/12906

import java.util.*;

public class Solution {
    	public int[] solution(int []arr) {
        int[] arrTemp = new int[arr.length];
        int temp = -1, su = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] != temp) {
        		arrTemp[su++] = arr[i];
        		temp = arr[i];
        	}
        }
        int[] answer = new int[su];
        for(int i = 0; i<answer.length; i++) {
        	answer[i] = arrTemp[i];
        }
        return answer;
	}
}
