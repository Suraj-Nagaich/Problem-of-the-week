class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int elements:nums)
        {
            if(elements>0)
            {
                set.add(elements);
            }
        }
        int small=1;
        while(set.contains(small))
        {
            small++;
        }
        return small;
    }
}
