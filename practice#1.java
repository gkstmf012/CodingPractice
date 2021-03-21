import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++) {
            String tmp = participant[i];
            if(!tmp.equals(completion[i])) {
                answer = tmp;
                break;
            }
        }
        
        if(answer == "") {
            return participant[participant.length-1];     
        }
        else {
            return answer;
        }
    }
}
