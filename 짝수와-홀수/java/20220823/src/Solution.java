class Solution {
    public String solution(int num) {
        String answer = "";

        if(num%2==0 || num == 0){
            answer = "Even";
        }

        if(num%2==1 || num%2==-1){
            answer = "Odd";
        }

        return answer;
    }
}
