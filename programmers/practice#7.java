https://programmers.co.kr/learn/courses/30/lessons/12916

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int Pcnt = 0;
        int Ycnt = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                Pcnt++;
            }
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                Ycnt++;
            }
        }
        System.out.println(Pcnt + " - " + Ycnt);
        if(Pcnt != Ycnt) answer = false;

        return answer;
    }
}
