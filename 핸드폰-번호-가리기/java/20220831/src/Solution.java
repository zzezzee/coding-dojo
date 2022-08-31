class Solution {
    public String solution(String phone_number) {
        StringBuilder number = new StringBuilder(phone_number);

        for (int i = phone_number.length()-4; i > 0; i -= 1) {
            number.setCharAt(i-1, '*');
        }

        return number.toString();
    }
}