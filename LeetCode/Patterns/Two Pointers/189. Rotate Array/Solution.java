class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        
    }

    public static void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // int[] n = new int[nums.length];
        // for(int i = 0;i<nums.length;i++){
        //     n[(i+k)%nums.length]=nums[i];
        // }
        // for(int i = 0 ;i<nums.length;i++){
        //     nums[i]=n[i];
        // }
}