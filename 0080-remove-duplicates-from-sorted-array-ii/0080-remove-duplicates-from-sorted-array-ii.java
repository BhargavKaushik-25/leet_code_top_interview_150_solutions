class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0, count = 1;
        for(int i =1 ;i<nums.length;i++){
            if(nums[j]==nums[i]){
                if(count<2){
                    nums[++j]=nums[i];
                    count++;
                }
            }else{
                nums[++j]=nums[i];
                count = 1;
            }
        }
        return j+1;
    }
}