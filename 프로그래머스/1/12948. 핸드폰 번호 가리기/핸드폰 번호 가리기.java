class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length() - 4;
        String startNumber = "*".repeat(length);
        String endNumber = phone_number.substring(length);
        return startNumber+endNumber;
    }
}