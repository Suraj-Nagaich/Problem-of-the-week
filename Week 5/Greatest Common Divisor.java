class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0] , max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(min > nums[i]){                           
                min = nums[i];
            }                                              // binary search approach
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return gcd(nums , min , max);
    }
    public int gcd(int[] arr , int a  , int b){
        int min = a;
        while(min > 1){
            if((a % min == 0) && (b % min == 0)){          // base case for GCD
                return min;
            }
            min--;
        }
        return min;
    }
}
