//https://programmers.co.kr/learn/courses/30/lessons/42577?language=java

import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
    	boolean answer = true;
    	HashMap<String, String> hashmap = new HashMap<String, String>();
    	
    	for(int i = 0; i<phone_book.length; i++) {
    		hashmap.put(phone_book[i], "prefix");
    	}
    	for(String phone : phone_book) {
    		for(int idx=0; idx<phone.length(); idx++) {
    			if(hashmap.containsKey(phone.substring(0, idx))) {
    				answer = false;
    			}
    		}
    	}
		return answer;
    }
}
