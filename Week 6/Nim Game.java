                     //Approach 1

class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;      // all the stones can be collected if it is not distributed in group of 4
    }
}


                // Approach 2

class Solution {
    public boolean canWinNim(int n) {
               if(n%4==0)
              {                             // if the number is  completely divisible by y return false
                return false;
        }
        return true;
}
}
