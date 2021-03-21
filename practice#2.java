//https://programmers.co.kr/learn/courses/30/lessons/42840

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] totalanswer = new int[3];
        ArrayList<Integer> arraylist = new ArrayList<Integer>();

        for(int i=0; i<answers.length; i++){

            if(student1[i%5] == answers[i]) {
                totalanswer[0]++;
            }
            if(student2[i%8] == answers[i]) {
                totalanswer[1]++;
            }
            if(student3[i%10] == answers[i]) {
                totalanswer[2]++;
            }
        }

        int max = totalanswer[0];
        int maxnum = 0;
        for(int i=0; i<totalanswer.length; i++) {
            if(totalanswer[i] >= max) {
                max = totalanswer[i];
                maxnum = i;
            }
        }

        for(int i=0; i<totalanswer.length; i++) {
            if(totalanswer[i] == max)
            {
                arraylist.add(i+1);
            }
        }

        int[] answer = new int[arraylist.size()];
        for(int i=0; i<arraylist.size(); i++) {
            answer[i] = arraylist.get(i);
        }

        Arrays.sort(answer);
        
        return answer;

    }
}
