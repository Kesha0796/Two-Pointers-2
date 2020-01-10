class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0)
            return;
        int s=m-1,f=n-1,i=n+m-1;
        while(s>=0 && f>=0)
        {
            if(nums1[s]>nums2[f])
            {
                nums1[i]=nums1[s];
                i--;
                s--;
            }
            else
            {
                nums1[i]=nums2[f];
                i--;
                f--;
            }
        }
        while(f>=0)
        {
            nums1[i]=nums2[f];
            f--;
            i--;
        }
    }
}

// Time Complexity: O(n+m) --> O(n) 
// Space Complexity: O(1)