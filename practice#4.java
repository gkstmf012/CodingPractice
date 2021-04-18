https://programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int answer = 0;
        int index = people.length - 1;
        for(int i = 0; i<=index; i++, answer++)
            while(index > i && people[i] + people[index--] > limit)
                answer++;
        return answer;
    }
}
