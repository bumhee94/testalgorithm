class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        answer = num1 != num2 ? -1 :  1;
        return answer;
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/120807 

class Solution {
    public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
}

https://school.programmers.co.kr/learn/courses/30/lessons/1293  