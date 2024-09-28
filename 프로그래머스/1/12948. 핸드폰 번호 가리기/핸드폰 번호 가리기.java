class Solution {
    public String solution(String phone_number) {
        int start = phone_number.length() - 4;
        
        String four_num = phone_number.substring(start, phone_number.length());
        String num = "*";
        
        
        return num = num.repeat(start) + four_num;
    }
}