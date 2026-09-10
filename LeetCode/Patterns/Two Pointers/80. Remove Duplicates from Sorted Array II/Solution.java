class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2,j;
        for(j = 2;j<nums.length;j++)
        {
            if(nums[k-1] == nums[j])
            {
                if(nums[k-1] == nums[k-2])
                {
                    continue;
                }
                else
                {
                    nums[k++] = nums[j];
                }
            }
            else
            {
                nums[k++] = nums[j];
            }
        }
        
        return k;
    }
}