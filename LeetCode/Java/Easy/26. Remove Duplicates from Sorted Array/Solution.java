class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int count = 0,k=0;
        for(int i = 0;i<nums.length;i++)
        {
            int k1 = i+1;
            int j = i+1;
            for(;j<=(nums.length-1)-k;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
                else
                {
                    nums[k1++] = nums[j];
                }
            }
            k = nums.length - k1;
            
        }
        return nums.length-count;
    }
}