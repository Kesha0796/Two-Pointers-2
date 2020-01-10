class Solution {
    public int removeDuplicates(int[] nums) {
        int s=0;
        int f=1;
        boolean flag=false;
        while(f<nums.length)
        {
            if(nums[s]==nums[f])
            {
                if(!flag)
                {
                    flag=true;
                    s++;
                    nums[s]=nums[f];
                    f++;
                }
                else
                {
                    while(f<nums.length && nums[f]==nums[f-1])
                        f++;
                }
            }
            else
            {
                    flag=false;
                    s++;
                    nums[s]=nums[f];
                    f++;
            }
        }
        return s+1;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)