class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int low = 0;
        int high = (int)1e9;
        int ans = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        while(low<=high)
        {
            int mid = low+ (high-low)/2;
            System.out.println(mid);
            if(isPossible(houses,heaters,mid))
            {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    boolean isPossible(int houses[], int heaters[], int radius)
    {
        int n = houses.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            while(j<heaters.length && (houses[i]<heaters[j]-radius ||
                houses[i]>heaters[j]+radius)
            )
                j++;
            if(j==heaters.length)
                return false;
        }
        return true;
    }
}
