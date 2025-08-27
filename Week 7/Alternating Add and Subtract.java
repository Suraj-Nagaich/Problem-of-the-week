class Solution {
    public int alternateDigitSum(int n) {
        String str = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) - '0';                   // convert char to int
            if(i % 2 == 0) {
                sum += digit;                                 // add digits at even indices
            } else {
                sum -= digit;                                 // subtract digits at odd indices
            }
        }
        return sum;
    }
}
